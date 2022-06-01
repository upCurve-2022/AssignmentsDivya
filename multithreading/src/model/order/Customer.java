package model.order;

public class Customer {
    private String Name;
     public String getName()
     {
         return Name;
     }
     public void setName(String Name){
         this.Name = Name;
     }
     public Customer(String Name)
     {
         this.Name=Name;
     }
     @Override
     public String toString()
     {
         return "Customer{"+
                 "name = "+Name+'\''+
                 '}';
     }
}
