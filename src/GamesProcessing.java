import jdk.jfr.Category;

import java.util.*;
import java.util.stream.Collectors;

public class GamesProcessing {
    public static void main(String[] args) {
        // 2. Create ArrayList and add Games.
        ArrayList<Game> videoGames = new ArrayList<>(Arrays.asList(
                new Game("Minecraft 2", 29.99, 60, Genre.SANDBOX),
                new Game("Fallout 5", 49.99, 10, Genre.RPG),
                new Game("Dead Red Redemption", 59.99, 20, Genre.ADVENTURE),
                new Game("Counter-Strike 2", 19.95, 51, Genre.FPS)));
        // 3. Use foreach to go through array of games and print it.
        videoGames.forEach(System.out::println);
        System.out.println("---------------\nGames with second game removed:");
        // 4. Remove second game
        videoGames.remove(1);
        // 5. Move Printing to the method and print list again
        videoGames.forEach(Game::print);
        System.out.println("---------------\nGames sorted by price:");
        // 6. Implement PriceComparator and sort Games by Price ascending/descending.
//        Collections.sort(videoGames, new PriceComparator());
        List<Game> sortedGames = videoGames.stream()
                .sorted(new PriceComparator())
                .collect(Collectors.toCollection(ArrayList::new));

        List<Game> reverseSortedGames = videoGames.stream()
                .sorted(new PriceComparator().reversed())
                .collect(Collectors.toCollection(ArrayList::new));

        sortedGames.forEach(Game::print);
        System.out.println("---------------\nGames reverse sorted by price:");
        reverseSortedGames.forEach(Game::print);
        // Added more games for tasks 1, 2
        videoGames.add(new Game("The Grove", 4.95, 15, Genre.SURVIVAL));
        videoGames.add(new Game("Stardew Vale", 5.95, 80, Genre.SANDBOX));
        //  1. Using Streams ForEach method increment Game price.
        videoGames.stream().forEach(s -> s.incrementPriceBy(2));
        // 2. Using Stream Filter, use new list and filter games by Price and Units Sold
        List<Game> gamesOverTen = videoGames.stream()
                .filter(s -> s.getPrice() > 10)
                .collect(Collectors.toCollection(ArrayList::new));

        List<Game> gamesSoldOverFifty = videoGames.stream()
                .filter(s -> s.getCopiesSold() > 50)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("---------------\nGames costing over 10:");
        gamesOverTen.forEach(Game::print);

        System.out.println("---------------\nGames sold over 50:");
        gamesSoldOverFifty.forEach(Game::print);

        // 1. Using Streams Sorted sort Games by copies sold.
        videoGames = videoGames.stream()
                .sorted(Comparator.comparing(Game::getCopiesSold))
                .collect(Collectors.toCollection(ArrayList::new));
        Optional<Game> maxSold = videoGames.stream().max(Comparator.comparing(Game::getCopiesSold));
        Optional<Game> minSold = videoGames.stream().min(Comparator.comparing(Game::getCopiesSold));
        System.out.println("---------------\nGames sorted by copies sold:");
        videoGames.forEach(Game::print);
        System.out.printf("---------------\nMax sold game: %1$s\n", maxSold);
        System.out.printf("---------------\nMin sold game: %1$s\n", minSold);


    }
}
