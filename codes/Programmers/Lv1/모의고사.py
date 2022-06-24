def solution(answers):
    answer = []
    s1 = [1, 2, 3, 4, 5]
    s2 = [2, 1, 2, 3, 2, 4, 2, 5]
    s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    count = [0, 0, 0]

    for i, a in enumerate(answers):
        if a == s1[i % len(s1)]:
            count[0] += 1
        if a == s2[i % len(s2)]:
            count[1] += 1
        if a == s3[i % len(s3)]:
            count[2] += 1

    for i, c in enumerate(count):
        if c == max(count):
            answer.append(i + 1)
    return answer


answers = [1, 2, 3, 4, 5]
# 1번: 5
# 2번: 8
# 3번: 10
# return: 1
print(solution([1,3,2,4,2]))