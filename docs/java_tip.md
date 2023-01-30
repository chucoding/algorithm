# 📌 자바 알고리즘 Tip 

## 1. For vs Iterator
Iterator 쓰지말기!(객체를 만들어 사용하기 때문에 느림)
   * 자동으로 인덱스 관리 해주기 때문에 사용하는데 편리할 수는 있음!

## 2. print
```
System.out.println(문자열);  // 문자열에 % 쓰고 싶으면 %%로 출력
```

## 3. 문자열
* **문자(char)** 출력은 Scanner 메소드가 따로 없음! next().charAt(0) 이런식으로 출력 가능
* 자바의 문자 출력(표준입력이란 System.in을 사용하는 것.. 다음과 같은 두가지 방식 중 골라 )
   1. **BufferedReader** 객체사용
   ```
      	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
   ```
   * 버퍼크기 8192chars(**큰 파일을 읽을 때 좋음**)
   * 문자열을 단순히 읽고 저장
   * 동기화 가능
   * IOException 처리를 던짐
   * 숫자 + 개행은 readLine()으로 받고 Integer.parse()해줘야됨 주의!
   * **StringTokenizer**
      	* 공백이 있다면 뒤에 문자열이 공백 자리를 땡겨 채우도록 한다.
	* BufferedReader보다 빠르게 사용될 수 있다.
	* 문자열을 자르게 위해 split을 사용할땐, split은 정규식을 기반으로 자르는 로직으로서 내부는 복잡하다. 그에 비해 StringTokenizer의 nextToken()메소드는 단순히 공백 자리를 땡겨 채우는 것이다. 그렇기 때문에 속도 차이가 날 수 밖에 없다.
	* 정규식이나 인덱스 접근과 같은 처리가 필요없다면 StringTokenizer를 사용하는 것이 효율적이다.
	```
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	```
	
   2. Scanner 객체사용(버퍼크기 1024chars)
	```
      		Scanner sc = new Scanner(System.in);
	```
	* 버퍼크기 1024chars
	* 문자열을 구분하여 분석가능
	* 동기화가 되지 않는다.
	* IOException을 숨긴다.
	* 편리한 기능이 많지만 속도가 느리기때문에 **알고리즘에서 사용하지 않음!**
		* 속도저하 원인 : 정규식의 남용(자동파싱) ex) Scanner.nextInt() -> 1,234,567 을 1234567로 인정함
		* nextInt 보다 bufferedReader의 **Integer.parseInt(nextLine)이 더 빠름**
	 
* String vs StringBuffer, StringBuilder
	* String : immutable(불변)
		```
			String literalString = "literal"; //리터럴로 생성하는 방식
			String newString = new String("literal"); //new로 생성하는 방식
			
			//위에서 "literal" 이라는 문자열을 String Pool에서 생성했기 때문에 이후에 추가한 str1, str2, str3는 추가적으로 생성하지 않고 똑같은 문자열을 가리킨다
			String str1 = "literal";
			String str2 = "literal";
			String str3 = "literal";
		```
		* "String Pool"이라는 공간에 생성된다. 이 메모리 공간에 생성된 문자열 값은 절대 변하지 않는다
		* '+' 연산이나 .concat() 메소드를 이용하면 "String Pool" 공간 안에 새로 메모리를 할당 받아 객체가 생성되므로 절대 쓰면 안됨!
			* '기존의 문자열'은 가비지 콜렉터에 의해 제거되야하는데 언제 제거될지 모름
			* JDK1.5이상부터 String에서 +연산으로 작성하더라도 StringBuilder로 컴파일하게 만들어 놨지만 String 객체 생성하는 부분은 동일하므로 StringBuilder, StringBuffer 사용이 필요
		* 장점1 : String 클래스의 객체는 불변하기 때문에 단순 조회연산에서는 빠름(연산이 적을때 사용)
		* 장점2 : 불변하기 때문에 멀티쓰레드환경에서 동기화를 신경쓸 필요가 없음
	* StringBuffer : mutable(가변) - buffer size 잘못 초기화하면 성능 안좋아짐
		* 멀티쓰레드환경에서 synchronized 키워드가 가능하므로 동기화가 가능(thread-safe)
	* StringBuilder : mutable(가변)
		* 동기화를 고려하지 않기 때문에 싱글쓰레드 환경에서 연산처리가 빠른 장점이 있음(StringBuffer의 2배 속도 차이!)

* 특정 문자열에서 원하는 문자가 포함되어 있는지
  1. contains : 문자열에 검색하고자 하는 문자가 있는지 확인 (boolean)
  2. **indexOf** : 문자열에서 검색하는 문자의 위치를 반환 (int:문자위치)
  3. matches : 정규식을 이용하여 문자열을 검색 (boolean)
    * 특정 문자열을 검색할때 사용하기 보다는 한글, 숫자 등과 같이 해당 형태의 텍스트가 존재하는지 확인할때 사용하면 좋다
  출처: https://fruitdev.tistory.com/72 [과일가게 개발자]
* 특정 문자열에서 특정 문자 개수 구하기
  1. indexOf이용(매개변수 : "특정문자", **시작위치**)
  ```
    int lineCnt = 0;
    int fromIndex = -1;
    while ((fromIndex = cellText.indexOf("특정문자", fromIndex + 1)) >= 0) {
      lineCnt++;
    }
  ```
  출처: https://goni9071.tistory.com/6 [고니의꿈]  
  2. **Pattern Matcher** 객체이용 -- 더 빠름
    * java.util.regex 패키지 
    * Matcher find 메소드 Pattern에 일치하는 텍스트들이 발견되면 true를 반환해줌
    * 반복문을 사용하면 두번째, 세번째로 패턴과 일치하는 부분을 찾음
  ```
    Pattern pattern = Pattern.compile("정규식");            
    Matcher matcher = pattern.matcher("문자열");
    while (matcher.find()) {
	count++;
    }
  ```
  출처: https://devgwangpal.tistory.com/12 [흔한 코더의 필기장입니다 :)]

* 대문자 <-> 소문자 변환문제
	```
		char[] str = br.readLine().toCharArray();
	```
	* 다음과 같은 공식으로 배열 만들어서 사용(하나씩 비교해줘야 되므로 StringBuilder X)
	* 다 끝난다음 출력시 for문 대신 **String.valueOf(str)** 로 String형으로 변환시켜주면 더 빠르게 동작한다.
