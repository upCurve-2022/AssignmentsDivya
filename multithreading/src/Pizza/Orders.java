package Pizza;

import model.order.Customer;

public class Orders {
    public static int getOrder(Customer customer){
        String name = customer.getName();
        int i=0;
        switch(name) {
            case "Divya":
            case "Pragati":
                i = 1;
                break;
            case "Sakshi":
                i = 3;
                break;
            case "Jyoti":
            case "Bhargav":
                i = 0;
                break;
            case"Shubham":
                i=2;
                break;
        }
        return i;
    }
}
