# Program to print the given digit in words

def printvalue(digit):
    if digit=='1':
        print("ONE",end= " ")
    elif digit=='2':
        print("TWO",end= " ")
    elif digit=='3':
        print("THREE",end= " ")
    elif digit=='4':
        print("FOUR",end= " ")
    elif digit=='5':
        print("FIVE",end= " ")
    elif digit=='6':
        print("SIX",end= " ")
    elif digit=='7':
        print("SEVEN",end= " ")
    elif digit=='8':
        print("EIGHT",end= " ")
    elif digit=='9':
        print("NINE",end= " ")
    elif digit=='10':
        print("TEN",end= " ")

def printword(N):
    i = 0
    length = len(N)
    while i<length:
        printvalue(N[i])
        i+=1

N = "678"
print(N,"in word") 
printword(N)

