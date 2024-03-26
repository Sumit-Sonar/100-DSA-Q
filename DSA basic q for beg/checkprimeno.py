def checkprimeno(n):

    if n % 2 == 0:
        print("Number is not prime")
    elif n ==2:
        print("number is prime")        

    elif n<=1:
        print("Number is not prime")
    else:
        for i in range(3,int(n**0.5)+1,2):
            if n % i == 0:
                print(n, " : Number is not prime")
                return False
        print(n ,": Number is prime")
        return True       
    
n = 49
checkprimeno(n)