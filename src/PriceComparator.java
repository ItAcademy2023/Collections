import java.util.Comparator;

class PriceComparator implements Comparator<Game> {
    public int compare (Game a, Game b){
        return (int) (a.getPrice() - b.getPrice());
    }
}
