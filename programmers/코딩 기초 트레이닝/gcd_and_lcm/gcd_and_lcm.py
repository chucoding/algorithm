def solution(n, m):
    big, small, div = (m, n, n) if n < m else (n, m, m)
    answer = [1,1]
    while div != 1 :
        if small % div == 0 and big % div == 0 :
            big, small = big/div, small/div
            answer[0] *= div
            div = small
        else :
            div -= 1
    answer[1] = big*small*answer[0]
    return answer