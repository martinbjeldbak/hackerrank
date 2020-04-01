# https://www.hackerrank.com/challenges/nested-list/problem

if __name__ == '__main__':
    grades = []

    for _ in range(int(input())):
        name = input()
        score = float(input())

        grades.append({'name': name, 'score': score})

    sorted_grades = sorted(grades, key=lambda x: x['score'])

    second_lowest_score = list(filter(lambda grade: grade['score'] > sorted_grades[0]['score'], sorted_grades))[0]

    for name in sorted([grade['name'] for grade in sorted_grades if grade['score'] == second_lowest_score]):
        print(name)
