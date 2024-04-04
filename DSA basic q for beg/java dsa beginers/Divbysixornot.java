import java.util.Scanner;

public class Divbysixornot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no to check whether it is devisble by six or not:");
        int no = scanner.nextInt();
        scanner.close();
        if(no%6==0){
            System.out.println("No is divisible");
        }
        else{
            System.out.println("No is not divisible");
        }

    }
}
