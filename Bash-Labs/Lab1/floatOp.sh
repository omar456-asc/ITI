#!/bin/bash
## Script accepts two floats from command line as parameters, and prints out their division, multiplication, sum, and subtraction result

## Parameters
##	1st parameter: 1st float
##	2nd parameter: 2nd float
## Exit codes
##	0: Success
##	1: Not enough parameters
##	2: Division by zero
##	3: NUM1 is not a float or contains non-numeric characters
##	4: NUM2 is not a float or contains non-numeric characters

# Check if two arguments were passed in
[ ${#} -ne 2 ] && echo "Not enough parameters" && exit 1

# Check if the second argument is not equal to zero
[ "$(echo "${2}" | bc -l)" != "0" ] || { echo "The second argument must be a non-zero floating point number."; exit 2; }

## Assign values to custom variables
FLOAT1=${1}
FLOAT2=${2}

## Check for float values and non-numeric characters
[[ ! ${FLOAT1} =~ ^[-+]?[0-9]*\.?[0-9]+$ ]] && { echo "NUM1 is not a float or contains non-numeric characters"; exit 3; }
[[ ! ${FLOAT2} =~ ^[-+]?[0-9]*\.?[0-9]+$ ]] && { echo "NUM2 is not a float or contains non-numeric characters"; exit 4; }

# Perform calculations
ADD=$(echo "$FLOAT1 + $FLOAT2" | bc -l)
SUBTRACT=$(echo "$FLOAT1 - $FLOAT2" | bc -l)
MULTIPLY=$(echo "$FLOAT1 * $FLOAT2" | bc -l)
DIVIDE=$(echo "$FLOAT1 / $FLOAT2" | bc -l)

# Print results
echo "Addition: $ADD"
echo "Subtraction: $SUBTRACT"
echo "Multiplication: $MULTIPLY"
echo "Division: $DIVIDE"

exit 0
