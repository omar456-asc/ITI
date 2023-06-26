def are_all_different(seq):
    return len(seq) == len(set(seq))


are_all_different([1, 5, 7, 9])
print("-----")
are_all_different([2, 4, 5, 5, 7, 9])


# ## output
# # True
# # -----
# # False
