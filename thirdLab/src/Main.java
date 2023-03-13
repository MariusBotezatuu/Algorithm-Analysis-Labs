import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        FirstAlgorithm primeFinder = new FirstAlgorithm();
        List<Integer> primes = primeFinder.findPrimes(100);
        for (int prime : primes) {
            System.out.print(prime + " ");
        }

        System.out.println();

        SecondAlgorithm primeFinder2 = new SecondAlgorithm();
        List<Integer> primes2 = primeFinder2.findPrimes(100);
        for (int prime2 : primes2) {
            System.out.print(prime2 + " ");
        }

        System.out.println();

        ThirdAlgorithm primeFinder3 = new ThirdAlgorithm();
        List<Integer> primes3 = primeFinder3.findPrimes(100);
        for (int prime3 : primes3) {
            System.out.print(prime3 + " ");
        }

        System.out.println();

        FourthAlgorithm primeFinder4 = new FourthAlgorithm();
        List<Integer> primes4 = primeFinder4.findPrimes(100);
        for (int prime4 : primes4) {
            System.out.print(prime4 + " ");
        }

        System.out.println();

        FifthAlgorithm primeFinder5 = new FifthAlgorithm();
        List<Integer> primes5 = primeFinder5.findPrimes(100);
        for (int prime5 : primes5) {
            System.out.print(prime5 + " ");
        }

    }
}
