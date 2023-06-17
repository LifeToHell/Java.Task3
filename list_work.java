/*
 * Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.OptionalDouble;

public class list_work {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            list.add((int) (Math.random() * 100));// заполняем случайным цифрами до 100
        System.out.println(list); // выводим результат на экран
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) // определяем четные цифры и удаляем
                iterator.remove();
        }

        System.out.println(list); // выводим результат на экран
        System.out.println(Collections.max(list)); // из полученного списка находим минимальное
        System.out.println(Collections.min(list)); // макисмальное
        OptionalDouble average = list.stream() // среднее число подключив библиотеку OptionalDouble
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(average);

    }

}
