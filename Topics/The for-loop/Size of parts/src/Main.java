import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int toShip = 0, toFactory = 0, toWithdraw = 0;

        for (int i = 0; i < n; i++) {
            int partSize = scanner.nextInt();

            if (partSize == 0) {
                toShip = ++toShip;
            } else if(partSize < 0) {
                toWithdraw = ++toWithdraw;
            } else {
                toFactory = ++toFactory;
            }
        }
        System.out.print(toShip + " " + toFactory + " " + toWithdraw);
    }
}