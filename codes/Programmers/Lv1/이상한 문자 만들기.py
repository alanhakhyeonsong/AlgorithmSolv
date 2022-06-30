def solution(s):
    answer = []
    _list = list(s.split(' '))
    print(_list)
    for st in _list:
        tmp = ''
        for i, c in enumerate(st):
            if i % 2 == 0:
                tmp += c.upper()
            else:
                tmp += c.lower()
        answer.append(tmp)
    return ' '.join(answer)


s = 'try hello world'
s2 = 'abc abc abc '
s3 = ' aaaa '
s4 = 'hello world        '
# return: 'TrY HeLlO WoRlD'
# 하나 이상의 공백 문자 포함됨
# 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
print(solution(s4))