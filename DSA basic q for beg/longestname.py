def longestname(arr):
    longest = ""
    for names in arr:
        if len(names)>len(longest):
            longest = names
    return longest

arr = ["aman","sumit","prakash","deepika"]
print(longestname(arr))