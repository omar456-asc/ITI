def add_last_character(string)
  if string.length >= 1
    last_char = string[-1]
    return last_char + string + last_char
  else
    return string
  end
end

# Example usage
puts add_last_character("cab")    # Output: cabcc
puts add_last_character("dabcd")  # Output: dabcdd
puts add_last_character("")  # Output: ajavaa
