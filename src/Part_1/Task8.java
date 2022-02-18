package Part_1;

import java.util.*;
import java.util.regex.*;

public class Task8 {
    final static Pattern numPatt = Pattern.compile("(-?\\d+)(.*)");
    static LinkedList<Task8> operList = new LinkedList<>();
    static LinkedList<Double> numList = new LinkedList<>();

    interface Operation {
        double calc(double op1, double op2);
    }

    int prior;
    Operation operation;

    Task8(int p, Operation o) {
        prior = p;
        operation = o;
    }

    private double calc(double o1, double o2) {
        return operation.calc(o1, o2);
    }

    static void calculate(Task8 c) {
        while (operList.peek() != c)
            numList.addFirst(
                    Objects.requireNonNull(operList.poll()).calc(numList.poll(), numList.poll())
            );
    }

    public static void calculateStr(String str) throws Exception {
        str = str.replaceAll(" ", "");

        for (;;) {
            Matcher m = numPatt.matcher(str);
            if (!m.matches())
                throw new Exception("Не число");
            numList.addFirst(Double.parseDouble(m.group(1)));
            str = m.group(2);

            if (str.length() == 0)
                break;

            Task8 c = switch (str.charAt(0)) {
                case '*' -> new Task8(1, (op1, op2) -> op2 * op1);
                case '/' -> new Task8(1, (op1, op2) -> op2 / op1);
                case '+' -> new Task8(2, (op1, op2) -> op2 + op1);
                case '-' -> new Task8(2, (op1, op2) -> op2 - op1);
                default -> throw new Exception("Не операция");

            };
            operList.add(c);
            operList.sort((o1, o2) -> o1.prior < o2.prior ? -1 : 1);
            calculate(c);
            str = str.substring(1);
        }
        calculate(null);


        System.out.println("Результат: " + numList.poll());
    }
}