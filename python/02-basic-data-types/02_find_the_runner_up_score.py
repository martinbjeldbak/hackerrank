# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem?h_r=next-challenge&h_v=zen

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

    print(sorted(set(arr))[-2])

