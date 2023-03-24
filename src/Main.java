import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secund = 5;
        int a = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        int b = scanner.nextInt();
        System.out.println(a+b);
        long time = System.currentTimeMillis()-startTime;
        System.out.println(time);
    }
}