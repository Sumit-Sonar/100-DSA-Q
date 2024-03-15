def isarmstrong(n):
    number = str(n)
    lenofnumber = len(number)
    print(lenofnumber)
    armstrong=0
    for i in number:
        digit = int(i)
        armstrong+=digit**lenofnumber
    if armstrong == n:
        print("it is armstrong")
    else:
        print("not a armstrong")
    return armstrong

n = 1634
isarmstrong(n)