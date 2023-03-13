public class PriceComparator implements java.util.Comparator<Game> {

    @Override
    public int compare(Game a, Game b) {
        return (int) (a.getPrice() - b.getPrice());

    }
}
