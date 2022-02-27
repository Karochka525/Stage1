package Part_3.Task3;

import java.util.*;

public class Task3 {
    private static void printDevices(List<ElectricalAppliance> ellAppliance) {
        int index = 0;
        for (ElectricalAppliance device: ellAppliance) {
            index++;
            System.out.println(
                    index + "\\ " + device.getFullInfo()
            );
        }
    }

    private static void calculate(List<ElectricalAppliance> ellAppliance, int maxI) {
        int voltage = 220;
        int summPower=0;
        for (ElectricalAppliance device: ellAppliance) {
            if (device.isOn()){
                summPower += device.getPower();
            }
        }

        if (summPower/voltage > maxI) {
            System.out.println(
                    "Превышено максиальное потребление! \nПожалуйста выключите " +
                    ellAppliance.stream().filter(ElectricalAppliance::isOn)
                            .max(Comparator.comparingDouble(ElectricalAppliance::getPower))
                            .get().getFullInfo()
            );
        }

    }

    public static void doTask3(Scanner scanner) {
        int maxI;
        List<ElectricalAppliance> ellAppliance = new ArrayList<>();
        ellAppliance.add(new Tv(200));
        ellAppliance.add(new Fridge(3000));
        ellAppliance.add(new Kettle(150));

        System.out.println("Задайте максимальную допустимую нагрузку: ");
        try {
            while (!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Это не число (");
            }
            maxI = scanner.nextInt();
            int deviceIndex = -1;
            ElectricalAppliance save;
            while (true) {
                printDevices(ellAppliance);
                System.out.println("Выберите номер прибора для включения/выключения или '0' для следующей задачи: ");
                while (!scanner.hasNextInt()){
                    scanner.next();
                    System.out.println("Это не число (");
                }
                deviceIndex = scanner.nextInt() - 1;
                if (deviceIndex == -1) return;
                if (deviceIndex < 0 || deviceIndex >= ellAppliance.size()) {
                    System.out.println("Такого прибора нет!!!");
                } else {
                    save = ellAppliance.get(deviceIndex);
                    save.turn();
                    System.out.println(save.getName() + " - " + (save.isOn() ? "Включен" : "Выклюено"));
                }
                calculate(ellAppliance, maxI);
            }
        } catch (NumberFormatException exception) {

        }
    }
}
