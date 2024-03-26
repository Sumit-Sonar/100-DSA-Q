def reversedigits(n):
    strnum = str(n)
    num = strnum[::-1] 
    intnum = int(num)
    return intnum

n = 123
print(reversedigits(n))