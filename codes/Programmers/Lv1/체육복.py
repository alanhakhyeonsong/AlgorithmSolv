def solution(n, lost, reserve):
    uniq_lost = set(lost) - set(reserve)
    uniq_reserve = set(reserve) - set(lost)

    for i in uniq_reserve:
        if i-1 in uniq_lost:
            uniq_lost.remove(i-1)
        elif i+1 in uniq_lost:
            uniq_lost.remove(i+1)

    return n - len(uniq_lost)


n1 = 5  # 전체 학생 수
lost1 = [2, 4]  # 잃어버린 학생 목록
reserve1 = [1, 3, 5]  # 여분이 있는 학생 목록
# result = 5
print(solution(n1, lost1, reserve1))