package day11.task1;

public class Courier implements Worker {
    private final int eachWork = 100;                  // ЗП за каждый заказ
    private final int bonus = 50000;
    private int salary;
    private String isPayed = "no";
    private int shareOfOrders = 0;                     //доля доставленных заказов из 100000
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getIsPayed() {
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
        this.salary += this.eachWork;
        warehouse.setCountDeliveredOrders();              //инкрементируется на +1 общее кол-во доставленных заказов в поле countPickedOrders
        this.shareOfOrders++;                             //инкрементируется на +1 кол-во заказов собранных одним сотрудником
    }

    @Override
    public void bonus() {
        if (this.isPayed.equals("yes"))
            System.out.println("Бонус уже выплачен");
        else {
            if (warehouse.getCountDeliveredOrders() == 10000) {               //при достижениие доставленных заказов - 10000
                    this.salary += (this.shareOfOrders / 10000) * this.bonus; //если несколько сотрудников, то расчитывается доля заказов из 10000 выполненных данным сотррудником
                this.isPayed = "yes";                                          //если один сотрудник, то он получает полный бонус за все 10000 заказов
            }
            if (warehouse.getCountDeliveredOrders() < 10000)
                System.out.println("Бонус пока недоступен");
        }

    }
}


















