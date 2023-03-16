import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
 
        int result = checkDesk(group1) + checkDesk(group2) + checkDesk(group3);

        System.out.println(result);

        scanner.close();
    }

    private static int checkDesk(int people){
        int modulo = 2;
        return (people % modulo) + (people / modulo);
    }
 
}
