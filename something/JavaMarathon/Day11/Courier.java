package zz.something.JavaMarathon.Day11;

public class Courier implements Worker {

    private int salary = 0;
    private Warehouse house;

    public void setHouse(Warehouse house) {
        this.house = house;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = getSalary() + 100;
        house.setBalance(house.getBalance() + 1000);
        if (house.getBalance() == 1000000) bonus();
    }

    @Override
    public void bonus() {
        salary = getSalary() * 2;
    }
}
