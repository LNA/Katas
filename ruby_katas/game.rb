class Game
  def initialize
    @score = 0
    @frame = 0
    @index = 0
    @rolls = []
  end

  def roll(pins)
    @rolls << pins
  end

  def score
    while @frame < 10
      if @rolls[@index] == 10 
        @score += 10 + @rolls[@index + 1] + @rolls[@index + 2]
        @index += 1
      elsif @rolls[@index] + @rolls[@index + 1] == 10
        @score += 10 + @rolls[@index + 2]
        @index += 2
      else
        @score += @rolls[@index] + @rolls[@index + 1]
        @index += 2
      end
      @frame += 1
    end
    @score
  end
end