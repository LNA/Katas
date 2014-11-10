class CoinChanger
  def make_change(n)
    change = []
    coin_denominations = [25, 10, 5, 1]
    coin_denominations.each do |coin|
      while n >= coin
        change << coin
        n -= coin
      end
    end
    change
  end
end
