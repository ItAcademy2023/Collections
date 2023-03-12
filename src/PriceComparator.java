import java.util.Comparator;
import java.util.Scanner;

public class PriceComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        return 0;
    }

    @Override
    public Comparator<String> reversed() {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        return Comparator.super.reversed();
    }
}
