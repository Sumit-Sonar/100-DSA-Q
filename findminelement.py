def findminelement(arr,n):
    minele = arr[0]

    for i in range(n):
        if(arr[i] < minele):
            minele = arr[i]
    return minele

arr = [5,6,1,0,-2,3,4]
n = len(arr)
print("min element is: ",findminelement(arr,n))
