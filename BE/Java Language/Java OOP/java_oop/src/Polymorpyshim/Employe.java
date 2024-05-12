package Polymorpyshim;

class Employe {
    String name;
    Employe(String name){
        this.name = name;
    }
    public void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
class Manager extends Employe{
    Manager(String name){
        super(name);
    }
    public void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
class VicePresident extends Employe{
    VicePresident(String name){
        super(name);
    }
    public void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}




