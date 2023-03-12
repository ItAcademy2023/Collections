public class Game {
    private String title;
    private Double price;
    private Integer copiesSold;
    private Genre genre;

    public Game(String title, double price, Integer copiesSold, Genre genre) {
        this.title = title;
        this.price = price;
        this.copiesSold = copiesSold;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                ", genre=" + genre +
                '}';
    }

    public void print() {
        System.out.println(this);
    }

    public void incrementPriceBy(double increment) {
        price += increment;
    }
}
