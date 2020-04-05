# https://www.hackerrank.com/challenges/python-eval/problem

n, x = [int(i) for i in input().split()]

subjects = []

for _ in range(x):
    subjects.append([float(i) for i in input().split()])


student_marks = zip(*subjects)

[print("{:.1f}".format(sum(marks) / x)) for marks in student_marks]
