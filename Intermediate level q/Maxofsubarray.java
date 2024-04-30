public class Maxsumofsubarray {

    int maxSubArray(int[] arr){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE; 
        for(int i = 0; i < arr.length; i++){
            currentsum = Math.max(arr[i], currentsum + arr[i]); 
            maxsum = Math.max(currentsum, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Maxsumofsubarray max = new Maxsumofsubarray();
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = max.maxSubArray(arr);
        System.out.println("max sum of subarray is : " + ans);
    }
}
