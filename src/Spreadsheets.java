import java.util.Scanner;

public class Spreadsheets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();

        for(int i = 0; i < numTests; i++){
            String coordinate = scanner.next();
            System.out.println(getAnalog(coordinate));
        }

    }

    private static String getAnalog(String coordinate) {
        if(coordinate.length() >= 4 && coordinate.charAt(0) == 'R' && coordinate.contains("C") && coordinate.charAt(1) > '0' && coordinate.charAt(1) <= '9'){
            return convertToAA(coordinate);

        }
        return convertToRC(coordinate);

    }

    private static String convertToRC(String coordinate) {
        //BC23 -> R23C55
        int i = 0;
        while(i < coordinate.length() && isChar(coordinate.charAt(i))){
            i++;
        }

        return String.format("R%sC%s", coordinate.substring(i), getColumnNumber(coordinate.substring(0,i)));
    }

    private static String getColumnNumber(String s) {
        int num = 0;
        for(int i = 0 ; i < s.length(); i++){
            num = (num * 26) + (s.charAt(i) - 'A' + 1);
        }
        return "" + num;
    }

    private static String convertToAA(String coordinate) {
        //R23C55 -> BC23
        String rowPart = coordinate.substring(0, coordinate.indexOf("C"));
        String colPart = coordinate.substring(coordinate.indexOf("C"));

        return computeSpreadSheetCol(colPart.substring(1)) + rowPart.substring(1);
    }

    private static String computeSpreadSheetCol(String s) {
        int num = Integer.parseInt(s);
        StringBuilder spreadsheetString = new StringBuilder();
        while(num!= 0){
            int rem = num % 26;
            if(rem == 0){
                rem = 26;
            }
            spreadsheetString.append((char)('A' + rem - 1));
            num = (num-rem) / 26;
        }
        return spreadsheetString.reverse().toString();
    }

    private static boolean isChar(char c){
        return c >= 'A' && c <= 'Z';
    }
}
