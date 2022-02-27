package Part_3.Task2;

public class Pc {

    private CPU cpu;
    private HDD hdd;
    private RAM ram;
    private boolean isOn;

    public Pc() {
        cpu = new CPU();
        hdd = new HDD();
        ram = new RAM();
    }

    public void turnPc(){
        isOn = !isOn;
    }

    public void printStoragesCapacity() {
        System.out.println(
                "HDD cap. : " + hdd.getCapacity() + " GB\n" +
                "RAM cap. : " + ram.getCapacity() + " GB"
        );
    }
    public void scanViruses() {
        int virusCount = hdd.getVirusesCount();
        if (virusCount > 0) {
            System.out.println("Найдено вирусов: " + virusCount);
        } else {
            System.out.println("Вирусов нет )");
        }
    }
}
