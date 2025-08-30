// accessing file via io operations
// just for understanding different types of errors
import java.io.FileInputStream;

public class FileNotFound {
    public static void main(String[] args) {
        try{// A.txt contains Abcd
            FileInputStream fx = new FileInputStream("A.txt");
            System.out.println(fx.read());//65 (first character of A.txt i.e A)
            System.out.println(fx.read());//98 (second character of A.txt i.e b)
            fx.read();
            fx.read();
            System.out.println(fx.read());// -1 (end of file)
            System.out.println(fx.read());// -1 (end of file)
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            FileInputStream fx = new FileInputStream("NoFile.txt");
        }catch(Exception e){
            System.out.println(e);//java.io.FileNotFoundException: NoFile.txt (The system cannot find the file specified)
        }
    }
}