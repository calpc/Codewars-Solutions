def persistence(n):
    if n < 10:
        return 0
    product = 1
    while n > 0:
        product = product * (n % 10)
        n = n // 10
    return 1 + persistence(product)
