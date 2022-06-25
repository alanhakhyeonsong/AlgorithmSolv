def solution(d, budget):
    answer = 0
    d = sorted(d)
    for i in d:
        budget -= i
        if budget < 0:
            break
        answer += 1

    return answer


d1 = [1, 3, 2, 5, 4]
budget1 = 9
# result: 3

d2 = [2, 2, 3, 3]
budget2 = 10
# result: 4
print(solution(d1, budget1))