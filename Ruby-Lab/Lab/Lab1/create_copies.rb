def create_copies(string, n)
  result = ''
  n.times do
    result += string
  end
  return result
end

# Example usage
puts create_copies('a', 1)   # Output: a
puts create_copies('a', 2)   # Output: aa
puts create_copies('a', 3)   # Output: aaa
puts create_copies('a', 4)   # Output: aaaa
puts create_copies('a', 6)   # Output: aaaaaa
