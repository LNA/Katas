function roman(number) {
  var natural_denominations = [100, 90, 50, 40, 10, 9, 5, 4, 1]
  var roman_denominations = ['C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
  var conversion = ''

  for(var i = 0; i < natural_denominations.length; i++){
    while (number >= natural_denominations[i]){
      conversion = conversion + roman_denominations[i]
      number = number - natural_denominations[i]
    }
  }

  return conversion
}