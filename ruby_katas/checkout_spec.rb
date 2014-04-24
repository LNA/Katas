require_relative './checkout'
# item  unit price  special price
# A       50          3 for 130
# B       30          2 for 45
# C       20           nope
# D       15           nope

describe 'Checkout' do

  let (:checkout) {Checkout.new}

  def price(string)
    string.split(//).each do |item|
      checkout.scan(item)
    end
    checkout.total
  end

  context "regular priced items" do 
  [
    ["A", 50],
    ["AB", 80],
    ["ABCD", 115]
    ].each do |item, cost|
      it "returns #{cost} for #{item}" do 
        price(item).should == cost
      end
    end
  end

  context "when A is on special" do
  [
  ["A" * 3, 130],
  ["A" * 4, 180],
  ["A" * 5, 230],
  ["A" * 6, 260]
  ].each do |item, cost|
      it "returns #{cost} for #{item}" do 
        price(item).should == cost
      end
    end
  end

  context "when A and B are on special" do
  [
    ["AAABB", 175]
    ].each do |item, cost|
      it "returns #{cost} for #{item}" do 
        price(item).should == cost
      end
    end
  end
end