import java.util.*;

public class FifthAlgorithm {

    public static List<Integer> findPrimes(int n) {
        boolean[] c = new boolean[n + 1];
        Arrays.fill(c, true);
        c[1] = false;
        int i = 2;
        while (i <= n) {
            int j = 2;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    c[i] = false;
                    break;
                }
                j++;
            }
            i++;
        }
        List<Integer> primes = new ArrayList<>();
        for (i = 2; i <= n; i++) {
            if (c[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

}
