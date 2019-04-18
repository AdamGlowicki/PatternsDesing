package com.patterns;

public class GameEngine {

    private int hp = 199;
    private String charakterName = "";

    private static GameEngine instance = new GameEngine();
//    private static GameEngine instance;


    private GameEngine() {
    }

    public void run() {
        while (true) {

        }
    }

    public static GameEngine getInstance() {
        return instance;
    }

//    public static GameEngine getInstance() {
//        if (instance == null) {
//
//            synchronized (GameEngine.class) {
//                if (instance == null) {
//                    instance = new GameEngine();
//                }
//            }
//        }
//
//        return instance;
//    }
}
