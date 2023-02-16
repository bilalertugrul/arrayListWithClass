import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Bilal","Ertugrul"));
        customers.add(new Customer(1,"Said","Ertugrul"));
        customers.add(new Customer(1,"Nusret","Ertugrul"));

        customers.remove(0);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }


    }
}