public class Game {
    private final String title;
    private final Enum Genre;
    private double price;
    private int copiesSold;

    public Game(String title, Enum genre, Double price, Integer copiesSold) {
        this.title = title;
        Genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void incrementPrice(double amount) {
        setPrice(getPrice() + amount);
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", Genre=" + Genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }


}
