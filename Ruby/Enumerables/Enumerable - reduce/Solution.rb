def sum_terms(n)
  # your code here n**2 + 1 from 1..n
    (1..n).inject(0) {|m, n| 1+ n**2 + m}
end
