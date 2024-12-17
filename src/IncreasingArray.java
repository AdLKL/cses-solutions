import java.util.Scanner;

public class IncreasingArray {
    /**
     * You are given an array of n integers. You want to modify the array so that it is increasing,
     * i.e., every element is at least as large as the previous element.
     * On each move, you may increase the value of any element by one. What is the minimum number of moves required?
     * Constraints : 1 <= n <= 2*10^5 (size)  1 <= xi <= 10^9 (contents)
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(minMoves(arr));
    }

    private static long minMoves(int[] arr) {
        long res = 0;
        for(int i=1; i<arr.length; i++) {
            int diff = arr[i-1] - arr[i];
            if(diff > 0) {
                res += diff;
                arr[i] = arr[i-1];
            }
        }
        return res;
    }
}
