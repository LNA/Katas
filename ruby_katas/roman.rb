class Roman

    DENOMINATIONS = 
    [
      [1, 'I'],
      [2, 'II'],
      [5, 'V'],
      [9, 'IX'],
      [10, 'X'],
      [11, 'XI'],
      [14, 'XIV'],
      [19, 'XIX'],
      [20, 'XX'],
      [40, 'XL'],
      [50, 'L'],
      [90, 'XC'],
      [100, 'C']
    ].reverse 

  def self.of(n)
    conversions = ''
    DENOMINATIONS.each do |natural_number, roman_numeral|
      while n >= natural_number
        conversions << roman_numeral
        n -= natural_number
      end
    end
    conversions
  end
end