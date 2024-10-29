public class BeachCleanup {

    public void cleanBeach(int[] beach) {
        for (int i = 0; i < beach.length; i++) {
            if (beach[i] == 1) {
                beach[i] = 0;
            }
        }
    }

    public void displayBeach(int[] beach) {
        for (int section : beach) {
            System.out.print(section + " ");
        }
        System.out.println();
    }
}
