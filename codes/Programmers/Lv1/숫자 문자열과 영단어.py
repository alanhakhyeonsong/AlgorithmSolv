# 2021 카카오 채용연계형 인턴십

def solution(s):
    alpha_list = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    num_list = [i for i in range(0, 10)]
    for alpha, num in zip(alpha_list, num_list):
        s = s.replace(alpha, str(num))
    return int(s)


# 다른 풀이
def solution2(s):
    nums = {'zero': '0', 'one': '1', 'two': '2', 'three': '3', 'four': '4', 'five': '5', 'six': '6', 'seven': '7', 'eight': '8', 'nine': '9'}
    for key, value in nums.items():
        s = s.replace(key, value)
    return int(s)


tc1 = 'one4seveneight'
# result: 1478
tc2 = '23four5six7'
# result: 234567
tc3 = '2three45sixseven'
# result: 234567
tc4 = '123'
# result: 123
print(solution2(tc1))
