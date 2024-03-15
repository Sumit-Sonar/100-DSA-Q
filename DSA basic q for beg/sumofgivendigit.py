def sumofgivendigit(n):
    digit = str(n)
    sum = 0
    for i in digit:
        sum += int(i)
    return sum

n = 678
print(sumofgivendigit(n))