public class Fibonacci {

    public static void main(String[] args){
        System.out.println(mojFibonacci(10));

}
    public static int mojFibonacci(int n) {
        int a = 0;
        int b = 1;
        int result = 0;

        while (n != 0) {
            result = a + b;
            b = a;
            a = result;
            System.out.println(result);
            n--;
        }
        return result;
    }
}
