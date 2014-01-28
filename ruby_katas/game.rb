class Game
	def initialize
		@score = 0
		@rolls = []
		@frame = 0
		@index = 0
	end

	def roll(pins)
		@rolls << pins
	end

	def score
		while @frame < 10
			if @frame[@index] + @rolls[@index + 1] == 10
				@score = @score + 10 + @rolls[@index + 2]
				@index = @index + 2
			else
				@score = @score + @rolls[@index] + @rolls[@index + 1]
				@index = @index + 2
			end
			@frame = @frame + 1
		end
		@score
	end
end 