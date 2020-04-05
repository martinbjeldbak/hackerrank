# https://www.hackerrank.com/challenges/ginorts/problem
S = input()

lowercase_letters = [s for s in S if s.islower()]
uppercase_letters = [s for s in S if s.isupper()]
digits = [s for s in S if s.isdigit()]
odd_digits = "".join([digit for digit in digits if (int(digit) % 2) != 0])
even_digits = "".join([digit for digit in digits if (int(digit) % 2) == 0])

print("".join(
    sorted(lowercase_letters) +
    sorted(uppercase_letters) +
    sorted(odd_digits, key=lambda d: int(d)) +
    sorted(even_digits, key=lambda d: int(d))))
