def factorial(n):
    # if n==0:
    #     return 1
    # return n*factorial(n-1)
    fact=1
    while n>0:
        fact*=n
        n-=1
    return fact

n = 5
print(factorial(n))    
        