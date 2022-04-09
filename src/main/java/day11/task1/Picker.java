package day11.task1;

public class Picker implements Worker {
    private final int eachWork = 80;                    // ЗП за каждый заказ
    private final int bonus = 70000;
    private int salary = 0;
    private int shareOfOrders = 0;                      //доля собранных заказов из 100000
    private String isPayed = "no";
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Picker{" +
                "salary=" + this.salary +
                ", isPayed=" + this.isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += this.eachWork;
        warehouse.setCountPickedOrders();               //инкрементируется на +1 общее кол-во собранных заказов в поле countPickedOrders
        this.shareOfOrders++;                           //инкрементируется на +1 кол-во заказов собранных одним сотрудником
    }

    @Override
    public void bonus() {
        if (this.isPayed.equals("yes"))
            System.out.println("Бонус уже выплачен");
        else {
            if (warehouse.getCountPickedOrders() == 10000) {                  //при достижениие собранных заказов - 10000
                    this.salary += (this.shareOfOrders / 10000) * this.bonus; //если несколько сотрудников, то расчитывается доля заказов из 10000 выполненных данным сотррудником
                    this.isPayed = "yes";                                     //если один сотрудник, то он получает полный бонус за все 10000 заказов
            }
            if (warehouse.getCountPickedOrders() < 10000)
                System.out.println("Бонус пока не доступен");
        }


    }
}
