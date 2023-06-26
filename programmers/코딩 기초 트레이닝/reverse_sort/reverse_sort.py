def solution(n):
    s = str(int(n))
    a, b = int(max(s)), int(min(s))
    temp = ""
    for i in range(a, b-1, -1) :
        c = str(i)
        temp += c*s.count(c)
    return int(temp)