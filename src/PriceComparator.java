import java.util.Comparator;

public class PriceComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
