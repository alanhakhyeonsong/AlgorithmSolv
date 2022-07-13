def solution(progresses, speeds):
    answer = []
    days = []
    _len = len(progresses)
    for i in range(_len):
        for cnt in range(1, 101):
            if (progresses[i] + speeds[i] * cnt) >= 100:
                days.append(cnt)
                break

    print(days)
    idx = 0
    for i in range(_len):
        if days[idx] < days[i]:
            answer.append(i - idx)
            idx = i

    answer.append(_len - idx)

    return answer


progresses1 = [93, 30, 55]
speeds1 = [1, 30, 5]
# result: [2, 1]

progresses2 = [95, 90, 99, 99, 80, 99]
speeds2 = [1, 1, 1, 1, 1, 1]
# result: [1, 3, 2]
print(solution(progresses1, speeds1))