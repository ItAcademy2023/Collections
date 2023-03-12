import java.util.Objects;

public class Game {

    private String title;
    private Genre genre;
    private double price;
    private int copiesSold;

    public Game(String title, Genre genre, double price, int copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public double incrementPrice() {
        return this.price + 0.5;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(game.price, price) == 0 && copiesSold == game.copiesSold && Objects.equals(title, game.title) && genre == game.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, price, copiesSold);
    }
}
