from collections import deque
def solution(n, computers):
    answer = 0
    visited = [False] * n
    queue = deque()
    while False in visited:
        queue.append(visited.index(False))
        while queue:
            cur = queue.popleft()
            visited[cur] = True
            for i in range(n):
                if visited[i] is False and computers[cur][i] == 1:
                    queue.append(i)
                    visited[i] = True
        answer += 1

    return answer


n1 = 3
computers1 = [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
# result: 2
n2 = 3
computers2 = [[1, 1, 0], [1, 1, 1], [0, 1, 1]]
# result: 1
print(solution(n2, computers2))