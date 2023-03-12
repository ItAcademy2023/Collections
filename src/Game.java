public class Game {
   private String title;
    private double price;
  private   Genre genre;
   private int copiesSold;



    public Game(String title, double price, Genre genre, int copiesSold) {
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getCopiesSold() {
        return copiesSold;
    }
public void print() {
        System.out.println("Game{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                ", copiesSold=" + copiesSold +
                '}');
}

    public void setPrice(double price) {
        this.price = price;
    }

    public void incrementPrice(int increase){
     setPrice(getPrice()+increase);
    }

}
