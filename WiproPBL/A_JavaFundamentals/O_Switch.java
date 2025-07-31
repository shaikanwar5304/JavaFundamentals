// about switch statement in Java
// importance of break
public class O_Switch {
    public static void main(String[] args) {
        //switch accepts only int, byte, short, char, strings and enums
        //When a case is triggered it will execute until a break statement is reached.
        
        char grade ='D';
        switch(grade) {
           case 'A' :
              System.out.println("Excellent!"); 
              break;
           case 'B' :
           case 'C' :
              System.out.println("Well done");
              break;
           case 'D' :
              System.out.println("You passed");
           case 'F' :
              System.out.println("Better try again");
            case 2:
              System.out.println("You are in case 2");
           default :
              System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    } 
}
//char grade = 'B';
// Well done
// Your grade is B

//char grade = 'D';
//You passed
//Better try again
//You are in case 2
//Invalid grade
//Your grade is D

// int grade =4;
//Invalid grade
// Your grade is 4

//if there is no default
//Your grade is 4
