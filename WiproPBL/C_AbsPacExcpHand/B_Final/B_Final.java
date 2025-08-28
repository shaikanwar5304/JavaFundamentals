// final methods can not be overridden
// final classes can not be inherited as in inheritance there might be changes in attributes so those can not be inherited

class one{
    public final void show(){
        System.out.println("one");
    }
}
final class two extends one{
    // public void show(){}//Cannot override the final method from one
}
// class three extends two{//Cannot inherit from final 'two'
public class B_Final {

}
