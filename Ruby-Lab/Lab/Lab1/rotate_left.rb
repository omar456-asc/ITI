def rotate_left(array)
  rotated_array = array[1..-1] + [array[0]]
  return rotated_array
end

# Example usage
print rotate_left([1, 2, 5])        # Output: [2, 5, 1]
puts "\n"
print rotate_left([1, 2, 3])        # Output: [2, 3, 1]
puts "\n"
print rotate_left([1, 2, 4, 6, 8])  # Output: [2, 4, 6, 8, 1]
