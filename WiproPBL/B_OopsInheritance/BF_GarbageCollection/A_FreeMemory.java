// Demonstration of memory being cleared
// objects which are no longer referenced via garbage collector
// in this example you may not see any objects explicitly
// but may be some unknown objects are created while running (those unused are getting cleared)
import java.util.*;
public class A_FreeMemory {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        System.out.println("Total Memory: "+rt.totalMemory());//Total Memory: 130023424 (bytes)
        System.out.println("Free Memory: "+rt.freeMemory());//Free Memory: 128093760 (bytes)
        rt.gc();
        System.out.println("Free Memory after gc: "+rt.freeMemory());//Free Memory after gc: 7768656 (bytes)
        System.out.println("Total Memory after gc: "+rt.totalMemory());//Total Memory after gc: 8388608 (bytes)
    }
}
//this decrease of memory is due to reduction of size of heap memory. used by jvm.
// that is the remaining memory is given back to os.