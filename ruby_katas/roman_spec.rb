require_relative './roman'

describe Roman do 
[
  [1, 'I'],
  [2, 'II'],
  [3, 'III'],
  [4, 'IV'],
  [5, 'V'],
  [6, 'VI'],
  [7, 'VII'],
  [9, 'IX'],
  [10, 'X'],
  [11, 'XI'],
  [12, 'XII'],
  [19, 'XIX'],
  [20, 'XX'],
  [21, 'XXI'],
  [25, 'XXV'],
  [29, 'XXIX'],
  [30, 'XXX'],
  [40, 'XL']

  ].each do | natural_number, roman_numeral |
    it "converts #{natural_number} to #{roman_numeral}" do 
      Roman.of(natural_number).should == roman_numeral
    end
  end
end