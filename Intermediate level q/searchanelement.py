def searchAnElement(arr,target):
  
    for i in range(len(arr)):
        if target == arr[i]:
            print(target,"target found at index: ",i)
            return
    print("not found")

arr = [1,2,4,5,6]
target = 5
searchAnElement(arr,target)
    
