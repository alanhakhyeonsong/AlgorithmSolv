# 2022 KAKAO BLIND RECRUITMENT INTERNSHIP
from collections import defaultdict

def solution(id_list, report, k):
    answer = [0 for _ in range(len(id_list))]
    banned_cnt = defaultdict(int)
    report_dict = defaultdict(set)

    for id in list(set(report)):
        banned_cnt[id.split(" ")[1]] += 1
        report_dict[id.split(" ")[0]].add(id.split(" ")[1])

    for idx, x in enumerate(id_list):
        for y in report_dict[x]:
            if banned_cnt[y] >= 2:
                answer[idx] += 1

    return answer

# test case 1: [2, 1, 1, 0]
id_list1 = ["muzi", "frodo", "apeach", "neo"]
report1 = ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"]
k1 = 2

# test case 2: [0, 0]
id_list2 = ["con", "ryan"]
report2 = ["ryan con", "ryan con", "ryan con", "ryan con"]
k2 = 3

print(solution(id_list1, report1, k1))
print(solution(id_list2, report2, k2))