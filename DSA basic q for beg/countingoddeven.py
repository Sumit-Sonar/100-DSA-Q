def countingoddeven(arr,size):
    even = 0
    odd = 0
    for i in range(size):
        if arr[i] % 2 == 0:
            even+=1
        else:
            odd+=1
    print("Even numbers : ",even)
    print("odd numbers : ",odd)

arr = [2,3,4,5,6]
size = len(arr)
countingoddeven(arr,size)