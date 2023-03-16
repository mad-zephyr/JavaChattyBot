import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String postfix = "burg";
        boolean isBurg = name.endsWith(postfix);

        System.out.println(isBurg);
    }
}