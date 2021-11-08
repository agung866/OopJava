package programmer.zaman.now.app;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Eko");
        customer1.setLevel(Level.PREMIUM);

        System.out.println(customer1.getName());
        System.out.println(customer1.getLevel());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level=Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for(var level1:level.values()){
            System.out.println(level1);
        }

    }




}
