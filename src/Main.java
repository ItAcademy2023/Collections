import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Game> games = new ArrayList<>(Arrays.asList(
                new Game("The Legend of Zelda: Breath of the Wild", Genre.ACTION, 39.99, 15000000),
                new Game("Animal Crossing: New Horizons", Genre.SIMULATTION, 49.99, 34000000),
                new Game("Mario Kart 8 Deluxe", Genre.RACING, 59.99, 40000000),
                new Game("Minecraft", Genre.SANDBOX, 6.95, 200000000)
        ));

        games.remove(1);

        //printGames(games);

        games.stream()
                .forEach(game -> game.incrementPrice(10));

        games.stream()
                .sorted(Comparator.comparing(Game::getPrice))
                .forEach(System.out::println);

        games.stream()
                .sorted(Comparator.comparing(Game::getPrice).reversed())
                .forEach(System.out::println);

        games.stream()
                .sorted(Comparator.comparingInt(Game::getCopiesSold))
                .forEach(System.out::println);


        List<Game> filteredGames = games.stream()
                .filter(game -> game.getPrice() > 10 && game.getCopiesSold() > 50)
                .toList();

        filteredGames.forEach(System.out::println);

        Game minGame = games.stream()
                .min(Comparator.comparing(Game::getCopiesSold))
                .orElse(null);

        Game maxGame = games.stream()
                .max(Comparator.comparing(Game::getCopiesSold))
                .orElse(null);

    }

    public static void printGames(ArrayList<Game> games) {
        for (Game game : games) {
            System.out.println(game.toString());
        }
    }
}


//    public static void run() {
//        int[] number = {40, 55, 63, 17, 22, 68, 89, 97, 89};
//        for (int numbers : number) {
//            System.out.println(number + "");
//        }
//        ;
