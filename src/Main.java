public class Main {
    public static void main(String[] args) {
        String input = "100";

        boolean result = validateTokenCount(input);

        if (result) {
            System.out.println("숫자 2개");
        }
    }

    public static boolean validateTokenCount(String tokens) throws NumberFormatException {
        if (tokens.length() != 2) {
            throw new NumberFormatException("숫자 2개가 아닙니다.");
        }

        return true;
    }
}