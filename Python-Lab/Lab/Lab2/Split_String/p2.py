def front_back(a, b):
    # find the midpoint of the two strings
    a_mid = (len(a) + 1) // 2
    b_mid = (len(b) + 1) // 2
    # concatenate the front and back halves of each string
    a_front = a[:a_mid]
    a_back = a[a_mid:]
    b_front = b[:b_mid]
    b_back = b[b_mid:]
    # return the concatenated string
    return a_front + b_front + a_back + b_back


front_back("abcd", "efgh")
print("-----")
front_back("abcde", "fghij")


# ## output
# # 'abefcdgh'
# # -----
# # 'abfgcdehij'
