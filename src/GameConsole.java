import enums.Genre;

import java.util.*;
import java.util.stream.Collectors;

public class GameConsole {

    public static void run() {
        // Create 4 game objects
        Game sportsGame = new Game("FIFA 22", Genre.SPORTS, 9.99, 10000);
        Game strategyGame = new Game("Civilization VI", Genre.STRATEGY, 49.99, 500000);
        Game actionGame = new Game("Resident Evil Village", Genre.ACTION, 69.99, 250000);
        Game rpgGame = new Game("The Witcher 3: Wild Hunt", Genre.RPG, 39.99, 10);

        // Create ArrayList and add Games.
        ArrayList<Game> games = new ArrayList<>(Arrays.asList(sportsGame, strategyGame, actionGame, rpgGame));

        // Use foreach to go through array of games and print it.
        displayList("\nArray of games created.", games);

        // Remove second game
        games.remove(1);
        // Move Printing to the method and print list again.
        displayList("\nSecond game removed.", games);

        // Implement PriceComparator and sort Games by Price ascending /descending.
        games.sort(new PriceComparator());
        displayList("\nSorted games by price in ascending order.", games);

        games.sort(Collections.reverseOrder(new PriceComparator()));
        displayList("\nSorted games by price in descending order.", games);

        // Using Streams ForEach method increment Game price.
        // Create Method in Games class (incrementPrice)
        games.stream().forEach(game -> game.incrementPrice(5.50));

        /*
         Using Stream Filter, use new list and filter games by
         - Price is more than 10 euro.
         - Have sold copied are more than 50.
         Print it.
        */
        List<Game> filteredGames =
                games.stream()
                        .filter(game ->
                                game.getPrice() > 10 && game.getCopiesSold() > 50)
                        .collect(Collectors.toList());

        displayList("\nFiltered games by price > 10 and sold copies > 50", filteredGames);

        // Using Streams Sorted sort Games by copies sold.
        // Print sorted Games.
        List<Game> sortedBySoldCopiesGames =
                games.stream()
                        .sorted(Comparator.comparingInt(Game::getCopiesSold))
                        .collect(Collectors.toList());
        displayList("\nSorted games by sold copies", sortedBySoldCopiesGames);

        // Using Streams Min/Max find Games that has sold minimum copies and maximum.
        // Print Min, Max game.
        Optional<Game> minSoldCopiesGame = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        minSoldCopiesGame.ifPresent(game -> System.out.println("\nGame with minimum copies sold: " + game.toString()));

        Optional<Game> maxSoldCopiesGame = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        maxSoldCopiesGame.ifPresent(game -> System.out.println("\nGame with maximum copies sold: " + game.toString()));
    }


    private static void displayList(String message, List<Game> games) {
        System.out.println(message);
        for (Game game : games) {
            System.out.println(game.toString());
        }
    }
}
