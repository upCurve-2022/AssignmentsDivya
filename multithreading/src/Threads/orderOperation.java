package Threads;

import Pizza.Orders;
import model.food.Item;
import model.order.Customer;
import model.order.OrderInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class orderOperation {
    public static OrderInfo takeOrder(Customer customer, ArrayList<Item> pizzaItem, int Order){
        OrderInfo info = new OrderInfo();
        info.setOrderId(Order);
        info.setItems(pizzaItem.get(Orders.getOrder(customer)));
        info.setCustomer(customer);
        return info;
    }
    public static void prepareOrder(Customer customer,OrderInfo order){
        System.out.println(" ");
        System.out.println("Order for customer "+customer.getName()+" "+order);
        System.out.println(" ");
    }
    public static void DeliverOrder(Customer customer,OrderInfo order){
        System.out.println(" ");
        System.out.println("Order Id - " + order.getOrderId());
        System.out.println(" ");
        System.out.println("Preparation time needed - " + order.getItems());
        System.out.println(" ");
        System.out.println("Order ready for - " + customer.getName());
        System.out.println(" ");
        System.out.println("Delivering for customer - " + customer.getName() + ". Enjoy Delicious " + order.getItems());
        System.out.println(" ");
    }
}
