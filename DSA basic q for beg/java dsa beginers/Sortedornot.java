public class Sortedornot {

    boolean sortedOrNot(int[] arr){
      
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                System.out.println("arr is not sorted");
                return false;
            } 
            }
            System.out.println("arr is sorted");
        return true;
        
        
       
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Sortedornot srt = new Sortedornot();
        boolean ans = srt.sortedOrNot(arr);
        System.out.println(ans);
    }
}