import java.util.Comparator;

public class PriceComparator implements Comparator<Game> {
    @Override
    public int compare(Game g1, Game g2) {
        // Compare games by price
        return Double.compare(g1.getPrice(), g2.getPrice());
    }
}