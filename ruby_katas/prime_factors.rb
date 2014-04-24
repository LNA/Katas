class PrimeFactors
  def self.of(n)
    primes = []
    divisor = 2
    while n > 1
      primes << divisor and n = n / divisor while n % divisor == 0
      divisor += 1
    end
    primes
  end
  
end