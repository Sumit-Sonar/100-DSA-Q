public class Segregate0sand1s {

    int[] segregate(int[] array){
        int left = 0;
        int right = array.length-1;
        while (left<right) {
            while (array[left]==0 && left<right) {
                left+=1;
            }
            while (array[right]==1 && left<right) {
                right-=1;
            }

            if(left<right){
                array[left]=0;
                array[right]=1;
                left++;
                right--;
            }
           
        }
        return array;
    }
    public static void main(String[] args) {
        Segregate0sand1s seg = new Segregate0sand1s();
        int[] array = {0,1,0,1,0,1};
        for(int arr : array){
            System.out.print(arr+" ");
        }
        int[] ans = seg.segregate(array);
        
        System.out.print("After segregation: ");
        for (int num : ans) {
            System.out.print( num + " ");
        }    }
}
