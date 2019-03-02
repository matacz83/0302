import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        double fib[] = new double [1000];

        System.out.print("Podaj ile liczb ciągu Fibonacciego mam pokazać: ");
        Scanner skan = new Scanner(System.in);
        int liczba = skan.nextInt();

        fib[0] = 1;
        fib[1] = 1;
        System.out.println("Liczba 1 wynosi " + (int)fib[0] + "\n" + "\n" + "Liczba 2 wynosi " + (int)fib[1] + "\n");

        for (int i = 2; i < liczba; i++){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println("Liczba " + (i+1) + " wynosi " + (int)fib[i] + "\n");
        }
        System.out.println("Złota liczba wynosi= " + fib[liczba-1] / fib[liczba-2]);
    }
}