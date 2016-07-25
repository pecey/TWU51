import java.util.ArrayList;

public class primeFactorGenerator {
    public static ArrayList<Integer> generate(int factorOf) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (factorOf % 2 == 0)
            primeFactors.add(2);
        while (factorOf % 2 == 0)
            factorOf = factorOf / 2;
        int limit = (int)Math.sqrt(factorOf);
        for (int i = 3; i <= limit; i = i + 2) {
            if (factorOf % i == 0)
                primeFactors.add(i);
            while (factorOf % i == 0)
                factorOf = factorOf / i;
        }
        for(int element: primeFactors)
            System.out.println(element);
        return primeFactors;
    }
}
