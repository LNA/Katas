require_relative './prime_factors'
 
describe PrimeFactors do 
[
  [1, []],
  [2, [2]],
  [3, [3]],
  [4, [2,2]],
  [5, [5]],
  [6, [2, 3]],
  [7, [7]],
  [8, [2]*3],
  [9, [3, 3]],
  [2 * 3 * 5 * 7 * 11 * 13, [2, 3, 5, 7, 11, 13]]
  ].each do |n, factors|
    it "returns #{factors} for #{n}" do 
      expect(PrimeFactors.of(n)).to eq factors 
    end
  end
end