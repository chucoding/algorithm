# algorithm
알고리즘 유의사항!

1. !!문제를 손으로 풀기전까진 키보드 손대지 말기!! (= 완성된 글이 아닌 것을 번역하는 것)
2. **주석을 최대한 활용**(이 변수가 무엇인지 다시 확인하면 시간 오래걸림)
3. for문 안에서만 사용할 경우 전역변수 보다는 지역변수로 선언해야 메모리 낭비가 없음!
4. Iterator 함부로 쓰지말기!(Collection에 저장되어 있는 요소들을 읽어오는 방법중의 하나 but, 객체를 만들어 사용하기 때문에 느림)
   * 자동으로 인덱스 관리 해주기 때문에 사용하는데 편리할 수는 있음! 
5. for문 안에서 배열이나 저장소 크기 줄이지 말기!(index 달라져서 오류남!)

print
-----
문자열에 % 쓰고 싶으면 %%로 출력해야됨!

string
-----
* 자바 문자 출력은 Scanner 메소드가 따로 없음! next().charAt(0) 이런식으로 출력 가능
* 자바의 문자 출력(표준입력이란 System.in을 사용하는 것.. 다음과 같은 두가지 방식 중 골라 )
   1. **BufferedReader** 객체사용 -- 성능은 이게 떠 빠름!
      * BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
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
   2. Scanner 객체사용
      * Scanner sc = new Scanner(System.in);
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

hash
-----
해쉬 - 해쉬를 이용하면 즉시 저장하거나 찾고자 하는 위치를 참조할 수 있으므로 더욱 빠른 속도로 처리할 수 있다.
   * 내부적으로 배열을 사용하여 데이터를 저장하기 때문에 빠른 검색 속도를 갖는다.(연결리스트의 느린 검색 보완)
   * 데이터의 삽입과 삭제시 기존 데이터를 밀어내거나 채우는 작업이 필요 없도록 특별한 알고리즘을 이용하여 데이터와 연관된 고유한 숫자를 만들어 낸뒤 이를 인덱스로 사용(배열의 느린 삽입,삭제 보완)
   * 자바에서는 **HashMap** collection 사용(HashTable도 있으나 충돌가능성이 커서 잘 사용하지 않는다.(HashMap이 좀 더 나중에 나옴)) 

stack & queue
-----
스택 - ~~Stack 자료구조 이용~~ //Stack은 list의 vector를 상속받기 때문에 성능이 저하됨
   * LinkedList이용해서 직접만들어서 사용 - 효율은 좋으나 코드가 복잡해짐
   * **Deque** 자료구조 이용 - Stack 자료구조보다 빠른 스택 구현 가능, 단 search()메소드 지원안함
   ```
   	Deque<Integer> st = new ArrayDeque<Integer>();
   ```
큐 - LinkedList 자료구조 이용
   * while(!q.isEmpty()) 중요!
   * 항상 순서는 poll()부터 하고 add()[또는 offer()]해야 break 안걸림
   * 큐는 왠만하면 forEach 쓰지말것!(중간에 큐에 데이터가 삽입되면 곤란)

greedy
------
탐욕적 알고리즘 - 가장 가까이 있는 것의 최적해부터 구하는 방식

heap
----
PriorityQueue 자료구조 이용 - 큐 이지만 우선순위가 높은 순서대로 빠져나옴

완전탐색
--------
1. Brute Force : for문과 if문을 이용해 처음부터 끝까지 탐색하는 방법
2. 비트마스크
3. 순열 : 순열의 시간 복잡도는 O(N)
4. 백트래킹
5. BFS

BFS, DFS - 모든 정점을 방문하는 방법 두가지
------------------------------------------
   * 두 노드 사이의 최단 경로를 구할때 사용
   * 임의의 경로를 찾고 싶을때 사용

<img src="/img/bfsdfs.png" title="bfsdfs" alt="bfsdfs"></img><br/>

1. BFS - 너비 우선 탐색
   * **큐(queue)** 이용
   * 최단 경로 무조건 보장
   * 노드의 수가 많을수록  더 큰 저장공간 필요
2. DFS - 깊이 우선 탐색
   * **스택**, 또는 **재귀함수** 이용
   * 백트래킹을 해야하는 노드들만 저장해주면됨
   * 최단경로 보장X, 깊으면 시간 오래걸림
