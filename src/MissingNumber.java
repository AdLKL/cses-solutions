import java.util.Scanner;

public class MissingNumber {
    // You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.
    // Constraints 2 <= n <= 2*10^5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sumWithoutMissing = 0;
        for(int i=0; i<n-1; i++) {
            sumWithoutMissing += sc.nextInt();
        }
        long sumWithMissing = n *(n+1)/2;
        System.out.print(sumWithMissing - sumWithoutMissing);
    }
}
