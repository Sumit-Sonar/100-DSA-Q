public class Factofanumber {

    int Factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;

        }
        return fact;
    }

    public static void main(String[] args) {

        int n = 5;
        Factofanumber fct = new Factofanumber();
        int result = fct.Factorial(n);
        System.out.println("factorial of no : " + n + " : is :- " + result);

    }
}
