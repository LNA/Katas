function roman(number) {

  var denominations = {

    100: 'C',
    90: 'XC',
    50: 'L',
    40: 'XL',
    20: 'XX',
    19: 'XIX',
    14: 'XIV',
    11: 'XI',
    10: 'X',
    9: 'IX',
    5: 'V',
    2: 'II',
    1: 'I'
  }

  var conversions = ''

  _.each(denominations, function(natural_num, roman_num) {
      console.log(roman_num)

    while (number >= natural_num){
      conversions += roman_num
      number -= natural_num
    }
  })
  return conversions
}