// checking if the first two arguments have same last digit
public class SameLastDigit {
    public static void main(String[] args) {
        System.out.println(args[0].charAt(args[0].length()-1)==args[1].charAt(args[1].length()-1));
    }
}
// anwar manohara : false
// anwar manohar : true