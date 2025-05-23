def sumofNnumbers(n):
    if n==0:
        return 0
    else:
        sum=n+sumofNnumbers(n-1)
        return sum
print(sumofNnumbers(4))