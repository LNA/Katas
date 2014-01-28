class CoinChanger
  def make_change(n)
    change = []
    coin_denominations = [25,10,5,1]
    coin_denominations.each do |denomination|
      while n >= denomination
        change << denomination
        n -= denomination
      end
    end
    change
  end    
end