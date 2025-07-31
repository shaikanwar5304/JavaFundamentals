// break and continue statements in Java
// break exits the loop, continue skips the current iteration
public class S_BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break Statement\n....................");

        for(int i=1;i<=5;i++)
        {
            if(i==4) break;
            System.out.println(i);//1 2 3
        }
        System.out.println("Continue Statement\n....................");

        for(int i=1;i<=5;i++)
        {
            if(i==4) continue;
            System.out.println(i);//1 2 3 5
        }
    }
}
