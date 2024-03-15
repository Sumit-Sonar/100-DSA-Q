import math

def sumofsqrnnaturalno(n):
    sumofsqr=0
    sum=0
    for i in range(1,n+1):
        sumofsqr+=math.pow(i,2)
        sum+=i
    
    sqrofsumtotal = math.pow(sum,2)
    absdiff = abs(sumofsqr-sqrofsumtotal)
    return absdiff

n = 10
print(sumofsqrnnaturalno(n))
