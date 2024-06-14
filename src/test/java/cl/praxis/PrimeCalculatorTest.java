package cl.praxis;

import cl.praxis.model.PrimeCalculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeCalculatorTest {

    private int numero;

    PrimeCalculator primeCalculator = new PrimeCalculator( );

    @Test
    public void testIsPrime(){
        assertEquals(true,primeCalculator.isPrime(numero));
    }

    @Test
    public void testGeneratePrimes(){
        List<Integer> primes = new ArrayList<>();
        int result = primeCalculator.generatePrimes(primes,numero).size();
        assertEquals(1,result);
    }


}
