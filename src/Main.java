import Part_2.*;
import Part_2.Taks_5.Sentence;
import Part_3.Task1;
import Part_3.Task2.Pc;
import Part_3.Task3.Task3;
import Part_3.Task4.BusinessRecord;
import Part_3.Task4.Diary;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\tЗадание №1.1");
//        Part_1.Task1.printHelloWorld();
//        System.out.println();

//        System.out.println("\tЗадание №1.2");
//        Task2.mathOper(10, 2);
//        System.out.println();
//
//        System.out.println("\tЗадание №1.3");
//        Task3.boolOper(false, true);
//        System.out.println();
//
//        System.out.println("\tЗадание №1.4");
//        Task4.printRandomArray();
//        System.out.println();
//
//        System.out.println("\tЗадание №1.5");
//        Task5.symbolValue("Hello World!");
//        System.out.println();
//
//        System.out.println("\tЗадание №1.6");
//        Task6.countSameSymb("Hello World!");
//        System.out.println();
//
//        System.out.println("\tЗадание №1.7");
//        Task7.print();
//        System.out.println();
//
//        System.out.println("\tЗадание №1.8");
//        System.out.println("Введите выражение: ");
//        Task8.calculateStr(scanner.nextLine());
//        System.out.println();
//
//        System.out.println("\tЗадание №1.9");
//        System.out.println("Введите текст для проверки на полиндром: ");
//        Task9.isPolyndrom(scanner.nextLine());
//        System.out.println();
//
//        System.out.println("\tЗадание №2.1");
//        System.out.println("Введите количество чисел последовательности Фибоначи: ");
//        System.out.println(Task_1.fib(Integer.parseInt(scanner.nextLine())));
//        System.out.println();
//
//        System.out.println("\tЗадание №2.2");
//        System.out.println("Введите текст: ");
//        System.out.println(Task_2.removeNotLetters(scanner.nextLine()));
//        System.out.println();
//
//        System.out.println("\tЗадание №2.3");
//        System.out.println("Введите текст: ");
//        String input = scanner.nextLine();
//        System.out.println("Введите номер символа для замены: ");
//        int charIndex = Integer.parseInt(scanner.nextLine());
//        System.out.println("Введите текст для замены символа: ");
//        String replaceStr = scanner.nextLine();
//        System.out.println(Task_3.replaceEach(input, charIndex, replaceStr));
//        System.out.println();
//
//        System.out.println("\tЗадание №2.4");
//        System.out.println("Введите текст : ");
//        Task_4.searchWord(scanner.nextLine());
//
//        System.out.println("\tЗадание №2.5");
//        System.out.println("Введите текст : ");
//        String[] exampleStrMass = scanner.nextLine().split(" ");
//        Sentence sentence = new Sentence(exampleStrMass);
//        System.out.println(sentence.getOriginalSentence());
//        System.out.println();

//        System.out.println("\tЗадание №3.1");
//        Task1.printCustomMatrix(9);
//        System.out.println();
//        System.out.println("\tЗадание №3.2");
//        Pc myPc = new Pc();
//        myPc.printStoragesCapacity();
//        myPc.scanViruses();

//        System.out.println();
//        System.out.println("\tЗадание №3.3");
//        Task3.doTask3(scanner);
        BusinessRecord testRec = new BusinessRecord(new String[]{"TEST2", "TEST2", "TEST2", "TEST2", "TEST2"});
        Diary myDiary = new Diary();
        myDiary.add(new BusinessRecord(new String[]{"Я", "люблю", "прграммирование"}));
        Thread.sleep(1000);
        myDiary.add(new BusinessRecord(new String[]{"Открытый", "Код", "самый", "лучший","на", "свете"}));
        Thread.sleep(1000);
        myDiary.add(new BusinessRecord(new String[]{"TEST", "TEST", "TEST", "TEST", "TEST"}));
        myDiary.add(new BusinessRecord(new String[]{"TEST3", "TEST3", "TEST3", "TEST3", "TEST3"}));
        myDiary.add(testRec);
        //Тестирование функий записной книжки
        myDiary.showAll(true);
        myDiary.showAll(false);
        myDiary.showByDateTime(testRec.getCreateWhen());
        myDiary.showLast();
        myDiary.correct(testRec.getCreateWhen());
        myDiary.showAll(false);
        myDiary.delete(testRec.getCreateWhen());
        myDiary.showAll(true);
    }
}
