package pascaltriangle.company;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;

public class BinomialTheorem {
    public static int calculateBinomial(int n, int k) {
        if (k > n)
            throw new InvalidParameterException();
        int result = (calculateFactorial(n))/(calculateFactorial(n-k) * calculateFactorial(k));
        return result;
    }

    private static int calculateFactorial(int n) {
        if ( n < 2)
            return 1;
        else
        {
            int result = 1;
            for (int i = 2; i <=n; i++)
            {
                result *= i;
            }
            return result;
        }
    }
}
