import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameTask {

    public static void gameTask() {
        Game firstGame = new Game("Minecraft", 8.30, Genre.ACTION, 35004);
        Game secondGame = new Game("Resident Evil", 68.99, Genre.HORROR, 987554);
        Game thirdGame = new Game("Mortal Combat", 24.89,Genre.FIGHTING, 45124);
        Game fourthGame = new Game("The Longest Journey", 14.99, Genre.ADVENTURE, 389);

        //add games to the list
        List<Game> games = new ArrayList<>();
        games.add(firstGame);
        games.add(secondGame);
        games.add(thirdGame);
        games.add(fourthGame);

    //go through array of games

   for(Game game: games){
        System.out.println(game);
    }

    //remove second game
  games.remove(1);

   //PPriceComparitor and sorting

        Collections.sort(games, new PriceComparator());
        System.out.println(games);

        Collections.sort(games, new PriceComparator().reversed());
        System.out.println(games);

        //incrementPrice
        games.stream().forEach(game -> System.out.println("Incremented price is " + game.incrementPrice()));

        //filter games and display (price>10 and copiesSold>50)
        System.out.println(games.stream().filter(game -> game.getPrice()>10 && game.getCopiesSold() >50));

        //sort games by copies sold

        System.out.println(games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList());

        //find which game sold min and which max copies

        System.out.println(games.stream().min(Comparator.comparingInt(Game::getCopiesSold))); //min copies

        System.out.println(games.stream().max(Comparator.comparingInt(Game::getCopiesSold))); //max copies







}


}

