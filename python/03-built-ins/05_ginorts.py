# https://www.hackerrank.com/challenges/ginorts/problem
S = input()

def sortRule(x):
    if x.islower():
        return (0, x)
    elif x.isupper():
        return (1, x)
    elif x.isdigit() and int(x) % 2 != 0:
        return (2, x)
    else:
        return (3, x)


print("".join(sorted(S, key=sortRule)))

