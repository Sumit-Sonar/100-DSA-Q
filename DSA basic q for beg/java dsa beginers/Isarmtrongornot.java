public class Isarmtrongornot {

    int armstrongOrnot(int no){
        String str = String.valueOf(no);
        int size = str.length();
        int armstrong = 0;
        for(char i : str.toCharArray()){
            int digit = Character.getNumericValue(i);
            armstrong += Math.pow(digit, size);}
            if(armstrong==no){
                System.out.println("it is armstong");
            }
            else{
                System.out.println("not a armstrong");
            }
        
        return armstrong;
        }
    public static void main(String[] args) {
        Isarmtrongornot arm = new Isarmtrongornot();
        int no = 1634;
       int answer = arm.armstrongOrnot(no);
       System.out.println("number is : " + answer);
    }
}
