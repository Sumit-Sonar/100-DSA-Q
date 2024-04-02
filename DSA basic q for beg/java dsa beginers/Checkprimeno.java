class Checkprimeno {

    public String checkPrime(int n) {
        if (n % 2 == 0) {
            System.out.println("not a prime number");
        } else if (n < 1) {
            System.out.println("not a prime number");
        } else if (n == 2) {
            System.out.println(" a prime number");

        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    System.out.println("not a prime no");

                }

            }
        }
        return null;
    }

    public static void main(String[] args) {
        Checkprimeno chck = new Checkprimeno();
        int n = 12;
        String answer = chck.checkPrime(n);
        System.out.println("Result: " + answer);

    }
}
