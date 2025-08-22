// if you want some set of classes have common behavior you write in a class and inherit from that
// but if you also want those classes to have their unique behavior you need to tell them these are the methods you need to implement yourselves
// that's why we use abstract classes
// abstract classes will only allow the creation of subclasses
// they cannot be instantiated directly
// why not interfaces?
// abstract methods can have instance variable where interfaces cannot (only final variables)
// abstract classes can have constructors 
// abstract classes can have methods with any access modifier
// etc...
abstract class Animal{
    int legs;
    Animal(int legs){
        this.legs = legs;
    }
    Animal(){}
    abstract void sound();//abstract method won't have body

    //abstract method only for the abstract class

    void eat(){//abstract class can have non-abstract methods
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    // abstract void smell();//error: only abstract classes can have abstract methods

    // abstract method must be implemented in the subclass
    void sound(){
        legs = 4;// we can change the value of instance variable of abstract class
        System.out.println("Barking");
    }
}
public class D_Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal();//error: Animal is abstract; cannot be instantiated
        Animal a = new Dog();
        a.legs = 3;
        a.sound();//Barking
        a.eat();//Eating
    }
}
