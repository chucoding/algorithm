def solution(s):
    answer=""
    l = [ ord(i) for i in s ]
    for i in sorted(l, reverse=True):
        answer += chr(i)
    return answer