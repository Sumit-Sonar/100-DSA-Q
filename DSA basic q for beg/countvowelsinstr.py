vowels =  ['a','e','i','o','u']

def countvowels(str):
    count=0
    for i in range(len(str)):
        for j in range(len(vowels)):
            if str[i] == vowels[j]:
                count+=1

    return count

str = 'abc de'
print(countvowels(str)) 

