import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for(int i = start; i <= end; ++i) {
            String word = i % 3 == 0 && i % 5 == 0
                ? "FizzBuzz"
                : i % 3 == 0
                ? "Fizz"
                : i % 5 == 0
                ? "Buzz"
                : Integer.toString(i);
            console(word);
        }
    }

    public static void console(String word) {
        System.out.println(word);
    }
}