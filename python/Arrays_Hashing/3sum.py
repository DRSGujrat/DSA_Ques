class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = []
        nums.sort()
        print(nums)
        
       
        for i , a in enumerate(nums):
            if a > 0:
                break
            if i > 0 and a == nums[i - 1]:
                continue
            j = i+1
            k = len(nums) -1
            while j < k:
                sum_0 = a + nums[j] +nums[k]
                if sum_0 > 0 and j < k:
                    k -= 1
                elif sum_0 < 0 and j < k:
                    j += 1
                else:
                    result.append([a,nums[j],nums[k]])
                    j +=1
                    k -=1
                    while nums[j] == nums[j - 1] and j < k:
                        j += 1
            


            

        return result