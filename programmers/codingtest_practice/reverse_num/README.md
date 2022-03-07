# 문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

# 제한 조건
n은 10,000,000,000이하인 자연수입니다.

# 입출력 예
|n|return|
|-----|-----------|
|12345|[5,4,3,2,1]|

# 코드실험
```
def solution(n):
    answer = []
    while n > 0 :
        answer.append(n % 10)
        n = int(n/10)
```
위의 코드가 더 성능이 좋을것 같은데 str로 변환하는 방법보다 1~2초 정도 느리다. 원인은??

# 노트
1. str 형식도 slice 방식 적용가능 - 리스트로 변환 필요 없음
2. slicing 방식은 콜론(:)이 두개가 들어간다.
```
마지막 클론 뒤에 들어가는 숫자는 step - 점프 투 파이썬 개념에 내용없음
💡 slicing 방식은 파이썬 내부에서 C로 구현된 구조체여서 속도가 빠름
```
5. reversed 내장함수를 사용하면 iterator를 리턴(for문에서 사용가능). ```list.reverse()```는 리턴값 없음