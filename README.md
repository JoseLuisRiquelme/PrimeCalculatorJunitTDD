# 🎯 Prime Number Calculator

# 📖 Description

The goal of this exercise is to implement a PrimeCalculator class that contains methods to determine if a number is prime and to get a list of the first n prime numbers. You should use Test-Driven Development (TDD) and the JUnit library to create the tests and corresponding code.

# 🔧 Requirements

Method isPrime(int number)

This method should return true if the number is prime and false otherwise.
java
Copiar código
public boolean isPrime(int number);
Method generatePrimes(int n)

This method should return a list of the first n prime numbers.
java
Copiar código
public List<Integer> generatePrimes(int n);
# 🚀 Steps

Step 1: Write the Tests

Before writing any implementation, write unit tests for the isPrime and generatePrimes methods.
Use JUnit to create a test suite that verifies common and edge cases.
Step 2: Implement the isPrime Method

Implement the isPrime method to pass all the tests you wrote.
Consider both positive and negative numbers, as well as the numbers 0 and 1.
Step 3: Implement the generatePrimes Method

Implement the generatePrimes method to pass all the tests you wrote.
Ensure that the method properly handles values such as n = 0.
Step 4: Refactor

Refactor the code to improve clarity, efficiency, or any other aspect, making sure all tests still pass after the changes.
# 📝 Notes

Remember to apply the TDD cycle: write a failing test, implement the code to pass the test, and then refactor.
Make sure all tests pass before submitting your work.
