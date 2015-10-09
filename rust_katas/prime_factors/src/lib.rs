#[allow(dead_code)]
pub fn prime(num: i64) -> Vec<i64>  {
  let mut factors: Vec<i64> =  vec![];
  let mut num: i64 = num;
  let mut divisor: i64 = 2;

  while num > 1 {
    while num % divisor == 0 { factors.push(divisor); num/=divisor }
    divisor += 1
  }
  if num> 1 { factors.push(num) }
  return factors;
}
