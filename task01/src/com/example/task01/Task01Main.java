package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

        // Создаем пару с двумя значениями
        Pair<String, Integer> pair = Pair.of("Hello", 42);

        // Получаем элементы пары
        System.out.println("1: " + pair.getFirst()); // Вывод: Hello
        System.out.println("2: " + pair.getSecond()); // Вывод: 42

        // Проверяем работу ifPresent
        pair.ifPresent((first, second) ->
                System.out.println("1: " + first + " 2 " + second)
        );

        // Создаем пару с одним значением null
        Pair<String, Integer> halfEmptyPair = Pair.of("Hello", null);
        halfEmptyPair.ifPresent((first, second) ->
                System.out.println("223")
        );

        // Сравниваем пары
        Pair<String, Integer> pair2 = Pair.of("Hello", 42);
        System.out.println(pair.equals(pair2));

        // Проверяем работу с null
        Pair<String, String> emptyPair = Pair.of(null, null);
        System.out.println(emptyPair.getFirst() + ", " + emptyPair.getSecond());
        System.out.println(emptyPair.equals(Pair.of(null, null)));

        // Проверяем корректность hashCode
        System.out.println("pair: " + pair.hashCode());
        System.out.println("pair2: " + pair2.hashCode());

    }

}
