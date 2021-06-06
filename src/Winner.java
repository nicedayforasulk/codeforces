import java.util.*;
import java.util.stream.Collectors;

public class Winner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();

        HashMap<String, Round> map = new HashMap<>();
       for(int i = 0; i < n; i++){

            String name = scanner.next();
            int score = scanner.nextInt();

            Round saved = map.getOrDefault(name, new Round(name, 0, 0, new ArrayList<>()));
            saved.score += score;
            saved.round = i;
            saved.pastScores.add(List.of(saved.score, i));
            map.put(name, saved);

        }

       List<Round> list = map.values().stream().sorted((a,b) -> {
           int aReached = 2000, bReached = 2000;
           if(a.score == b.score){
               for(int i = 0; i < a.pastScores.size(); i++){
                   if(a.pastScores.get(i).get(0) >= a.score){
                       aReached = a.pastScores.get(i).get(1);
                       break;
                   }
               }
               for(int i = 0; i < b.pastScores.size(); i++){
                   if(b.pastScores.get(i).get(0) >= a.score){
                       bReached = b.pastScores.get(i).get(1);
                       break;
                   }
               }

               return aReached - bReached;
           }
           return b.score - a.score;
     }).collect(Collectors.toList());

       System.out.println(list.get(0).name);
    }
}

class Round{
    String name;
    int score;
    int round;
    List<List<Integer>> pastScores;

    public Round(String name, int score, int round, List<List<Integer>> pastScores){
        this.name = name;
        this.score = score;
        this.round = round;
        this.pastScores = pastScores;
    }
}