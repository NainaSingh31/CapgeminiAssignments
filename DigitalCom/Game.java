package DigitalCom;

public class Game {

    private String gameName;
    private String authorName;
    private float price;

    public Game(String gameName, String authorName, float price) {
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game:" + gameName + " |Author: " + authorName + "|Price: " + price;
    }
}
