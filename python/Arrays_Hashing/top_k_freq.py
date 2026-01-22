from collections import defaultdict
#Given an integer array nums and an integer k, return the k most frequent elements within the array.

#The test cases are generated such that the answer is always unique.

#You may return the output in any order.

#Example 1:

#Input: nums = [1,2,2,3,3,3], k = 2
#Output: [2,3]
#Example 2:

#Input: nums = [7,7], k = 1

#Output: [7]
nums = [1,2,1,4,2,4,2,1]
k = 2
def top_k_freq(nums : list,k :int) -> list:
    count = defaultdict(int)
    freq  = [[] for i in range(len(nums) +1)]

    for i in nums:
        count[i] += 1


    result = []

    for n,c in count.items():
        freq[c].append(n)


    for i in range(len(freq)-1,0,-1):
        for j in freq[i]:
            result.append(j)
            if len(result) == k:
                return result
            
print(top_k_freq(nums,k))