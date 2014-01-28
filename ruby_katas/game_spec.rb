require_relative './game'

describe 'Game' do
  let (:g) {Game.new}

  def many_rolls(n, pins)
    n.times do
      g.roll(pins)
    end
  end

  it 'scores a gutter game' do
    many_rolls(20,0)
    g.score.should == 0
  end

  it 'scores a game with all ones' do 
    many_rolls(20,1)
    g.score.should == 20
  end

  it 'score a spare' do  
    many_rolls(1,5)
    many_rolls(1,5)
    many_rolls(1,3)
    many_rolls(17,0)
    g.score.should == 16
  end
  
end