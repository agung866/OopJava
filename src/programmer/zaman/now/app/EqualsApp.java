package programmer.zaman.now.app;

public class EqualsApp {
    public static void main(String[] args) {
        String first ="agung";
        first=first+" "+"Setiawan";

        System.out.println(first);

        String second="agung Setiawan";
        System.out.println(second);

        System.out.println(first==second);
        System.out.println(first.equals(second));

        String third ="agung Setiawan";
        System.out.println(second==third);
       System.out.println(first.equals(third));
    }
}
