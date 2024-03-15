def arraysortedornot(arr):
    n = len(arr)
    for i in range(n-1):
        if arr[i]>arr[i+1]:
            print(arr,": array is not sorted")
            return False
        
    print(arr,": arr is sorted")
    return True

arr = [1,2,3,6,4,5]
arraysortedornot(arr)
