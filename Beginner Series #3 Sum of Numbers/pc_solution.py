def get_sum(a,b):
    if a == b:
        return a
    sum = 0
    low = min(a, b)
    high = max(a, b)
    for i in range(low, high+1, 1):
        sum += i
    return sum
