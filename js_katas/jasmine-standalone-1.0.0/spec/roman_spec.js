describe("RomanNumeral", function () {
    
  var numerals = {
    1: 'I',
    2: 'II',
    3: 'III',
    4: 'IV',
    5: 'V',
    6: 'VI',
    7: 'VII',
    9: 'IX',
    10: 'X',
    15: 'XV',
    19: 'XIX',
    20: 'XX',
    25: 'XXV',
    30: 'XXX',
    40: 'XL',
    45: 'XLV',
    50: 'L',
    54: 'LIV',
    90: 'XC',
    95: 'XCV',
    100: 'C',
    300: 'CCC'
  }

  _.each(numerals, function(value, key) {
    it('returns '+ value +' for '+ key, function () {
      expect(roman(key)).toEqual(value)
    })
  })
})