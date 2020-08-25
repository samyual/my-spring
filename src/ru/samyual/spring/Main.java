package ru.samyual.spring;

import org.springframework.context.ApplicationContext;

public class Main {

    public static void main(String... args) {
        ApplicationContext applicationContext = new ApplicationContext("ru.samyual.spring");
        applicationContext.close();
    }
}
