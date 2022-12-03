/*
1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
3.Вставить элемент в список в первой позиции.
4.Извлечь элемент (по указанному индексу) из заданного списка.
5.Обновить определенный элемент списка по заданному индексу.
6.Удалить третий элемент из списка.
7.Поиска элемента в списке по строке.
8.Создать новый список и добавить в него несколько елементов первого списка.
9.Удалить из первого списка все элементы отсутствующие во втором списке.
10.*Сортировка списка.
11.*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
 */


import java.util.*;

public class Seminar3allTask {
    public static void main(String[] args) {
//1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> some_string = new ArrayList<>();
        some_string.add("Hello");
        some_string.add("our");
        some_string.add("people");
        some_string.add("in the");
        some_string.add("world");
        System.out.println("--------------результат пункта 1---------------");
        some_string.forEach(element -> System.out.println(element));
//2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        String[] array_color = new String[]{"red", "blue", "black", "white"};
        ArrayList<String> colour_list = new ArrayList<String>();

        for (int i = 0; i < array_color.length; i++) {
            colour_list.add(array_color[i] + "!");
        }
        System.out.println("--------------результат пункта 2---------------");
        for (String element : colour_list) {
            System.out.println(element);
        }
//3.Вставить элемент в список в первой позиции.
        System.out.println("--------------результат пункта 3---------------");
        colour_list.add(1, "in_first_positions!!!!!!!");
        for (String element : colour_list) {
            System.out.println(element);
        }
//4.Извлечь элемент (по указанному индексу) из заданного списка.
        String remove_element = colour_list.remove(2);
        System.out.println("--------------результат пункта 4---------------\n извлечен 2-й элемент");
        System.out.println(remove_element);
//5.Обновить определенный элемент списка по заданному индексу.
        colour_list.set(1, "new_element!!!!!");
        System.out.println("--------------результат пункта 5---------------\n обновлен 1-й элемент");
        for (String element : colour_list) {
            System.out.println(element);
        }
//6.Удалить третий элемент из списка.
        colour_list.remove(3);
        System.out.println("--------------результат пункта 6---------------\n удалён 3-й элемент");
        for (String element : colour_list) {
            System.out.println(element);
        }
//7.Поиска элемента в списке по строке.
        System.out.println("--------------результат пункта 7---------------");
        int index = colour_list.indexOf("black!");
        if (index == -1)
            System.out.println("элемент не найден");
        else System.out.println("элемент\"black\" найден на позиции " + index);
//8.Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> new_list = new ArrayList<>(colour_list.subList(0, 2));
        System.out.println("--------------результат пункта 8---------------");
        System.out.println("в новый список записали:");

        for (String element : new_list) {
            System.out.println(element);
        }
//9.Удалить из первого списка все элементы отсутствующие во втором списке.
        ArrayList<Integer> first_list = new ArrayList<>();
        ArrayList<Integer> second_list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            first_list.add(new Random().nextInt(10));
        }
        for (int j = 0; j < 5; j++) {
            second_list.add(new Random().nextInt(10));
        }
        System.out.println("--------------результат пункта 9---------------");
        System.out.println("первый лист:");
        for (int element : first_list) {
            System.out.println(element);
        }
        System.out.println("второй лист:");
        for (int element : second_list) {
            System.out.println(element);
        }
        ArrayList<Integer> copy_list = (ArrayList<Integer>) first_list.clone();
        copy_list.removeAll(second_list);
        System.out.println(first_list.removeAll(copy_list));
        System.out.println();
        for (int element : first_list) {
            System.out.println(element);

        }
//10.*Сортировка списка.
        ArrayList<Integer> sorted_list = new ArrayList<>();
        for (int i=0;i<10;i++){
            sorted_list.add(new Random().nextInt(20));
        }
        System.out.println("--------------результат пункта 9---------------");
        System.out.println("отсортированная последовательность:");
        Collections.sort(sorted_list);
        sorted_list.forEach(i -> System.out.println(i));
//11.*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList.add(5);
        linkedList.add(5);
        long time1 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            arrayList.add(1,new Random().nextInt(100));
        }
        long time2 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            linkedList.add(1,new Random().nextInt(100));
        }
        long time3 = System.currentTimeMillis();
        System.out.println("--------------результат пункта 10---------------");
        System.out.println("вставка 1000 элементов для ArrayList занимает "+(time2-time1)+"" +
                "\nвставка 1000 элементов для LinkedList занимает "+(time3-time2));
    }


}
