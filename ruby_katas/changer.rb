class CoinChanger
  def make_change(n)
    change = []
    coin_denominations = [25, 10, 5, 1]
    case n
    when 1..50
      while n >= 25
        n -= 25
        change << 25
      end
      while n >= 10
        change << 10
        n -= 10
      end
      if n >= 5
        change << 5
        n -= 5
      end
      if n >= 1
        n.times do
          change << 1
        end
      end
      change
    end
  end
end
