import java.util.*;

public class SmallestDivisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sum(nums, mid) <= threshold) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    private static int sum(int[] nums, int divisor) {
        int total = 0;
        for (int num : nums) total += (num + divisor - 1) / divisor;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int threshold = sc.nextInt();
        System.out.println(smallestDivisor(nums, threshold));
    }
}
