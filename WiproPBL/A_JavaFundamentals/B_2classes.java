// about how classes are compiled and .class files are generated
// about main method
class BA{
    public static void main(String[] args) {
        System.out.println("Hello from BA");// Hello from BA
    }
}
class BB{
    void main(){
        System.out.println("Hello from BB");// won't be executed 
        // main method should be static
    }
}
//2 .class files will be generated on compilation 