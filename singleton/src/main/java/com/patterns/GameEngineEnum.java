package com.patterns;

public enum GameEngineEnum {

    INSTANCE("Charlie");

    private int hp = 199;
    private String charakterName = "";

    private GameEngineEnum(String name) {
        this.charakterName = name;
    }

    public void run() {
        while (true) {

        }
    }
}
