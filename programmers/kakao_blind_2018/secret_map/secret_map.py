def solution(n, arr1, arr2):
    answer = []
    for i in range(n) :
        a,b=format(arr1[i], 'b'), format(arr2[i], 'b')
        a,b=(n-len(a))*"0"+a, (n-len(b))*"0"+b
        s=""
        for j in range(n) :
            s+=[" ","#"][int(a[j]) or int(b[j])]
        answer.append(s)
    return answer