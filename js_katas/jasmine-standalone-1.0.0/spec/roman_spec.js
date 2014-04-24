describe("RomanNumeral", function () {
  var numerals = {
    1: 'I',
    2: 'II',
    4: 'IV',
    5: 'V',
    10: 'X',
    20: 'XX',
    25: 'XXV',
    29: 'XXIX',
    30: 'XXX',
    40: 'XL',
    45: 'XLV',
    50: 'L',
    54: 'LIV',
    90: 'XC',
    99: 'XCIX',
    100: 'C',
    300: 'CCC'
  }

  _.each(numerals, function(roman_num, natural_num){
    it('returns' + roman_num + 'for' + natural_num, function(){
      expect(roman(natural_num)).toEqual(roman_num)
    })
  })
})