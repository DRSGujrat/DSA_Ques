class Solution:
    def evalRPN(self, tokens: list[str]) -> int:
        stack = []
        
        for i in tokens:
            if i.isdigit() or (i.startswith('-') and len(i) > 1):
                stack.append(int(i))
            else:
                num1 = stack.pop()
                num2 = stack.pop() 
                sign = i
             
                if sign == "+":
                    stack.append(num1 + num2)

                elif sign == "-":
                    
                    
                    stack.append(num2 - num1)
                elif sign == "*":
                    
                    
                    stack.append(num1 * num2)
                else:
                    if num1 != 0:
                        stack.append(int(num2 / num1))
                    

        return int(stack[0])