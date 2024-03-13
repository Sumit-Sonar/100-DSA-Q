def average(array,elements):
    sum = 0
    
    for i in range(elements):
        sum += array[i]  
    
    return sum/elements

array = [10,2,3,4,5,6,7,8,9]
elements = len(array)

print(average(array,elements))