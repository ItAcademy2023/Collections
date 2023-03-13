import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
  private String title;
  private double price;
  private Genre genre;
  private int copiesSold;

  public Game (String title, double price, Genre genre, int copiesSold){
    this.title = title;
    this.price = price;
    this.genre = genre;
    this.copiesSold = copiesSold;

  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public Genre getGenre() {
    return genre;
  }

  public int getCopiesSold() {
    return copiesSold;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public void setCopiesSold(int copiesSold) {
    this.copiesSold = copiesSold;
  }
  public double incrementPrice(){
    return this.price + 2.50;
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

}
