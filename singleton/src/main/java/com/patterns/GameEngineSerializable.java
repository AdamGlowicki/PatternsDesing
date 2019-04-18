package com.patterns;

import java.io.Serializable;

public class GameEngineSerializable implements Serializable {

    public static final long SERIAL_VERSION_UID = 223535;

    private int hp = 199;
    private String charakterName = "";

    private static GameEngineSerializable instance = new GameEngineSerializable();


    private GameEngineSerializable() {
    }

    public void run() {
        while (true) {

        }
    }

    public static GameEngineSerializable getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
