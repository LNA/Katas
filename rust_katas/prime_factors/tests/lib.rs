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

//#[test]
//fn it_gives_three_for_three() {
//  assert_eq!(prime(3), [3]);
//}

//#[test]
//fn it_gives_two_and_two_for_four() {
//  assert_eq!(prime(4), [2,2])
//}
