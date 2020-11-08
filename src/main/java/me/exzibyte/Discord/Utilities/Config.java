package me.exzibyte.Discord.Utilities;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {

    private static final Dotenv dotenv = Dotenv.load();

    public String get(String key){
        return dotenv.get(key.toUpperCase());
    }

}
