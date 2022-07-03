def solution(grade):
    first = sum(grade)
    for i in range(1, len(grade)-1):
        if grade[i-1] > grade[i] and grade[i] < grade[i+1]:
            grade[i-1] = grade[i]
        elif grade[i-1] < grade[i] and grade[i] > grade[i+1]:
            if (grade[i] - grade[i-1]) > (grade[i] - grade[i+1]):
                grade[i] = grade[i+1]
            else:
                grade[i] = grade[i-1]
    print(grade)

    for i in range(len(grade)-1, 0, -1):
        if grade[i] < grade[i-1]:
            grade[i-1] = grade[i]

    print(grade)
    then = sum(grade)
    return first - then


grade1 = [2, 1, 3]
# result: 1
grade2 = [1, 2, 3]
# result: 0
grade3 = [3, 2, 3, 6, 4, 5]
# result: 3
grade4 = [1, 1, 1]
# result: 0
grade5 = [3, 2, 1]
# result: 3
grade6 = [3, 5, 2, 1]
# result: 7
print(solution(grade6))