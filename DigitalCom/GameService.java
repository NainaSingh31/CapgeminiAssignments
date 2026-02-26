package DigitalCom;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    static ArrayList<Game> games = new ArrayList<>();

    public GameService() {

        if (games.isEmpty()) {
            games.add(new Game("SnowBird", "Danny", 300));
            games.add(new Game("FreshFood", "Ram", 450));
            games.add(new Game("Batsman", "Kate", 400));
            games.add(new Game("Pokiman", "Steeve", 600));
            games.add(new Game("YammyTommy", "Narayan", 350));
        }
    }

    public List<Game> viewAll() {
        return games;
    }

    public String authorSearch(String author) {
        for (Game g : games) {
            if (g.getAuthorName().equalsIgnoreCase(author)) {
                return g.getGameName();
            }
        }
        return "NOT FOUND";
    }
}