// 500+ DSA questions = https://medium.com/techie-delight/500-data-structures-and-algorithms-practice-problems-35afe8a1e222

class Checkpairswithgivensum{

    public static void checkPairs(int[] arr,int target) {
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.printf("pairs found (%d,%d)",arr[i],arr[j]);
                    return;
                }
            }
        }
        System.out.println("pair not found");
    }

    public static void main(String[] args) {
        int[] arr = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        checkPairs(arr, target);
    }
}