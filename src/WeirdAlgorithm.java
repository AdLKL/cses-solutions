import java.util.Scanner;

public class WeirdAlgorithm {
    /**
     * Consider an algorithm that takes as input a positive integer n.
     * If n is even, the algorithm divides it by two, and if n is odd,
     * the algorithm multiplies it by three and adds one. The algorithm
     * repeats this, until n is one.
     * Constraints : 1 <= n <= 10^6
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n != 1) {
            System.out.print(n + " ");
            if(n %2 == 0) n /= 2;
            else n = 3*n + 1;
        }
        System.out.print(n);

    }
}
