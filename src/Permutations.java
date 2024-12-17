import java.util.Scanner;

public class Permutations {
    /**
     * A permutation of integers 1,2,...,n is called beautiful if there are
     * no adjacent elements whose difference is 1.
     * Given n, construct a beautiful permutation if such a permutation exists.
     * Constraints 1 <= n <= 10^6
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==3 || n == 2) System.out.println("NO SOLUTION");
        else {
            for(int i=2; i<=n; i=i+2) System.out.print(i + " ");
            for(int i=1; i<=n; i=i+2) System.out.print(i + " ");
        }
    }
}
