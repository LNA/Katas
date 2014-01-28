require_relative './changer'

describe 'CoinChanger' do

  let (:c) {CoinChanger.new}
  [
    [1, [1]],
    [2, [1,1]],
    [4, [1,1,1,1]],
    [5, [5]],
    [6, [5,1]],
    [9, [5,1,1,1,1]],
    [10, [10]],
    [15, [10,5]],
    [20, [10,10]],
    [25, [25]],
    [26, [25,1]],
    [30, [25,5]],
    [50, [25,25]]
  ].each do |n, change|
    it "returns #{change} for #{n} " do 
      c.make_change(n).should == change 
    end
  end
end