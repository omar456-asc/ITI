def leap_year?(year)
  if (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
    return true
  else
    return false
  end
end

# Example usage
puts "#{2012} is #{leap_year?(2012) ? 'leap year' : 'not leap year'}"
puts "#{1500} is #{leap_year?(1500) ? 'leap year' : 'not leap year'}"
puts "#{1600} is #{leap_year?(1600) ? 'leap year' : 'not leap year'}"
puts "#{2020} is #{leap_year?(2020) ? 'leap year' : 'not leap year'}"
puts "#{1998} is #{leap_year?(1998) ? 'leap year' : 'not leap year'}"

