import java.util.*;

public class MinimumDaysBouquets {

    // Function to check if we can make m bouquets in 'days' days
    private static boolean canMakeBouquets(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= days) {
                flowers++;
                if (flowers == k) { // One bouquet made
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // Reset if flower not bloomed
            }
        }
        return bouquets >= m;
    }

    // Main function to find minimum days
    public static int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers = (long) m * k;
        if (totalFlowers > bloomDay.length) {
            return -1; // Not enough flowers
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        // Find min and max bloom days
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                result = mid;
                right = mid - 1; // Try smaller days
            } else {
                left = mid + 1; // Need more days
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of flowers: ");
            int n = sc.nextInt();
            int[] bloomDay = new int[n];

            System.out.println("Enter bloom days:");
            for (int i = 0; i < n; i++) {
                bloomDay[i] = sc.nextInt();
            }

            System.out.print("Enter m (bouquets needed): ");
            int m = sc.nextInt();

            System.out.print("Enter k (flowers per bouquet): ");
            int k = sc.nextInt();

            int result = minDays(bloomDay, m, k);
            if (result == -1) {
                System.out.println("Not enough flowers to make the bouquets.");
            } else {
                System.out.println("Minimum days required: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
