import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long length = scanner.nextLong();
        long width = scanner.nextLong();
        double tileLength = scanner.nextDouble();
        double numRequiredTiles =  (Math.ceil(length/tileLength) * Math.ceil(width/tileLength));
        System.out.println((long) (numRequiredTiles));
    }
}
