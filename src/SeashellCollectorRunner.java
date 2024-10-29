import java.util.Scanner;

public class SeashellCollectorRunner {
    public static void main(String[] args) {
        String[] types = {"Conch", "Scallop", "Clam", "Oyster"};
        SeashellCollector collector = new SeashellCollector(types);

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter the type of seashell to collect (0 for Conch, 1 for Scallop, 2 for Clam, 3 for Oyster) or 'exit' to quit:");
            input = scanner.next();
            if (!input.equals("exit")) {
                try {
                    int index = Integer.parseInt(input);
                    System.out.println("Enter the number of seashells to collect:");
                    int count = scanner.nextInt();
                    collector.collectSeashell(index, count);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        } while (!input.equals("exit"));

        collector.printSeashells();
        collector.printTotalSeashells();
    }
}
