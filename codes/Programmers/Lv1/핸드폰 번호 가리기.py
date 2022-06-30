def solution(phone_number):
    answer = '*' * len(phone_number[:-4])
    answer += phone_number[-4:]
    return answer


phone_number = '01033334444'
# '*******4444'
print(solution(phone_number))