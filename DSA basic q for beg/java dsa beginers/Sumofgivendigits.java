public class Sumofgivendigits {

    int sumOfDigits(int digits){
        String strdigit = Integer.toString(digits);
        int sum = 0;
        for(int i=0;i<strdigit.length();i++){
            sum += Character.getNumericValue(strdigit.charAt(i)) ;
        }
        return sum;
    }
    public static void main(String[] args) {

        int digits = 555;

        Sumofgivendigits sum = new Sumofgivendigits();
        int ans = sum.sumOfDigits(digits);
        System.out.println(digits + " : sum is : " + ans);
        
    }
}
