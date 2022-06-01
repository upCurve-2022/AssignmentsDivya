package Threads;

import model.food.Item;
import model.order.Customer;
import model.order.OrderInfo;

import java.util.ArrayList;
import java.util.List;

public class multiThread implements Runnable{
    List<Customer> CustomerList;
    ArrayList<Item> pizzaItems;
    static int orderNumber=0;
     public multiThread(List<Customer> CustomerList, ArrayList<Item> pizzaItems) {
         this.CustomerList=CustomerList;
         this.pizzaItems=pizzaItems;
     }

    @Override
    public void run() {
        for(Customer customer:CustomerList){
            System.out.println("------------------Next Order------------------");
            System.out.println(" ");
            System.out.println("Taking order for customer "+customer.getName()+" At counter "+Thread.currentThread().getName());
            System.out.println(" ");
            OrderInfo order=orderOperation.takeOrder(customer,pizzaItems,orderNumber++);
            orderOperation.prepareOrder(customer,order);
            orderOperation.DeliverOrder(customer,order);
            System.out.println("------------------Order Delivered------------------");
            System.out.println(" ");
        }
    }
}
