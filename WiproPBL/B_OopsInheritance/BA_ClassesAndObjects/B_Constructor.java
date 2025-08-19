// working of constructors, introducting private, protected, public, default
class B_Constructor{ // public declaration is not necessary for execution 
    public static void main(String[] args) { // but main method is necessary
        Sample SampleObj=new Sample();//Sample() Constructor
        Sample SampleObj2=new Sample(102);//Sample(int n) Constructor
        //System.out.println(SampleObj.id_private);//private variables are not accessable 
        // private variables are limited to only class
        System.out.println(SampleObj.salary_protected);//0
        System.out.println(SampleObj.age_public);//0
        System.out.println(SampleObj2.name_default);// 0
    }
}

class Sample{
    private int id_private;
    protected int salary_protected;
    int name_default;
    public int age_public;
    Sample(){
        System.out.println("Sample() Constructor");
        id_private=101;
    }
    Sample(int n){
        System.out.println("Sample(int n) Constructor");
        id_private=n;
    }
}
