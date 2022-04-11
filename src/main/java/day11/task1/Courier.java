package day11.task1;

public class Courier implements Worker {
    private final int EACHWORK = 100;                  // ЗП за каждый заказ
    private final int BONUS = 50000;
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + this.salary +
                ", isPayed=" + this.isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += this.EACHWORK;
        warehouse.incrementCountDeliveredOrders();              //инкрементируется на +1 общее кол-во доставленных заказов в поле countPickedOrders
    }

    @Override
    public void bonus() {
        if (this.isPayed)
            System.out.println("Бонус уже выплачен");
        else {
            if (warehouse.getCountDeliveredOrders() == 10000) {               //при достижениие доставленных заказов - 10000
                    this.salary += this.BONUS;
                this.isPayed = true;                                          //сотрудник получает полный бонус за все 10000 заказов
            }
            if (warehouse.getCountDeliveredOrders() < 10000)
                System.out.println("Бонус пока недоступен");
        }

    }
}


















