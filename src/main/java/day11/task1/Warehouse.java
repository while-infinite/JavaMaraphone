package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0;                 //определяем поле для расчёта заказов доставленных несколькими сотрудниками
    private int countDeliveredOrder = 0;               //определяем поле для расчёта заказов собранных несколькими сотрудниками


    public int getCountDeliveredOrders() {
        return countDeliveredOrder;
    }

    public void incrementCountPickedOrders() {
        if (countPickedOrders == 10000)                 //при лостижении 10000 собранных заказов обнуляем переменную для новой итерации и последующей выплаты бонусов
            countPickedOrders = 0;
        countPickedOrders++;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void incrementCountDeliveredOrders() {
        if (countDeliveredOrder == 10000)                //при лостижении 10000 доставленных заказов обнуляем переменную для новой итерации и последующей выплаты бонусов
            countDeliveredOrder = 0;
        countDeliveredOrder++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrder=" + countDeliveredOrder +
                '}';
    }
}
