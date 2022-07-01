def solution(sizes):
    new_sizes = []
    for s in sizes:
        new_sizes.append([max(s), min(s)])

    max_w, max_h = 0, 0
    for i in range(len(new_sizes)):
        max_w = max(max_w, new_sizes[i][0])
        max_h = max(max_h, new_sizes[i][1])
    return max_w * max_h


sizes1 = [[60, 50], [30, 70], [60, 30], [80, 40]]
# result: 4000
sizes2 = [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
# result: 120
sizes3 = [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]
# result: 133
print(solution(sizes3))