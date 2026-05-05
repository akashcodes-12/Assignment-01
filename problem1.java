import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        String str = s + s; 

        Set<Character> set = new HashSet<>();
        int left = 0, sum = 0, maxSum = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            
            while (set.contains(ch) || (right - left) >= n) {
                char leftChar = str.charAt(left);
                set.remove(leftChar);
                sum -= (leftChar - 'a' + 1);
                left++;
            }

            set.add(ch);
            sum += (ch - 'a' + 1);

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}