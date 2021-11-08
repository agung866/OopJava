public class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }

    @Override
    void sayHello(String name) {
        System.out.println("Hi "+name+", my same is vp "+this.name);
    }
}
