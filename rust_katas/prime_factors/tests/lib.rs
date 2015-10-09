extern crate prime_factors;
use prime_factors::prime;

#[test]
fn it_gives_empty_vector_for_one() {
  assert_eq!(prime(1), [])
}

#[test]
fn it_gives_two_for_two() {
  assert_eq!(prime(2), [2]);
}

#[test]
fn it_gives_three_for_three() {
  assert_eq!(prime(3), [3]);
}

#[test]
fn it_gives_two_and_two_for_four() {
  assert_eq!(prime(4), [2,2])
}

#[test]
fn it_gives_five_for_five() {
  assert_eq!(prime(5), [5])
}

#[test]
fn it_gives_two_and_three_for_six() {
  assert_eq!(prime(6), [2,3])
}

#[test]
fn it_gives_seven_for_seven() {
  assert_eq!(prime(7), [7])
}

#[test]
fn it_gives_three_twos_for_eight() {
  assert_eq!(prime(8), [2, 2, 2])
}

#[test]
fn it_gives_two_threes_for_night() {
  assert_eq!(prime(9), [3, 3])
}

#[test]
fn it_gives_the_prime_of_a_really_really_really_big_num() {
  assert_eq!(prime(2*3*5*7*11*13), [2, 3, 5, 7, 11, 13])
}
