# 문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

# 제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

# 입출력 예
|n|return|
|------|------|
|118372|873211|

# 다른 사람 풀이
1. reverse 함수 안쓰고 sort에 옵션 추가
```ls.sort(reverse = True) ```

# 노트
제공된 테스트케이스 2,3,11번에 오류가 조금 있는것 같다.
매개변수 n 에 int() 적용해야 통과가능 