import java.util.*;

public class FourthAlgorithm {

    public static List<Integer> findPrimes(int n) {
        boolean[] c = new boolean[n + 1];
        Arrays.fill(c, true);
        c[1] = false;
        int i = 2;
        while (i <= n) {
            int j = 1;
            while (j < i) {
                if (i % j == 0 && j != 1) {
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
