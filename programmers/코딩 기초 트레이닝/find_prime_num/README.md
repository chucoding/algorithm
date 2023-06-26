# 문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

# 제한 조건
n은 2이상 1000000이하의 자연수입니다.

# 입출력 예
n	result
10	4
5	3

# 입출력 예 설명
## 입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

## 입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

# 다른 사람 풀이
set을 이용한 풀이
💡파이썬의 set함수는 차집합이 가능하다

```
def solution(n):
    num=set(range(2,n+1))
    for i in range(2,n+1):
        if i in num:
            num-=set(range(2*i,n+1,i))
    return len(num)
```

# 실패한 코드

## 일반 소수 구하기
```
def solution(n):
    count = 0
    if n == 1 : return count
    for i in range(2, n+1) :
        b = True
        for j in range(2,int(i**1/2)+1) :
            if i != j and i%j == 0 :
                b = False
                break
        if b : count+=1
    return count
```

## 에라토스테네스 채
```
def solution(n):
    l = [i for i in range(2,n)]
    for i in range(2,int(n**1/2)) :
        for j in range(0,n,i) :
            if j == i : continue;
            if j in l :
                l.remove(j)
    return len(l)
```