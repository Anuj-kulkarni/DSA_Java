import java.util.*;

public class KokoEatingBananas {

    // Function to check if Koko can eat all bananas at speed 'speed' within 'h' hours
    private static boolean canEatAll(int[] piles, int speed, int h) {
        long hoursNeeded = 0; // Use long to avoid overflow for large piles
        for (int pile : piles) {
            // Ceiling division: (pile + speed - 1) / speed
            hoursNeeded += (pile + speed - 1) / speed;
            if (hoursNeeded > h) return false; // Early exit if already exceeding hours
        }
        return hoursNeeded <= h;
    }

    // Main function to find minimum eating speed
    public static int minEatingSpeed(int[] piles, int h) {
        if (piles == null || piles.length == 0 || h <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int left = 1; // Minimum possible speed
        int right = Arrays.stream(piles).max().getAsInt(); // Max pile size
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) {
                result = mid; // Possible answer, try smaller speed
                right = mid - 1;
            } else {
                left = mid + 1; // Need faster speed
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of piles: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number of piles must be positive.");
                return;
            }

            int[] piles = new int[n];
            System.out.println("Enter pile sizes:");
            for (int i = 0; i < n; i++) {
                piles[i] = sc.nextInt();
                if (piles[i] <= 0) {
                    System.out.println("Pile sizes must be positive.");
                    return;
                }
            }

            System.out.print("Enter total hours (h): ");
            int h = sc.nextInt();

            int minSpeed = minEatingSpeed(piles, h);
            System.out.println("Minimum eating speed: " + minSpeed);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
