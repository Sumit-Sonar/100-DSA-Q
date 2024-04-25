def sumofsubarray(array):
    current_sum = 0
    max_sum = float('-inf')

    for arr in array:
        current_sum = max(arr,current_sum*arr)
        max_sum = max(current_sum,max_sum)
    
    return max_sum

array = [-2, -3, 4, -1, -2, 1, 5, -3]
result = sumofsubarray(array)
print("max sum of sub array: ", result)
