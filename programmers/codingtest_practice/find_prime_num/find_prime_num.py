def solution(n):
    l = [0 for i in range(n+1)]
    for i in range(2, n+1) :
        for j in range(2, int(n**1/2)+1) :
            if(i*j > n): break
            l[i*j] = 1

    s = [i for i in l[2:n+1] if i == 0]
    return len(s)