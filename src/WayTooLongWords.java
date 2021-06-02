import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numWords = scanner.nextInt();
        for(int i = 0; i < numWords; i++){
            String word = scanner.next();
            if(word.length() > 10){
                word = computeShortened(word);
            }
            System.out.println(word);
        }
    }

    private static String computeShortened(String word) {
        int length = word.length();
        return "" + word.charAt(0) + (length - 2) + word.charAt(length-1);
    }
}