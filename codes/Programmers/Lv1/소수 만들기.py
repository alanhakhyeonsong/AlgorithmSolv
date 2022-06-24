from itertools import combinations
import math

def is_prime(x):
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True


def solution(nums):
    answer = 0
    for x, y, z in list(combinations(nums, 3)):
        if is_prime(x + y + z):
            answer += 1
    return answer


nums1 = [1, 2, 3, 4]
# result: 1
print(solution(nums1))

nums2 = [1, 2, 7, 6, 4]
# result: 4
print(solution(nums2))