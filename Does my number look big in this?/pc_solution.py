def narcissistic( value ):
    if value < 10:
        return True
    sum = 0
    given = value
    power = len(str(value))
    while given != 0:
        sum += (given % 10)**power
        given //= 10
        
    return value == sum
