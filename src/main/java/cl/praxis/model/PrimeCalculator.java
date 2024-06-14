package cl.praxis.model;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

    private int numero;
    private List<Integer> primes = new ArrayList<>();

    public PrimeCalculator() {

    }

    public PrimeCalculator(int numero, List<Integer> primes) {
        this.numero = numero;
        this.primes = primes;
    }
    public boolean isPrime(int n){
        return true;
    }
    public List<Integer> generatePrimes(List<Integer> primes, int n){
        primes.add(n);
        return primes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }
}
