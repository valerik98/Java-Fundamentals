    package RandomizeWords.TextProcessing;

    import java.util.Scanner;

    public class DigitsLettersAndOthers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    //        StringBuilder input = new StringBuilder(scanner.nextLine());
            String input = scanner.nextLine();
            StringBuilder diggits = new StringBuilder();
            StringBuilder letters = new StringBuilder();
            StringBuilder symbol = new StringBuilder();

            for (char currentSymbol : input.toCharArray()) {
                if (Character.isDigit(currentSymbol)) {
                    diggits.append(currentSymbol);
                } else if (Character.isLetter(currentSymbol)) {
                    letters.append(currentSymbol);
                } else {
                    symbol.append(currentSymbol);
                }

            }
            System.out.println(diggits);
            System.out.println(letters);
            System.out.println(symbol);
        }
    }
