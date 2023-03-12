public class Game {
    private String title;
    private Genre genre;
    private Double price;
    private Integer copiesSold;

    public Game(String title, Genre genre, Double price, Integer copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
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

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + String.format("%.2f", price) +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public void incrementPrice() {
        setPrice(price + 5);
    }


}
