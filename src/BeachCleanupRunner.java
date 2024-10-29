public class BeachCleanupRunner {
    public static void main(String[] args) {
        int[] beach = {1, 0, 1, 1, 0, 1, 0, 1};

        BeachCleanup beachCleanup = new BeachCleanup();

        System.out.println("Before cleanup:");
        beachCleanup.displayBeach(beach);

        beachCleanup.cleanBeach(beach);

        System.out.println("After cleanup:");
        beachCleanup.displayBeach(beach);
    }
}
