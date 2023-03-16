public class Game{
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

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": [Game: {Title: " + getTitle() + ", Genre: " + getGenre() + ", Price: " + getPrice() + ", Title: " + getTitle() + "}]";
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }
}
