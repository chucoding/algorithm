def solution(s):
    m = int(len(s)/2)
    return [s[m-1:m+1],s[m:m+1]][len(s) % 2]