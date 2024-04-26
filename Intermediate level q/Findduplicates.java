import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Findduplicates {

    public static List<Integer> findDups(int[] array){
        List<Integer> dups = new ArrayList<>();
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    dups.add(array[i]);
                    break;
                }
            }
        }
        return dups;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,2,5,1,4};
        List<Integer> ans = findDups(array);
        System.out.println("before : "+Arrays.toString(array));
        System.out.println("dusplicates are : "+ans);
    }
}
