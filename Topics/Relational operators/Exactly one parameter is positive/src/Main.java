import java.util.Scanner;


class Main {
    public static void toPrint(String args){
        System.out.println(args);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int zero = 0;

        boolean aInt = a > zero;
        boolean bInt = b > zero;
        boolean cInt = c > zero;

        if (aInt && bInt) {
            toPrint("false");
            return;
        };
        if (bInt && cInt) {
            toPrint("false");
            return;
        };
        if (aInt && cInt) {
            toPrint("false");
            return;
        };

        if (aInt || bInt || cInt) {
            toPrint("true");
            return;
        }

        toPrint("false");

    }

}
