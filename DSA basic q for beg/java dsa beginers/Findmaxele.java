public class Findmaxele {

    int maxElement(int[] array){
        int maxele = array[0];
        for(int i : array){
            if(i>maxele){
                maxele=i;
            }
        }
        return maxele;
    }

    public static void main(String[] args) {
        Findmaxele fin = new Findmaxele();
        int[] array = {1,10,3,4,7};
        int ans = fin.maxElement(array);
        System.out.println("max element is : "+ ans);

    }
}
