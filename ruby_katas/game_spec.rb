require_relative './game'

describe 'Game' do
  let (:g) {Game.new}

  def many_rolls(n, pins)
    n.times do
      g.roll(pins)
    end
  end

  it 'scores a gutter game' do
    many_rolls(20, 0)

    expect(g.score).to eq 0
  end

  it 'scores a game of all ones' do
    many_rolls(20, 1)

    expect(g.score).to eq 20
  end

  it 'scores a spare' do 
    many_rolls(1, 5)
    many_rolls(1, 5)
    many_rolls(1, 3)
    many_rolls(17, 0)

    expect(g.score).to eq 16
  end

  it 'scores a strike' do 
    many_rolls(1, 10)
    many_rolls(1, 3)
    many_rolls(1, 4)
    many_rolls(16, 0)

    expect(g.score).to eq 24
  end

  it 'scores a perfect game' do 
    many_rolls(12, 10)

    expect(g.score).to eq 300
  end
end