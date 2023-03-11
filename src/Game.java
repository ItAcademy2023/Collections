public class Game {
    private String title;
    private Genre genre;
    private double price;
    private Integer copiesSold;

    public Game(String title, Genre genre, double price, Integer copiesSold) {
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

    public Integer getCopiesSold() {
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
                "} \n";
    }

    public void incrementPrice(double inc) {
        setPrice(getPrice() + inc);
    }
}
