# 2021 KAKAO BLIND RECRUITMENT
def solution(new_id):
    answer = ''
    tmp = new_id.lower()
    for i in tmp:
        if i.isalnum() or i == '-' or i == '_' or i == '.':
            answer += i
    # print(answer)

    while '..' in answer:
        answer = answer.replace('..', '.')
    # print(answer)

    answer = answer[1:] if answer[0] == '.' and len(answer) > 1 else answer
    answer = answer[:-1] if answer[-1] == '.' else answer
    # print(answer)

    if len(answer) == 0:
        answer = 'a'
    if len(answer) >= 16:
        answer = answer[:15]
        if answer[-1] == '.':
            answer = answer[:-1]
    # print(answer)

    if len(answer) <= 2:
        tmp = answer[-1]
        while len(answer) != 3:
            answer += tmp
    # print(answer)

    return answer


tc1 = '...!@BaT#*..y.abcdefghijklm'
tc2 = 'z-+.^.'
tc3 = '=.='
tc4 = '123_.def'
tc5 = 'abcdefghijklmn.p'
print('결과: ' + solution(tc3))