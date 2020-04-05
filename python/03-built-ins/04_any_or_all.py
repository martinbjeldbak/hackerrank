# https://www.hackerrank.com/challenges/any-or-all/problem?h_r=next-challenge&h_v=zen

n = int(input())
values = [i for i in input().split()]

reversed_values = [("".join(reversed(v))) for v in values]

if any([int(v) < 0 for v in values]):
    print(False)
else:
    print(any([v == reversed_values[index] for index, v in enumerate(values)]))

