def solution(strings, n):
    dic = {}
    for s in strings :
        dic[s] = s[n]
    return list(dict(sorted(dic.items(), key=lambda x: (x[1], x[0]))))
