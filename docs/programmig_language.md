# 🪄 자주 헷갈리는 프로그래밍 언어별 문법 비교

|  | JAVA | JAVASCRIPT | PYTHON |
|--|------|------------|--------|
| 대소문자 구분 ?<br/>`a = 1`<br/>`A = 2` | `System.out.println(a); //1`<br/>`System.out.println(A); //2` | `console.log(a); //1`<br/>`console.log(A); //2` | `print(a) //1`<br/>`print(A) //2` |
| 문자열+숫자<br/>`"a"+1=`|`a1`|`a1`|`TypeError: can only concatenate str (not "int") to str` | 
|증감연산자<br/>`a++`|`1`|`1`|`SyntaxError: invalid syntax`|
|배열선언| 밀집 배열<br/>`int[] a = {1,2};` | 희소 배열<br/>`a=[1,2]` | 배열 없음 |
|리스트 합치기|`List<String> joined = new ArrayList<>();`<br/>`joined.addAll(list1);`<br/>`joined.addAll(list2);`|`list1.concat(list2)`<br/>`list1.push(list2)`|`list1+list2`|
|함수선언| `private int a() {} //메소드` | `function a() {}` | `def a():`|
