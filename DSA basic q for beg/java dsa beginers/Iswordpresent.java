public class Iswordpresent {

    boolean isWordPresent(String word,String sentence){
        String[] s = sentence.split(" ");

        for(String i : s){
            if(word.equals(i)){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word = "hello!";
        String sentence = "hello! aman";
        Iswordpresent isw = new Iswordpresent();
        boolean ans = isw.isWordPresent(word, sentence); 
        System.out.println("answer is : "+ ans);
    }
}
