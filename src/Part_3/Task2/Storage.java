package Part_3.Task2;

public class Storage {
    private int capacity;

    public Storage() {
        this.capacity = (int)(1000*Math.random());
    }

    public Storage(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
