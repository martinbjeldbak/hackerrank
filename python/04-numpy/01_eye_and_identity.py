# https://www.hackerrank.com/challenges/np-eye-and-identity/problem

import numpy

numpy.set_printoptions(sign=' ')

n, m = [int(i) for i in input().split()]

print(numpy.eye(n, m))
