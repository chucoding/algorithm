def solution(x):
    s=0;
    tmp = x;
    while tmp>=1:
        s+=tmp%10
        tmp//=10
    return x%s == 0
