// if a method in parent class is public it can only be public in child class
// we can't reduce the visibility of inherited methods (like making it protected or private or default)
// if the method in parent class is protected it can only be protected or public in child class
// visibility order : public > protected > default > private
package MethodOverRestriction;

public class restriction extends A{
    // restriction is only for methods i think as variables are working fine with restricted datatype
    // int protectedVar = 5; // no error 
    private int protectedVar = 5;

    // protected method in parent can't be default in child (makes it less visible)
    //void protectedMethod(){}// access modifier is more restrictive than the parent class

    public void protectedMethod(){
         System.out.println("I'm protectedMethod in restriction");
    }// access modifier is less restrictive

}