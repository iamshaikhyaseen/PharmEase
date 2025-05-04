package com.Sem5.PharmEase.config;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {
    private static final Dotenv dotenv=Dotenv.load();
    public static String get(String key) {
        return dotenv.get(key);
    }
}
