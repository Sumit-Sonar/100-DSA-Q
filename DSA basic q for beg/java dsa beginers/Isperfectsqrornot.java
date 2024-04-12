public class Isperfectsqrornot {

    void isPerfectsqr(int x){
        int sr = (int) Math.sqrt(x);
        if (sr*sr == x){
            System.out.println("it is a perfect square");
        }
        else{
            System.out.println("not a perfect square");
        }
    

    }
    public static void main(String[] args) {
        Isperfectsqrornot is = new Isperfectsqrornot();
        int x = 2500;
        is.isPerfectsqr(x);
      
    }
    
}
