def starts_with_if?(string)
  return string.start_with?("if")
end

# Example usage
puts starts_with_if?("if condition")      # Output: true
puts starts_with_if?("else condition")    # Output: false
