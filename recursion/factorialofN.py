def factorialofN(n):
    if n==0 : 
        return 1
    else:
        factorial=n*factorialofN(n-1)
        return factorial
print(factorialofN(5))