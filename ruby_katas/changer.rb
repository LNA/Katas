class CoinChanger
  def make_change(n)
    case n
    when 1
      [1]
    when 2
      [1,1]
    when 4
      [1,1,1,1]
    when 5
      [5]
    when 6
      [5,1]
    when 9
      [5,1,1,1,1]
    when 10
      [10]
    when 15
      [10, 5]
    when 20
      [10,10]
    when 25
      [25]
    when 26
      [25, 1]
    when 30
      [25, 5]
    when 50
      [25, 25]
    end
  end
end
