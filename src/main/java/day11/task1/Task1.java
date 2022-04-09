package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker){
        int i =0;
        while(i != 10000){
            worker.doWork();
            i++;
            if( i == 10000)
                worker.bonus();                                 //начисляем бонусы при достижении собранных/доставленных заказов - 10000
        }
    }
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        businessProcess(courier);
        businessProcess(picker);
        System.out.println(warehouse.getCountDeliveredOrders());
        System.out.println(warehouse.getCountPickedOrders());
        System.out.println(courier);
        System.out.println(picker);

        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        courier1.doWork();
        picker1.doWork();
        System.out.println(warehouse1.getCountDeliveredOrders());
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println(picker1);
        System.out.println(courier1);
        courier1.doWork();
        picker1.doWork();
        System.out.println(warehouse1.getCountDeliveredOrders());
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println(picker1);
        System.out.println(courier1);

    }
}
