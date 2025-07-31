// checking if a number is prime number
// we have to check if the numbers till sqrt of current numbers are divisible by the number
public class CheckPrime {
    
    public static void main(String[] args) {
        isPrime num= new isPrime(4);
        if(num.checkNum()){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
class isPrime{
    private int x;
    isPrime(int x){
        this.x=x;
    }
    public boolean checkNum(){
        boolean flag=true;
        for (int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                flag=false;
                break;
            }
        }if(flag){
            return true;
        }else{
            return false;
        }
    }
}