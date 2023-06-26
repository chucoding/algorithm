def solution(n):
    x=1
    while True :
        if x**2 == n : return (x+1)**2
        elif x**2 > n : return -1
        x+=1