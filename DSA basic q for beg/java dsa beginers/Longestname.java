public class Longestname {

    String longestName(String[] array){
        String name = "";
        for(String n : array){
            if(name.length()<n.length()){
                name = n;
            }
        } 
        return name;
    }
    public static void main(String[] args) {
        Longestname ln = new Longestname();
        String[] array = {"aman","chaman","barmani"};

        String answer = ln.longestName(array);
        System.out.println("longest is : " + answer);
     }
}
