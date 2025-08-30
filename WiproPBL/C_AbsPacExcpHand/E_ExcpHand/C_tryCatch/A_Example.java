// Understanding try-catch block
public class A_Example {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }//System.out.println("there shouldn't be any code between try and catch");//Compile time error
        catch(Exception e){
            System.out.println(e);//java.lang.ArithmeticException
        }
    System.out.println("rest of the code");//rest of the code
    }
}