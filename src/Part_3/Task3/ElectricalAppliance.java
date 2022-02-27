package Part_3.Task3;

public abstract class ElectricalAppliance {
    private String name;
    private boolean isOn;
    private final int power;

    public ElectricalAppliance(int wattage, String name) {
        this.power = wattage;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turn(){
        isOn = !isOn;
    }

    public String getFullInfo() {
        return this.getName() +" "+ this.getPower() + "W : " +
            (this.isOn()?"Включен":"Выключен")
        ;
    }
}
