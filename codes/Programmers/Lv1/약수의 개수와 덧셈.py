def divisor_count(num):
    count = 0
    for i in range(1, num+1):
        if num % i == 0:
            count += 1

    return True if count % 2 == 0 else False

def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        if divisor_count(i):
            answer += i
        else:
            answer -= i
    return answer


left1 = 13
right1 = 17
# result: 13 + 14 + 15 - 16 + 17 = 43

left2 = 24
right2 = 27
# result: 24 - 25 + 26 + 27 = 52
print(solution(left1, right1))