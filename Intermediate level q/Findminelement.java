class Findminelement{

    int findMin(int[] arr){
        int len = arr.length;
        int minele = arr[0];
        for(int i=0;i<=len-1;i++){
            if(arr[i]<minele){
                minele = arr[i];
            }
        }
        return minele;
    }
    public static void main(String[] args) {
        Findminelement min = new Findminelement();
        int[] arr = {1,2,3,0,-1,5};
        int ans = min.findMin(arr);
        System.out.println("min element is : " +ans);
    }
}