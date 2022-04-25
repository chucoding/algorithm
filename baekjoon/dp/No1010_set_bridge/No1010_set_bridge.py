import math

n = int(input())
for i in range(n) :
    l = input().split(" ")
    a, b = int(l[0]), int(l[1])
    print(int(math.factorial(b) / ( math.factorial(b-a) * math.factorial(a))))