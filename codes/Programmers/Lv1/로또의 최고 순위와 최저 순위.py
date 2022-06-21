def solution(lottos, win_nums):
    answer = []
    count = 0
    for x in lottos:
        if x in win_nums:
            count += 1
    min_num = 7 - count if count > 0 else 6

    tmp = 0
    for x in lottos:
        if x == 0:
           tmp += 1
    if tmp == 0:
        max_num = min_num - tmp
    else:
        max_num = min_num - tmp if count > 0 else min_num - tmp + 1


    answer.append(max_num)
    answer.append(min_num)
    return answer


lottos = [44, 1, 0, 0, 31, 25]
win_nums = [31, 10, 45, 1, 6, 19]
# result = [3, 5]

lottos2 = [0, 0, 0, 0, 0, 0]
win_nums2 = [38, 19, 20, 40, 15, 25]
# result = [1, 6]

lottos3 = [45, 4, 35, 20, 3, 9]
win_nums3 = [20, 9, 3, 45, 4, 35]
# result = [1, 1]

lottos4 = [1, 2, 3, 4, 5, 6]
win_nums4 = [7, 8, 9, 10, 11, 12]
# result = [6, 6]

print(solution(lottos, win_nums))