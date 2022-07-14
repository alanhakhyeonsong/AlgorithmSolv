def solution(s):
    answer = ''
    numbers = [int(i) for i in s.split()]
    answer += str(min(numbers)) + ' ' + str(max(numbers))

    return answer


s1 = '1 2 3 4'
# result: 1 4
s2 = '-1 -2 -3 -4'
# result: -4 -1
s3 = '-1 -1'
# result: -1 -1
print(solution(s3))