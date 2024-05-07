public class StrAllUniqueValues{

    public static boolean hasAllUniqueValues(String str){
        boolean[] seen = new boolean[256];

        for(int i=0;i<str.length();i++){
            char chr = str.charAt(i);
            if(seen[chr]){
                return false;
            }
            seen[chr] = true;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "abcade";
        if(hasAllUniqueValues(str)){
            System.out.println("has unique values");
        }
        else{
            System.out.println("not have unique values");
        }
    }
}