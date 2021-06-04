import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int tileLength = scanner.nextInt();

        int numTilesToCoverLength = computeTilesRequired(length, tileLength);
        int numTilesToCoverWidth = computeTilesRequired(width, tileLength);

        System.out.println((long)numTilesToCoverLength * numTilesToCoverWidth);
    }

    private static int computeTilesRequired(int toCover, int tileLength) {
        int min = toCover/tileLength;
        if(toCover % tileLength == 0){
            return min;
        }
        return min + 1;
    }
}
