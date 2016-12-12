package dev.lloydcodes.rhythmgame;

public class Launcher {
    
    public static void main(String[]args){
        Game game = new Game("2D Rhythm Game", 400, 400);
        game.start();
    }
}
