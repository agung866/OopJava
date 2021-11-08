package programmer.zaman.now.data;

import programmer.zaman.now.anotation.Fancy;
@Fancy(name="AnimalApp",tags={"App","java"})
public interface Car extends HasBrand,IsMaintenance {
    void drive();
    int getTier();


    default boolean isBig(){
        return false;
    }
}
