def solution(prices):
    _len = len(prices)
    answer = [0] * _len
    for i in range(_len):
        for j in range(i+1, _len):
            if prices[i] <= prices[j]:
                answer[i] += 1
            else:
                answer[i] += 1
                break

    return answer

def solution_stack(prices):
    _len = len(prices)
    answer = [i for i in range(_len-1, -1, -1)]

    stack = [0]
    for i in range(1, _len):
        while stack and prices[i] < prices[stack[-1]]:
            j = stack.pop()
            answer[j] = i - j
        stack.append(i)
    return answer

prices = [1, 2, 3, 2, 3]
# result: [4, 3, 1, 1, 0]
print(solution_stack(prices))