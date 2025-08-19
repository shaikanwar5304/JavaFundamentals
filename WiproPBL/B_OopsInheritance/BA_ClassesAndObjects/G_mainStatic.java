//statics will exec first prior to main
public class G_mainStatic {
    static{
        System.out.println("before main");
    }
    public static void main(String[] args) {

        System.out.println("inside main");
    }

    static{
        System.out.println("after main");
    }
}
/*
 * before main
 * after main
 * inside main
 */