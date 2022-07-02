# 2020 카카오 인턴십
def solution(numbers, hand):
    answer = ''
    # 0 1 2 3 4 5 6 7 8 9 *(10) #(11)
    grid = [[1,0], [0,3], [1,3], [2,3], [0,2], [1,2], [2,2], [0,1], [1,1], [2,1], [0,0], [2,0]]
    left, right = 10, 11
    for i in numbers:
        if i in [1, 4, 7]:  # left
            left = i
            answer += 'L'
        elif i in [3, 6, 9]:  # right
            right = i
            answer += 'R'
        else:
            tmp_l = abs(grid[i][0] - grid[left][0]) + abs(grid[i][1] - grid[left][1])
            tmp_r = abs(grid[i][0] - grid[right][0]) + abs(grid[i][1] - grid[right][1])
            if tmp_l == tmp_r:
                if hand == 'right':
                    right = i
                    answer += 'R'
                else:
                    left = i
                    answer += 'L'
            elif tmp_l > tmp_r:
                right = i
                answer += 'R'
            else:
                left = i
                answer += 'L'

    return answer


numbers1 = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
hand1 = 'right'
# result: LRLLLRLLRRL

numbers2 = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]
hand2 = 'left'
# result: LRLLRRLLLRR

numbers3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
hand3 = 'right'
# result: LLRLLRLLRL
print(solution(numbers1, hand1))