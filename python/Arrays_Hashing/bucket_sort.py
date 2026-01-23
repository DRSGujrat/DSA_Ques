# implement bucket sort from scratch ( not optimal for arrays with large input values like 1000,1000000 etc)

sample = [5,1,1,4,3,1,0,0,2,4]
def bucket_sort(sample : list) -> list:
    min_val = min(sample)
    max_val = max(sample)
    size = max_val - min_val +1
    bucket = [0] * (size)

    for i in sample:
        bucket[i-min_val] += 1

    k = 0
    for i in range(len(bucket)):
        while bucket[i] > 0:
            sample[k] = i + min_val
            k = k +1
            bucket[i] -= 1

    return sample

    
print(bucket_sort(sample))