def solution(nums):
    tmp = list(set(nums))
    size = len(nums) // 2
    answer = size if size <= len(tmp) else len(tmp)
    return answer


nums1 = [3, 1, 2, 3]
# result = 2
nums2 = [3, 3, 3, 2, 2, 4]
# result = 3
nums3 = [3, 3, 3, 2, 2, 2]
# result = 2

print(solution(nums3))