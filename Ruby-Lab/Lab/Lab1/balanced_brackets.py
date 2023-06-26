def isBalanced(s):
    stack = []
    closeToOpen = {")": "(", "]": "[", "}": "{"}
    for c in s:
        if c in closeToOpen:
            if stack and stack[-1] == closeToOpen[c]:
                stack.pop()
            else:
                return "NO"
        else:
            stack.append(c)
    return "YES" if not stack else "NO"
