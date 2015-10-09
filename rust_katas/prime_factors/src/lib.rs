#[allow(dead_code)]
pub fn prime(num: i64) -> Vec<i64>  {
  let mut factors: Vec<i64> =  vec![];
  let mut count: i64 = num;

  if num > 1 {
    if num % 2 == 0 { factors.push(2); count/=2 }
    if count > 1 { factors.push(count) }
  }
  return factors;
}

