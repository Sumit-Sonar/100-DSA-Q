import sys
N = 4
M = 4

def findmaxeleinmatrix(mat):
    maxEle = -sys.maxsize-1

    for i in range(N):
        for j in range(M):
            if(mat[i][j] > maxEle):
                maxEle = mat[i][j]
    return maxEle

mat =  [[1, 2, 3, 4],
           [25, 6, 7, 8],
           [9, 10, 110, 12],
           [13, 14, 15, 16]]

print("max element is : ",findmaxeleinmatrix(mat))