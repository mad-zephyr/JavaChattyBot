import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        
        int hours2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt(); 

        int first = hourToSec(hours1) + minToSec(min1) + sec1;
        int second = hourToSec(hours2) + minToSec(min2) + sec2;
        System.out.println(second - first);
    }

    private static int hourToSec(int args) {
        return args * 3600;
    }

    private static int minToSec(int args) {
        return args * 60;
    }
}
