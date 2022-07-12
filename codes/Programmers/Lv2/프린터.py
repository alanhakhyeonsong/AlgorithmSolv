from collections import deque

def solution(priorities, location):
    answer = 0
    q = deque([(val, idx) for idx, val in enumerate(priorities)])

    while q:
        tmp = q.popleft()
        if q and max(q)[0] > tmp[0]:
            q.append(tmp)
        else:
            answer += 1
            if tmp[1] == location:
                break

    return answer


priorities = [1, 1, 9, 1, 1, 1]
location = 0
# result: 5
print(solution(priorities, location))