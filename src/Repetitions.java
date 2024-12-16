import java.util.Scanner;

public class Repetitions {
    /**
     * You are given a DNA sequence: a string consisting of characters A, C, G, and T.
     * Your task is to find the longest repetition in the sequence. This is a maximum-length
     * substring containing only one type of character.
     * Constraints : 1 <= n <= 10^6
     */

    // => The first impression is to use a simple sliding window to check it
    // TIME : O(n)  &  SPACE : O(1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.next();
        System.out.print(longestSub(dna));
    }

    private static int longestSub(String dna) {
        if(dna.length() == 1) return 1;
        int left = 0, right = 0;
        int max = 0;
        while(right < dna.length()) {
            if(dna.charAt(right) == dna.charAt(left)) {
                right++;
            }else {
                max = Math.max(max, right - left);
                left = right;
            }
        }
        max = Math.max(max, right - left);
        return max;
    }
}
