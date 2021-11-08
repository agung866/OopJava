package programmer.zaman.now.app;

import static programmer.zaman.now.data.Application.PROCESSORS;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(Version);

        System.out.println(MathUtil.sum(1,1,1,1,1,1,1));

        Country.City city =new Country.City();
        city.setName("subang");

        System.out.println(city.getName());
        System.out.println(PROCESSORS);
    }
}
