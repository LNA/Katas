class Checkout
  def initialize
    @total = 0
    @count = Hash.new(0)
  end

  def total
    @total
  end

  def scan(item)
    @total += PRICE[item]
    if details = DISCOUNT[item]
      @count[item] += 1
      @total -= details[:discount] if @count[item] % details[:quantity] == 0
    end
  end

  private
  PRICE = { "A" => 50, "B" => 30, "C" => 20, "D" => 15}

  DISCOUNT = { "A" => {:quantity => 3, :discount => 20},
               "B" => {:quantity => 2, :discount => 15}}

end

# refactor