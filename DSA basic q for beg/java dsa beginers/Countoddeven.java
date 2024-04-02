
public class Countoddeven {

    public int[] count(int[] l, int size) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < size; i++) {
            if (l[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};

    }

    public static void main(String[] args) {
        Countoddeven cnt = new Countoddeven();
        int[] l = { 1, 2, 3, 4, 5};
        int size = l.length;
        int[] result = cnt.count(l, size);
        System.out.println("evens: " + result[0]);
        System.out.println("odds: " + result[1]);


    }
}