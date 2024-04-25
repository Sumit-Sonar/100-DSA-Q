def find_duplicates(my_list):
    size = len(my_list)
    dup = []
    for i in range(0,size-1):
        for j in range(i+1,size):
            if(my_list[i]==my_list[j]):
                dup.append(my_list[i])
    return dup
   
if __name__ == "__main__":
    my_list = [1, 2, 6, 1, 4, 5, 2, 6]
    result = find_duplicates(my_list)
    print("Duplicates are: ",result)
