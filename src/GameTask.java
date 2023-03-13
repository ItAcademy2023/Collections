import java.util.*;
import java.util.stream.Collectors;

public class GameTask {
    public static void main(String[] args) {
        Game game1 = new Game("Alias", Genre.PARTY, 25.00, 450);
        Game game2 = new Game("Ticket To Ride", Genre.STRATEGIC, 18.00, 300);
        Game game3 = new Game("Memo", Genre.MEMORY, 8.00, 80);
        Game game4 = new Game("Dixit", Genre.PARTY, 26.00, 40);

        List<Game> gameList = new ArrayList<>();
        gameList.add(game1);
        gameList.add(game2);
        gameList.add(game3);
        gameList.add(game4);
        //System.out.println(Arrays.toString(gameList.toArray()));
        gameList.forEach(g -> System.out.println(g.toString()));

        gameList.remove(1);
        System.out.println();
        printing(gameList);

        // Sorting in ascending order
        Collections.sort(gameList, new PriceComparator());
        printing(gameList);
        // Sorting in descending order
        Collections.sort(gameList, new PriceComparator().reversed());
        printing(gameList);

        // Incrementing prices
        gameList.stream().forEach(g -> g.incrementPrice());
        printing(gameList);

        // Filtering games
        List<Game> filteredGamesList = gameList.stream().filter(g -> g.getPrice() > 10 && g.getCopiesSold() > 50).toList();
        printing(gameList);
        printing(filteredGamesList);

        // Streams sorted
        List<Game> gamesByCopiesSold = gameList.stream().sorted(Comparator.comparing(Game::getCopiesSold)).collect(Collectors.toList());
        printing(gamesByCopiesSold);

        // Streams MIN MAX
        Game minCopies = gameList.stream().min(Comparator.comparing(Game::getCopiesSold)).get();
        Game maxCopies = gameList.stream().max(Comparator.comparing(Game::getCopiesSold)).get();

        System.out.println("\nMinimum copies of game: " + minCopies.toString());
        System.out.println("\nMaximum copies of game: " + maxCopies.toString());






    }

    public static void printing(List<Game> list) {
        System.out.println("\n");
        list.forEach(i -> System.out.println(i.toString()));
    }
}
