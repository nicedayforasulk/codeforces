import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numEvents = scanner.nextInt();
        int[] events = new int[numEvents];
        for(int i = 0; i < numEvents; i++){
            events[i] = scanner.nextInt();
        }
        System.out.println(computeUntreatedCrimes(events));
    }

    private static int computeUntreatedCrimes(int[] events) {
        int untreatedCrimes = 0;
        int numAvailablePolice = 0;

        for(int i = 0; i < events.length; i++){
            int event = events[i];

            if(event == -1){
                if(numAvailablePolice > 0){
                    numAvailablePolice--;
                } else {
                    untreatedCrimes++;
                }
            } else {
                numAvailablePolice += event;
            }
        }
        return untreatedCrimes;
    }
}
