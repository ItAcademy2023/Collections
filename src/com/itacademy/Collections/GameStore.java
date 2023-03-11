package com.itacademy.Collections;

import java.util.ArrayList;
import java.util.Comparator;

public class GameStore implements PriceComparator {
    private final ArrayList<Game> gameList;

    public GameStore() {
        this.gameList = new ArrayList<>();
    }

    public ArrayList<Game> getGameList() {
        return gameList;
    }

    public void addGameToStore(Game game) {
        gameList.add(game);
    }

    public void removeFromGameList(int index) {
        gameList.remove(index);
    }

    @Override
    public void sortGamesByPriceAscending() {
        gameList.sort(Comparator.comparing(Game::getPrice));
    }

    @Override
    public void sortGamesByPriceDescending() {
        gameList.sort(Comparator.comparing(Game::getPrice).reversed());
    }

    public void printListOfGames() {
        String gameListToString = "";
        for (Game game : gameList) {
            gameListToString += game.toString() + "\n";
        }
        System.out.println(gameListToString);
    }
}
