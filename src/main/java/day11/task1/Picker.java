package day11.task1;

public class Picker implements Worker {
    private final int EACHWORK = 80;                    // ЗП за каждый заказ
    private final int BONUS = 70000;
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean getIsPayed() {
        return this.isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + this.salary +
                ", isPayed=" + this.isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += this.EACHWORK;
        warehouse.incrementCountPickedOrders();               //инкрементируется на +1 общее кол-во собранных заказов в поле countPickedOrder
    }

    @Override
    public void bonus() {
        if (this.isPayed)
            System.out.println("Бонус уже выплачен");
        else {
            if (warehouse.getCountPickedOrders() == 10000) {                  //при достижениие собранных заказов - 10000
                    this.salary +=  this.BONUS;
                    this.isPayed = true;                                     //сотрудник получает полный бонус за все 10000 заказов
            }
            if (warehouse.getCountPickedOrders() < 10000)
                System.out.println("Бонус пока не доступен");
        }


    }
}
