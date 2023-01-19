# 📌 파이썬 알고리즘 Tip 

## 1. 컨벤션
변수 이름 작명법

- <b>알파벳, 숫자, 언더스코어(_)</b>로 선언 가능
ex) data, _a12, _gg
- 변수명은 <b>의미 있는 단어</b>로 표기하는 것이 좋다(줄이지 말것)
- 특별한 의미가 있는 예약어는 쓰지 않는다.
ex) for, if, else
- 변수에 처음 값을 할당할 때는 <b>띄어쓰기 사용</b>, 키워드 인자(keyword argument)에 값을 할당할 때는 <b>띄어쓰기 사용X</b> ⇒ grep 명령어를 이용해 둘을 구분하기 용이함

Example

```python
def some_func(kw1):
    print(kw1)
 
if __name__ == "__main__":
    kw1 = "Hello"
    some_func(kw1=kw1)
```

## 2. Pythonic
### list comprehension
Example
```python
# [ ( 변수를 활용한 값 ) for ( 사용할 변수 이름 ) in ( 순회할 수 있는 값 )]
arr = [n for n in range(1, 11) if n % 2 == 0]
```

## 참고자료
https://peps.python.org/pep-0008 <br/>
https://kimjingo.tistory.com/177 <br/>
https://shoark7.github.io/programming/python/about-list-comprehension-python 