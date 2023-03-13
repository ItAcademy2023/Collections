import java.util.Comparator;

public class PriceComparator implements Comparator<Game> {
    public int compare(Game firstGame, Game secondGame){
        return Double.compare(firstGame.getPrice(), secondGame.getPrice());
    }

}
