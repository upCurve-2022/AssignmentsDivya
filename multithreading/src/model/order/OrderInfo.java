package model.order;

import model.food.Item;

import java.util.ArrayList;

public class OrderInfo {
    private int OrderId;
    private Item items;
    private Customer customer;

    public int getOrderId() {
        return OrderId;
    }
    public void setOrderId(int OrderId){
        this.OrderId=OrderId;
    }
    public Item getItems(){
        return items;
    }
    public void setItems(Item items) {
        this.items=items;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + OrderId +
                ", items =" + items +
                ", customer=" + customer +
                '}';
    }
}
