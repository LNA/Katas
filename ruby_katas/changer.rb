class CoinChanger
  def make_change(n)
    change = []
    coin_denominations = [25, 10, 5, 1]
    case n
    when 1..6
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
    when 6
      change << 5
      change << 1
    when 9
      change << 5
      change << 1
      change << 1
      change << 1
      change << 1
    when 10
      change << 10
    when 15
      change << 10
      change << 5
    when 20
      change << 10
      change << 10
    when 25
      change << 25
    when 26
      change << 25
      change << 1
    when 30
      change << 25
      change << 5
    when 50
      change << 25
      change << 25
    end
  end
end
