package Threads;

import model.food.*;
import model.order.Customer;
import model.order.OrderInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        runRunnableInterface();
    }
    public static void runRunnableInterface() throws ExecutionException, InterruptedException{
        long startTime = System.currentTimeMillis();
        OrderInfo order=new OrderInfo();
        List<Customer> customer=getCustomer();
        ArrayList<Item> pizzaItems = getItems();
        List<Customer> customerQ1 = customer.subList(0,2);
        List<Customer> customerQ2 = customer.subList(2,4);
        List<Customer> customerQ3 = customer.subList(4,6);

        multiThread Process1 = new multiThread(customerQ1,pizzaItems);
        multiThread Process2 = new multiThread(customerQ2,pizzaItems);
        multiThread Process3 = new multiThread(customerQ3,pizzaItems);

        Thread t1 = new Thread(Process1);
        Thread t2 = new Thread(Process2);
        Thread t3 = new Thread(Process3);
        t1.setName("Counter 1");
        t2.setName("Counter 2");
        t3.setName("Counter 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(" ");
        System.out.println("Total time taken - " + (System.currentTimeMillis() - startTime));
        System.out.println(" ");
    }

    private static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new CheeseBurstPizza());
        items.add(new DeluxeVeggiePizza());
        items.add(new PeppyPaneerPizza());
        items.add(new FarmHousePizza());
        return items;
    }

    private static List<Customer> getCustomer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Divya"));
        customers.add(new Customer("Shubham"));
        customers.add(new Customer("Jyoti"));
        customers.add(new Customer("Sakshi"));
        customers.add(new Customer("Bhargav"));
        customers.add(new Customer("Pragati"));
        return customers;
    }
}
