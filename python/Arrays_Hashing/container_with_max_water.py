class Solution:
    def maxArea(self, heights: list[int]) -> int:

        max_Area = 0
        left = 0
        right = left +1
        while left < len(heights) -1:    
            while right < len(heights):
                area = min(heights[left],heights[right]) * (right - left) 
                if area > max_Area:
                    max_Area = area

                right+=1
                
            left += 1
            right = left +1

        return max_Area