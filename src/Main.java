import java.util.*;

public class Main {

    public static void main(String[] args) {

        Game mysticRiver = new Game("Mystic River", Genre.ACTION_ADVENTURE, 24.5, 77);
        Game westernBoy = new Game("Western Boy", Genre.WESTERN, 25.6, 55);
        Game friends = new Game("Friends", Genre.SIMULATION, 9.9, 46);
        Game racing = new Game("Racing", Genre.SPORTS, 31.2, 35);

        List<Game> games = new ArrayList<>(Arrays.asList(mysticRiver, westernBoy, friends, racing));

        for (Game game : games) {
            System.out.println(game);
        }

        games.remove(1);

        System.out.println();
        for (Game game : games) {
            System.out.println(game);
        }
        System.out.println();

        System.out.println(games.stream()
                .sorted(Comparator.comparingDouble(Game::getPrice))
                .toList());

        games.stream()
                .sorted(Comparator.comparingDouble(Game::getPrice).reversed())
                .forEach(g -> System.out.println(g.getTitle()));

        System.out.println();
        games.stream().forEach(g -> System.out.println("Incremented price: " + g.incrementPrice()));

        System.out.println();
        games.stream()
                .filter(g -> 10 < g.getPrice())
                .forEach(g -> System.out.println(g.getTitle() + " " + g.getPrice()));

        System.out.println();
        games.stream()
                .filter(g -> 50 < g.getCopiesSold())
                .forEach(g -> System.out.println(g.getTitle() + " " + g.getCopiesSold()));

        System.out.println();
        System.out.println(games.stream()
                .sorted(Comparator.comparingInt(Game::getCopiesSold))
                .toList());

        // Min/Max copies sold:

        System.out.println();
        games.stream()
                .min(Comparator.comparing(Game::getCopiesSold))
                .stream().toList()
                .forEach(g -> System.out.println(g.getTitle() + " " + g.getCopiesSold()));

        games.stream()
                .max(Comparator.comparing(Game::getCopiesSold))
                .stream().toList()
                .forEach(g -> System.out.println(g.getTitle() + " " + g.getCopiesSold()));
    }
}
