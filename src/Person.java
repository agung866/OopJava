class Person {

    String name;
    String address;
    final String country="indonesia";

    Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    Person(String name){
        this(name,null);
    }
    Person(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Hello "+name+", My name is "+this.name);
    }


}
