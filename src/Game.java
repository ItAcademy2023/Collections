public class Game {
    private String title;
    private Genre gendre;
    private Double price;
    private Integer copiesSold;

    public Game(String title, Genre gendre, Double price, Integer copiesSold) {
        this.title = title;
        this.gendre = gendre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGendre() {
        return gendre;
    }

    public void setGendre(Genre gendre) {
        this.gendre = gendre;
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
                ", genre= " + gendre +
                ", price= " + price +
                ", copiesSold= " + copiesSold +
                '}';
    }

    public void incrementPrice(){
        this.price+= 1;
    }
}
