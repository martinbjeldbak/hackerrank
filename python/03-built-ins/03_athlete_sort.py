# https://www.hackerrank.com/challenges/python-sort-sort/problem

n, m = map(int, input().split())

athletes = []

for _ in range(n):
    athletes.append([int(i) for i in input().split()])

k = int(input())

athletes = sorted(athletes, key=lambda a: a[k])

for athlete in athletes:
    print(" ".join([str(a) for a in athlete]))
