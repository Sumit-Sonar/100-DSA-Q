public class Findmaxinmatrix {

    static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int elememts : row) {
                if (elememts > max) {
                    max = elememts;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int ans = findMax(matrix);
        System.out.println("max elemnt is : "+ans);
    }
}
