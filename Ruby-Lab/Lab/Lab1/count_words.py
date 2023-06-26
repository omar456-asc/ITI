def countWords(self, words1: List[str], words2: List[str]) -> int:
    c1 = collections.Counter(words1)
    c2 = collections.Counter(words2)
    count = 0
    for x in c1.keys():
        if c1[x] == 1 and c2[x] == 1:
            count += 1
    return count
