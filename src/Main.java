public class Main {
    public static void main(String[] args) {
        String input = "1기0기0니0";

        String[] tokens = input.split("기");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}