string = input("Enter a string: ")

num_digits = 0
num_letters = 0

# Loop through each character in the string
for char in string:
    if char.isdigit():
        num_digits += 1
    elif char.isalpha():
        num_letters += 1

# Print the results
print("Number of digits in the string:", num_digits)
print("Number of letters in the string:", num_letters)

# Output:
# Enter a string: 123abc
# Number of digits in the string: 3
# Number of letters in the string: 3
