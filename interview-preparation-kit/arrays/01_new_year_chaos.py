def bribeForward(index, q):
    q = q.copy()

    if index + 1 >= len(q):
        return q # unable to swap, return original list

    # person_index = q.index(person)
    person = q[index]
    swapee = q[index+1]

    q[index+1] = person
    q[index] = swapee

    return q

def recursivelyBribeForward(position, numBribes, queue):
    if numBribes > 2:
        return [queue]

    data = {}

    for index, _ in enumerate(queue):
        updated_list = bribeForward(index, queue)
        if numBribes in data:
            data[numBribes] += recursivelyBribeForward(index, numBribes + 1, updated_list)
        else:
            data[numBribes] = []

    return data

def bribes(position, queue):
    if position + 1 == len(queue):
        return []
    return [bribeForward(position, queue)] + bribes(position + 1, queue)


def minimumBribes(q):
    original_list = sorted(q, reverse=True)
    reversed_q = list(reversed(q))

    print(original_list)
    print('')

    print(f"Looking for {reversed_q}")


    for index, bribe in enumerate(bribes(0, original_list)):
        print(f"For bribe combination {bribe} (beginning index {index})")

        # With + 2 moves
        for x, b in enumerate(bribes(index, bribe)):
            if reversed_q in b:
                return 1
            if reversed_q in bribes(x, b):
                return 2


    # print(recursivelyBribeForward(0, 0, original_list))
    # print(recursivelyBribeForward(0, 0, original_list).count(list(reversed(q + [2, 3, 4,2]))))

    return list(q)

test_cases = int(input())

for _ in range(test_cases):
    t = int(input()) # number of people in queue
    final_state = list(map(int, input().split()))

    minimumBribes(final_state)
