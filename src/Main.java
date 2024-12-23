import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
    static Main r = new Main();
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("""
                ЛАБОРАТОРНАЯ РАБОТА №5
                ВЫПОЛНИЛ - КУЛАКОВ МАКСИМ ИТ-6 (ПМИ-10/2023)
                ВАРИАНТ 7
                
                Задания 1 - задания 1 темы 1
                Задание 2 - задание 1 темы 2
                Задание 3 - задание 7 темы 3
                Задание 4 - задание 7 темы 4
                Задание 5 - задание 7 темы 5
                Задание 6 - задание 2 темы 6
                Задание 7 - задание 1 темы 7
                Задание 8 - задание 2 темы 7
                Что-бы выйти - введите 0
                
                Чтобы просмотреть интересующее вас задание - введите его номер.
                """);
        r.choise();
    }

    public void choise() {
        while (true) {
            System.out.println("\nВведите число для выбора дальнейшего действия:");
            int choisenum = n.nextInt();
            if (choisenum == 0) {
                System.out.println("\nРабота программы завершена!");
                break;
            } else if (0 < choisenum && choisenum < 9) {
                System.out.println(tasks(choisenum));
            } else {
                System.out.print("\nВведите число в указанном диапазоне");
            }
        }
    }

    public String tasks(int args) {

        switch (args) {

            case 1:
                System.out.println("""
                        Текст задания 1 темы 1
                        
                        В класс Дробь, добавить интерфейс на два метода: получение вещественного значения, установка
                        числителя и установка знаменателя.
                        Сгенерировать такую версию дроби, которая будет кэшировать вычисление вещественного значения.
                        Если раннее в вашем варианте не было Дроби, то создайте сущность Дробь со следующими особенностями:
                         Имеет числитель: целое число
                         Имеет знаменатель: целое число
                         Дробь может быть создана с указанием числителя и знаменателя
                         Может вернуть строковое представление вида “числитель/знаменатель”
                         Необходимо корректно обрабатывать отрицательные значения. Учтите, что знаменатель не может
                        быть отрицательным.
                         Переопределите метод сравнения объектов по состоянию таким образом, чтобы две дроби считались одинаковыми тогда, когда у них одинаковые значения числителя и знаменателя.
                        
                        """);
                task1();
                break;

            case 2:
                System.out.println("""
                        Текст задания 1 темы 2
                        
                        Количество мяуканий.
                        Необходимо воспользоваться классом Кот и методом принимающим всех мяукающих из задачи 2.5.4.
                        Необходимо таким образом передать кота в указанный метод, что бы после окончания его работы
                        узнать сколько раз мяукал кот за время его работы. На рисунке показан пример работы. Перед вызовом
                        метода создаем кота, отправляем ссылку на кота в метод, после окончания его работы выводим
                        количество мяуканий на экран. Кота изменять нельзя.
                        Если раннее в вашем варианте не было Кота, то создайте
                        1. сущность Кот, которая описывается следующим образом:
                         Имеет Имя (строка)
                         Для создания необходимо указать имя кота.
                         Может быть приведен к текстовой форме вида: “кот: Имя”
                         Может помяукать, что приводит к выводу на экран следующего текста: “Имя: мяу!”,
                        вызвать мяуканье можно без параметров.
                        2. интерфейс Мяуканье: разработайте метод, который принимает набор объектов способных
                        мяукать и вызывает мяуканье у каждого объекта. Мяукающие объекты должны иметь метод со
                        следующей сигнатурой: public void meow();
                        
                        """);
                task2();
                break;

            case 3:
                System.out.println("""
                        Текст задания 7 темы 3
                        
                        Составить программу, которая формирует список L, включив в него по одному разу элементы,
                        которые входят одновременно в оба списка L1 и L2.
                        
                        """);
                task3();
                break;

            case 4:
                System.out.println("""
                        Текст задания 7 темы 4
                        
                        На автозаправочных станциях (АЗС) продается бензин с маркировкой 92, 95 и 98. В городе N был
                        проведен мониторинг цены бензина на различных АЗС. Напишите программу, которая будет
                        определять для каждого вида бензина, сколько АЗС продают его дешевле всего.
                        На вход программе в первой строке подается число данных N о стоимости бензина. В каждой из
                        последующих N строк находится информация в следующем формате:
                        <Компания><Улица><Марка><Цена>
                        где <Компания> – строка, состоящая не более, чем из 20 символов без пробелов, <Улица> –
                        строка, состоящая не более, чем из 20 символов без пробелов, <Марка> – одно из чисел – 92, 95
                        или 98, <Цена> – целое число в диапазоне от 1000 до 3000, обозначающее стоимость одного
                        литра бензина в копейках.
                        <Компания> и <Улица>, <Улица> и <Марка>, а также <Марка> и <Цена> разделены ровно одним
                        пробелом. Пример входной строки:
                        Синойл Цветочная 95 59
                        Программа должна выводить через пробел 3 числа – количество АЗС, продающих дешевле всего
                        92-й, 95-й и 98-й бензин соответственно. Если бензин какой-то марки нигде не продавался, то
                        следует вывести 0.
                        Пример выходных данных:
                        12 1 0
                        
                        
                        """);
                task4();
                break;

            case 5:
                System.out.println("""
                        Текст задания 7 темы 5
                        
                        Файл содержит текст на русском языке. Сколько разных букв встречается в тексте?
                        
                        """);
                task5();
                break;

            case 6:
                System.out.println("""
                        Текст задания 2 темы 6
                        
                        По списку L построить очередь
                        (например, по списку из элементов 1, 2, 3 требуется построить очередь из элементов 1, 2, 3, 3, 2, 1)
                        
                        """);
                task6();
                break;

            case 7:
                System.out.println("""
                        Текст задания 1 темы 7
                        
                        Необходимо написать стрим:
                        Дан набор объектов типа Point, необходимо взять все Point в разных координатах, убрать с
                        одинаковыми X,Y, отсортировать по X, отрицательные Y сделать положительными и собрать это
                        все в ломаную (объект типа Polyline)
                        Если раннее в вашем варианте не было задание с классом Point и Polyline, то написать их:
                        1. класс Point:
                         Координата Х: число.
                         Координата Y: число.
                         Может возвращать текстовое представление вида “{X;Y}”.
                        2. класс Line (Линия), расположенная на двумерной плоскости, которая описывается:
                         Координата начала: Точка
                         Координата конца: Точка
                         Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
                        3. класс Polyline (Ломаная), которая будет представлять собой ломаную линию. Ломаная
                        линия представляет собой набор следующих характеристик:
                         Имеет массив Точек, через которые линия проходит.
                         Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это
                        результат приведения к строке Точки с номером N

                        """);
                task7();
                break;

            case 8:
                System.out.println("""
                        Текст задания 2 темы 7
                        
                        Дан текстовый файл со строками, содержащими имя человека и его номер в следующей форме:
                        Вася:5
                        Петя:3
                        Аня:5
                        Номера людей могут повторяться. У каких-то людей может не быть номера.
                        Необходимо написать стрим выполняющую следующее:
                        читаются все люди из файла, все имена приводится к нижнему регистру, но с первой буквой в
                        верхнем регистре, убираем из перечня всех людей без номеров, а имена оставшихся группируются
                        по их номеру:
                        [5:[Вася, Аня], 3:[Петя]]
                        
                        """);
                task8();
                break;
        }
        return "";
    }

    public void task1() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(-1, 2);
        Fraction f3 = new Fraction(-1, -2);

        System.out.println("Дробь: " + f1);
        System.out.println("Дробь: " + f3);
        System.out.println(Fraction.getDecValue(f1.getNumerator(), f1.getDenominator()));
        System.out.println(Fraction.areEqual(f1, f2));
        System.out.println(Fraction.generateHashCode(f1));
    }

    public void task2() {
        Cat cat = new Cat("Tom");
        Meowing meowService = new Meowing();
        List<Meowable> meowables = Arrays.asList(cat, cat, cat);
        meowService.makeAllMeow(meowables);
        System.out.println("Количество мяуканий: " + cat.getMeowCount());
    }

    public void task3() {
        List<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);

        List<Integer> L2 = new ArrayList<>();
        L2.add(3);
        L2.add(4);
        L2.add(5);
        L2.add(6);

        List<Integer> L = new ArrayList<>();
        for (Integer element : L1) {
            if (L2.contains(element)) {
                L.add(element);
            }
        }

        System.out.println("Список L: " + L);
    }

    public void task4() {
        System.out.println("Введите через пробел: название компании (строка), улицу(строка), марку(), цену().");
        int N = n.nextInt();

        Map<Integer, Integer> minPrices = new HashMap<>();
        Map<Integer, Integer> countCheapest = new HashMap<>();

        minPrices.put(92, Integer.MAX_VALUE);
        minPrices.put(95, Integer.MAX_VALUE);
        minPrices.put(98, Integer.MAX_VALUE);

        countCheapest.put(92, 0);
        countCheapest.put(95, 0);
        countCheapest.put(98, 0);

        for (int i = 0; i < N; i++) {
            String[] input = n.nextLine().split(" ");
            String company = input[0];
            String street = input[1];
            int brand = Integer.parseInt(input[2]);
            int price = Integer.parseInt(input[3]);
            if (price < minPrices.get(brand)) {
                minPrices.put(brand, price);
                countCheapest.put(brand, 1);
            } else if (price == minPrices.get(brand)) {
                countCheapest.put(brand, countCheapest.get(brand) + 1);
            }
        }
        System.out.println(countCheapest.get(92) + " " + countCheapest.get(95) + " " + countCheapest.get(98));
    }

    public void task5() {
        String fileName = "C:\\IDEAProj\\JavaLab5\\src\\text";
        Set<Character> uniqueLetters = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        uniqueLetters.add(Character.toLowerCase(c));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Количество разных букв в тексте: " + uniqueLetters.size());
    }

    public void task6() {
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        Queue<Integer> queue = new LinkedList<>();
        for (Integer element : L) {
            queue.add(element);
        }
        for (int i = L.size() - 1; i >= 0; i--) {
            queue.add(L.get(i));
        }
        System.out.println("Очередь: " + queue);
    }

    public void task7() {
        List<Point> points = Arrays.asList(
                new Point(1, -2),
                new Point(2, 3),
                new Point(1, 2),
                new Point(3, -4),
                new Point(2, 3)
        );

        Polyline polyline = points.stream()
                .distinct() // Убираем дубликаты
                .sorted(Comparator.comparingDouble(Point::getX)) // Сортируем по X
                .peek(point -> {
                    if (point.getY() < 0) {
                        point.setY(-point.getY()); // Делаем отрицательные Y положительными
                    }
                })
                .collect(Collectors.collectingAndThen(Collectors.toList(), Polyline::new));

        System.out.println(polyline);
    }

    public void task8() {
        String fileName = "C:\\IDEAProj\\JavaLab5\\src\\file72";
        Map<Integer, List<String>> groupedNames = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            groupedNames = reader.lines()
                    .map(line -> line.split(":"))
                    .filter(parts -> parts.length == 2 && !parts[1].isEmpty())
                    .collect(Collectors.groupingBy(
                            parts -> Integer.parseInt(parts[1]),
                            Collectors.mapping(
                                    parts -> capitalize(parts[0].toLowerCase()),
                                    Collectors.toList()
                            )
                    ));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(groupedNames);
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}