public class Digittoword {

    void printValue(char digit) {
        switch (digit) {
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
            case '0':
                System.out.print("zero ");
                break;
            default:
                break;
        }
    }

    void cnvrtToWord(String N) {
        int i = 0;
        int len = N.length();
        while (i < len) {
            printValue(N.charAt(i));
            i += 1;
        }
    }

    public static void main(String[] args) {
        String N = "123";
        Digittoword dtw = new Digittoword();
        System.out.print("the digit : "+N+" in word : ");
        dtw.cnvrtToWord(N);
    }
}
