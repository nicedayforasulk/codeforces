import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        String canDivideInTwo = "NO";
        if(weight > 2 && (weight - 2) % 2 == 0){
            canDivideInTwo = "YES";
        }
        System.out.println(canDivideInTwo);
    }
}
