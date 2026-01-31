class Solution:
    def isValid(self, s: str) -> bool:
        list_stack = []
        opened = ["(","{",'[']
        closed = [')',"}",']']


        for i in s:
            if len(list_stack) == 0:
                if i in opened:
                    list_stack.append(i)
                else:
                    return False
            elif i in opened:
                list_stack.append(i)
            elif i in closed:
                if list_stack[-1] == "(" and i == ")" or list_stack[-1] == "{" and i == "}" or list_stack[-1] == "[" and i == ']':
                    list_stack.pop()
                else:
                    return False
        
        if len(list_stack) == 0:
            return True
        else:
            return False
            
            
        