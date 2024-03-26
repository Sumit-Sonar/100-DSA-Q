def segregatezerosandones(arr):
    left = 0
    right = len(arr) - 1
    
    while(left<right):
        while(arr[left]==0) and left<right:
            left+=1
        while(arr[right]==1) and left < right:
            right-=1

        arr[left],arr[right] = arr[right],arr[left]

        left +=1
        right -=1

    return arr

arr = [0,1,0,1,0,1,0,1]
print("before : ",arr)
print("after : ",segregatezerosandones(arr))