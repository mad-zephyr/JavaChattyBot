import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        short n1 = 1;
        short n2 = 2;
        short n3 = 3;
        int result = ((n + n1) * n + n2) * n + n3;
        System.out.println(result);
    }
}
