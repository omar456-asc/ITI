n = int(input("Enter an integer: "))

# Compute the values of n, nn, and nnn
nn = int(str(n) + str(n))
nnn = int(str(n) + str(n) + str(n))

# Compute the result and print it
result = n + nn + nnn
print(result)

# Output:
# Enter an integer: 5
# 615
