# 1) Check if pair with given Sum exists in Array (Two Sum)

def checkpair(A,size,x):
    for i in range(0,size-1):
        for j in range(i+1,size):
            if(A[i]+A[j]==x):
                return 1
            
    return 0

if __name__ == "__main__":
    A = [0,1,2,3,2]
    x = -2
    size=len(A)
    if(checkpair(A,size,x)):
        print("pair is possible")
    else:
        print("pair is not possible")

