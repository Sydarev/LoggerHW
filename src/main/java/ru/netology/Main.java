package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int n = in.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = in.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int min = in.nextInt();
//        Filter filter = new Filter(min);
        List<Integer> finalList = new Filter(min).filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + finalList);
        logger.log("Завершаем программу");
    }
}