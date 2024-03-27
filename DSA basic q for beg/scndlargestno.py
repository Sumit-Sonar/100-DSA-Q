def print2largestno(arr):
    size = len(arr)
    arr.sort(reverse=True)

    for i in range(1,size):
        if arr[i] != arr[0]:
            print("the second largest number is :",arr[i])
            return
        
    print("there's no second largest number")

arr = [1,2,3,4,5,6]
print2largestno(arr)