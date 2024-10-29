import java.util.Scanner;
public class SeashellCollector {
    private int[] seashells;
    private String[] seashellTypes;
    public SeashellCollector(String[] types) {
        seashellTypes = types;
        seashells = new int[types.length];
    }
    public void collectSeashell(int index, int count) {
        if (index >= 0 && index < seashells.length) {
            seashells[index] += count;
        }
    }
    public void printTotalSeashells() {
        int total = 0;
        for (int seashell : seashells) {
            total += seashell;
        }
        System.out.println("Total seashells collected: " + total);
    }
    public void printSeashells() {
        for (int i = 0; i < seashells.length; i++) {
            System.out.println(seashellTypes[i] + ": " + seashells[i]);
        }
    }
}
