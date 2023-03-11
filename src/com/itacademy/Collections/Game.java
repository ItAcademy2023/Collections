package com.itacademy.Collections;

/*Create a class Game with private modifies with getter setters*/
public class Game{
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

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public Double getPrice() {
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

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCopiesSold(Integer copiesSold) {
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Game title: " + title + " genre: " + genre + " price: " + price + " copies sold: " + copiesSold;
    }

    /*Create Method in Games class (incrementPrice)*/
    public void incrementPrice(double increasePriceBy){
        this.price+=increasePriceBy;
    }

}
