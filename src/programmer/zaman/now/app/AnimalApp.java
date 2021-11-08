package programmer.zaman.now.app;

import programmer.zaman.now.anotation.Fancy;
import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

@Fancy(name="AnimalApp",tags={"App","java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal=new Cat();
        animal.name="puss";
        animal.run();

    }
}
