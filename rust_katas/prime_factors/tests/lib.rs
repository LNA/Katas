extern crate prime_factors;
use prime_factors::prime;

#[test]
fn of_two() {
    assert_eq!(prime(2), [2]);
}
