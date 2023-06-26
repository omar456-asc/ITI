def reduce_adjacent_elements(lst):
    # Initialize a new list with the first element of the input list
    new_lst = [lst[0]]

    # Loop through the rest of the elements in the input list
    for i in range(1, len(lst)):
        # If the current element is different from the previous element, add it to the new list
        if lst[i] != new_lst[-1]:
            new_lst.append(lst[i])

    # Return the new list with adjacent elements reduced to a single element
    return new_lst


# Call the function with a list of numbers
lst = [1, 2, 3, 3, 4, 4, 4, 5, 5]
new_lst = reduce_adjacent_elements(lst)

# Print the new list
print(new_lst)

# output
# [1, 2, 3, 4, 5]
