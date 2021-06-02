import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int tileLength = scanner.nextInt();

        System.out.println(Math.abs(Math.ceil(length/tileLength)*Math.ceil(width/tileLength)));
    }
}
