def nb_year(p0, percent, aug, p):
    times = 0
    while p0 < p:
        p0 += p0 * percent//100 + aug
        times += 1
    return times

# alternatives RECURSION
#     if (p0 >= p):
#         return 0
#     return 1 + nb_year(p0+p0*percent//100+aug, percent, aug, p)
