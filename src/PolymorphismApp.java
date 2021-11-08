public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee= new Employee("Agung");
        employee.sayHello("setiawan");

        employee=new Manager("wan");
        employee.sayHello("adi");

        employee=new VicePresident("neo");
        employee.sayHello("valdy");

        sayHello(new Employee("agung"));
        sayHello(new VicePresident("neo"));
        sayHello(new Manager("wan"));
    }
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vp=(VicePresident)employee;
            System.out.println("Hello VP "+vp.name);
        }else if(employee instanceof Manager){
            Manager manager=(Manager) employee;
            System.out.println("Hello Manager "+manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
