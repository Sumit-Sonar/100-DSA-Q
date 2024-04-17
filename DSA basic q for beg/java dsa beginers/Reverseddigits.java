public class Reverseddigits {

    String reversedDigits(int digits){
        String strdigit = Integer.toString(digits);
        StringBuilder reversed = new StringBuilder(strdigit).reverse();
        String rvr = reversed.toString();
        return rvr;

    }
    public static void main(String[] args) {
        Reverseddigits rvrd = new Reverseddigits();
        int digits = 123;
        String ans = rvrd.reversedDigits(digits);
        System.out.println(digits+" : after reversed : "+ans);
    }
}
