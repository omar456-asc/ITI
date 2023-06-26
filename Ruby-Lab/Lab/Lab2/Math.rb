class Math1
  def calc(num1, num2, operator)
    validate_number(num1)
    validate_number(num2)
    validate_operator(operator)

    case operator
    when "+"
      result = num1 + num2
    when "-"
      result = num1 - num2
    when "*"
      result = num1 * num2
    when "/"
      validate_division_by_zero(num2)
      result = num1.to_f / num2
    else
      raise "Unsupported operator: #{operator}"
    end

    result
  end

  private

  def validate_number(number)
    unless number.is_a?(Numeric)
      raise "Invalid number: #{number}. Number argument should be a numeric value."
    end
  end

  def validate_division_by_zero(divisor)
    if divisor.zero?
      raise "Division by zero is not allowed."
    end
  end

  def validate_operator(operator)
    allowed_operators = ["+", "-", "*", "/"]
    unless allowed_operators.include?(operator)
      raise "Not supported operator: #{operator}."
    end
  end
end

# Example usage
calculator = Math1.new
puts calculator.calc(4, 2, "+")  # Output: 6
puts calculator.calc(4, 2, "-")  # Output: 2
puts calculator.calc(4, 2, "*")  # Output: 8
puts calculator.calc(4, 2, "/")  # Output: 2.0
puts calculator.calc(4, 0, "/")  # Output: Raises an error (Division by zero is not allowed)
puts calculator.calc(4, 2, "%")  # Output: Raises an error (Not supported operator: %)
