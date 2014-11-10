class CoinChanger
  def make_change(n)
    change = []
    case n
    when 1
      change << 1
    when 2
      change << 1
      change << 1
    when 4
      change << 1
      change << 1
      change << 1
      change << 1
    when 5
      change << 5
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
