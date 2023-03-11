import java.util.Comparator;

public class Game {
    private String title;
    private Enum genre;
    private Double price;
    private Integer copiesSold;

    public Game(String title, Enum genre, Double price, Integer copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getGenre() {
        return genre;
    }

    public void setGenre(Enum genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(Integer copiesSold) {
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public void printGame() {
        System.out.println("Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}');
    }

    static class Sortbytitle implements Comparator<Game> {
        public int compare(Game a, Game b) {
            return a.title.compareTo(b.title);
        }
    }
}
