def hasZeroSumSublist(arr):
    s = set();
    total = 0
    for i in arr:
        total +=i;
        if total in s:
            return True
        s.add(total);
    return False

if __name__ == '__main__':
    arr = [4, -6, 3, -1, 4, 2, 7]
    if hasZeroSumSublist(arr):
        print("hasZeroSumSublist")
    else:
        print("not hasZeroSumSublist")