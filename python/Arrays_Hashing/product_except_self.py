array = [1,2,4,6]

prefix = 1

result = []
for i in range(len(array)):
    result.append(prefix)
    prefix = prefix * array[i]

print(result)
postfix = 1

for i in range(len(array)-1,-1,-1):
    result[i] *= postfix
    postfix *= array[i]


print(result)