def sum_except_seventeen(array)
  sum = 0
  skip_next = false

  array.each do |num|
    if skip_next
      skip_next = false
    elsif num == 17
      skip_next = true
    else
      sum += num
    end
  end

  return sum
end

# Example usage
puts sum_except_seventeen([3, 5, 17, 6])     # Output: 9
puts sum_except_seventeen([3, 5, 1, 17])     # Output: 9
puts sum_except_seventeen([3, 17, 17, 17])     # Output: 3
puts sum_except_seventeen([])                # Output: 0
