public class PesonApp {
    public static void main(String[] args) {
       var person1=new Person("agung","jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("wan");


       Person person2=new Person("danil");
       Person person3;

       person3=new Person();
       person3.name="joko";

       person3.sayHello("Budi");
    }
}
