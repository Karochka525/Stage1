import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Task1.printHelloWorld();
        Task2.mathOper(10,2);
        Task3.boolOper(false,true);
        Task4.printRandomArray();
        Task5.symbolValue("Hello World!");
        Task6.countSameSymb("Hello World!");
        Task7.print();
        System.out.println("Введите выражение: ");
        Task8.calculateStr(scanner.nextLine());
        System.out.println("Введите текст для проверки на полиндром: ");
        Task9.isPolyndrom(scanner.nextLine());
    }
}
