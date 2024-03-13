import math

def isperfectsqrornot(x):
    if(x>=0):
        sr = int(math.sqrt(x))
        if sr*sr == x:
            print("perfect square root")
        else:
            print("not a perfect square root")

x = 2500
isperfectsqrornot(x)