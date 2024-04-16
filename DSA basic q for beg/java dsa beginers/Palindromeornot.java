public class Palindromeornot {

    boolean palindromeOrNot(int num){
        String strnum = Integer.toString(num); 
        StringBuilder reversed = new StringBuilder(strnum).reverse();
        String revr = reversed.toString(); 
        if(strnum.equals(revr)){
            System.out.println("it is palindrone");
            return true;
        }
        else{
           System.out.println("it is not palindrome");
           return false;
        }
        
        
    }
    public static void main(String[] args) {
        Palindromeornot pln = new Palindromeornot();
        int num = 12321;
        boolean ans = pln.palindromeOrNot(num);
        System.out.println(num+" is : "+ans);
    }
}
