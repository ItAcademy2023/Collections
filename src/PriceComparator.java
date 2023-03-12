import java.util.Comparator;

public class PriceComparator implements Comparator<Game> {

    @Override
    public int compare(Game game1, Game game2) {
        return Double.compare(game1.getPrice(), game2.getPrice());
    }

    @Override
    public Comparator<Game> reversed() {
        return Comparator.super.reversed();
    }
}
