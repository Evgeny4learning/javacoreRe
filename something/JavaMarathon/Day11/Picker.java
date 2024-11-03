package zz.something.JavaMarathon.Day11;

public class Picker implements Worker {

    private int salary;
    private Warehouse warehouse;

    public Picker(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = getSalary() + 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() == 1500) bonus();
    }

    @Override
    public void bonus() {
        salary = getSalary() * 2;
    }
}
