# algorithm
 알고리즘 문제풀이 TIP
1. 문제를 손으로 풀기전까진 키보드 손대지 말기!! (= 완성된 글이 아닌 것을 번역하는 것)
2. **주석을 최대한 활용**(이 변수가 무엇인지 다시 확인하면 시간 오래걸림)
3. for문 안에서만 사용할 경우 전역변수 보다는 지역변수로 선언해야 메모리 낭비가 없음!
4. for문 안에서 배열이나 저장소 크기 줄이지 말기!(index 달라져서 오류남!!)

## 목차
[📌 자주 헷갈리는 프로그래밍 언어별 문법 비교](./docs/compare_lang.md) <br/>
[📌 자바 알고리즘 Tip](./docs/java_tip.md) <br/>
[📌 파이썬 알고리즘 Tip](./docs/python_tip.md) <br/>
[📌 자주 쓰이는 정규식 보러가기](./docs/regex.md)

## for vs while
for &nbsp;&nbsp;&nbsp; : 반복 실행횟수가 명확할때 사용<br/>
while : 반복 실행횟수가 명확하지 않을때 사용

❗주의) while(true)는 사용하지 말것! (프로그램이 언제 종료될지 정확하게 예측하기 어려우므로)

hash
-----
해쉬 - 해쉬를 이용하면 즉시 저장하거나 찾고자 하는 위치를 참조할 수 있으므로 더욱 빠른 속도로 처리할 수 있다.
   * 내부적으로 배열을 사용하여 데이터를 저장하기 때문에 빠른 검색 속도를 갖는다.(연결리스트의 느린 검색 보완)
   * 데이터의 삽입과 삭제시 기존 데이터를 밀어내거나 채우는 작업이 필요 없도록 특별한 알고리즘을 이용하여 데이터와 연관된 고유한 숫자를 만들어 낸뒤 이를 인덱스로 사용(배열의 느린 삽입,삭제 보완)
   * 자바에서는 **HashMap** collection 사용(HashTable도 있으나 충돌가능성이 커서 잘 사용하지 않는다.(HashMap이 좀 더 나중에 나옴)) 
  
| 기능 | HashMap | HashTable |
|---------|----------|---------|
| 키 또는 값에 null 저장 가능 여부 | O | X |
| 여러 쓰레드 안전 여부 | X | O |

**TreeMap**
	* key를 기준으로 정렬할 수 있도록 해줌(HashMap은 데이터의 정렬이라는게 없기 때문에 이걸사용)
	* 정렬기준 : 숫자 > 알파벳 대문자 > 알파벳 소문자 > 한글
	* 기본적인 검색성능은 HashMap이 더 뛰어나나 **범위검색이나 정렬이 필요한 경우는 TreeMap을 사용**하는 것이 좋음
	```
		TreeMap<String, String> map = new TreeMap<>();
        	map.put("a", "A");
        	map.put("b", "B");
        	map.put("1", "one");
        	map.put("2", "two");
        	map.put("가", "ㄱ");
        	map.put("나", "ㄴ");
        	map.put("A", "a");
        	map.put("B", "b");

        	System.out.println("map = " + map);
		//map = {1=one, 2=two, A=a, B=b, a=A, b=B, 가=ㄱ, 나=ㄴ}
	```
	
해쉬 맵 문제풀이 팁
1. getOrDefault(있으면 반환,없으면 반환) -- key 값 같은거 밸류 개수 구하거나 더할때 유용함
2. 맵에 맵 넣기 
	
```
Map<String, Map<Integer, Integer>> map = new HashMap();
        
for(int i=0; i<genres.length; i++) {
	if(map.get(genres[i]) != null) {
        	map.get(genres[i]).put(i, plays[i]);
        } else {
        	Map<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
        	playsMap.put(i, plays[i]);
        	map.put(genres[i], playsMap);
        }
}
```

stack & queue
------
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

1. BFS(Breadth First Search) - 너비 우선 탐색
   * **큐(queue)** 이용
   * 최단 경로 무조건 보장
   * 노드의 수가 많을수록 더 큰 저장공간 필요
   * 그래프 모델링 필요(저장방법)
   	1. ~~인접행렬 : 시간복잡도 O(V^2) (v는 정점의 수)~~ 시간 오래 걸려서 보통 사용 안함
	2. 인접리스트 : 시간 복잡도 O(V+E) (v는 정점의 수, E는 간선의 수)
		* 링크드 리스트 구현하면 좋은데 매번 구현하기 귀찮은 단점이 있음
		* C++에서는 vector
		* java에서는 **ArrayList** 사용
2. DFS(Depth First Search) - 깊이 우선 탐색
   * **스택**, 또는 **재귀함수** 이용
   * 백트래킹을 해야하는 노드들만 저장
   * 최단경로 보장X, 깊으면 시간 오래걸림
