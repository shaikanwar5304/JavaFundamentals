
// Notice : interf3 is not a public interface it is in same package and anotherfile, default 
// we can't run the program by java MulInh2.java
// as the compiler can only look to public class or public interface in other files even in same package
// we have to first compile the file where interf3 is defined
// i.e. javac MulInh.java
// next compile the current file
// i.e. javac MulInh2.java
//  run java MulInh2

public class MulInh2 implements interf3{
    public void interfaceName1(){
        System.out.println("Interface 1");
    }
    public void interfaceName2(){
        System.out.println("Interface 2");
    }
    public void display(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        // System.out.println(n1);//4 (Error : Ambiguous (as it is inherited from both interfaces))
        System.out.println(interf1.n1);//20
    }
}
