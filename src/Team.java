import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProblems = scanner.nextInt();
        int totalSolvableProblems = 0;
        for(int i = 0; i < numProblems; i++){
            int canSolve = 0;
            for(int j = 0; j < 3; j++){
                canSolve += scanner.nextInt();
            }
            if(canSolve >= 2){
                totalSolvableProblems++;
            }
        }
        System.out.println(totalSolvableProblems);
    }
}
