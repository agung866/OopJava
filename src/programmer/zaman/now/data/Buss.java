package programmer.zaman.now.data;

public class Buss implements Car{
    @Override
    public void drive() {
        System.out.println("Buss Drive");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
