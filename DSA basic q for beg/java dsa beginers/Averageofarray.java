class Averageofarray {

    public int avg(int[] arr, int length) {

        int sum = 0;
        for (int i = 0; i <  length; i++) {
            sum += arr[i];
        }
        return sum / length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int length = arr.length;
        Averageofarray ans = new Averageofarray();
        int result = ans.avg(arr, length);
        System.out.println(result);
    }
}