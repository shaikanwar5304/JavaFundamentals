class Sample{
    private int id_private;
    protected int salary_protected;
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
class B_Constructor{
    public static void main(String[] args) {
        Sample SampleObj=new Sample();//Sample() Constructor
        Sample SampleObj2=new Sample(102);//Sample(int n) Constructor
        //System.out.println(SampleObj.id_private);//private variables are not accessable 
        // private variables are limited to only class
        System.out.println(SampleObj.salary_protected);//0
        System.out.println(SampleObj.age_public);//0
    }
}
