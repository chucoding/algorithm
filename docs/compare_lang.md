# 📌 자주 헷갈리는 프로그래밍 언어별 문법 비교

<table>
    <thead>
        <tr>
            <th width="50px">What is different?</th>
            <th width="50px">JAVA</th>
            <th width="50px">JAVA SCRIPT</th>
            <th width="50px">PYTHON</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>대소문자를 구분할까?<br/></td>
            <td>O</td>
            <td>0</td>
            <td>O</td>
        </tr>
        <tr>
            <td>문자열 + 숫자<br/><code>"x"+1=</code></td>
            <td><pre><code>x1</code></pre></td>
            <td><pre><code>x1</code></pre></td>
            <td><pre><code>TypeError: can only concatenate str (not "int") to str</code></pre></td>
        </tr>
        <tr>
            <td>증감연산자<br/><code>x++</code></td>
            <td>사용가능</td>
            <td>사용가능</td>
            <td>사용 불가능<br/><pre><code>SyntaxError: invalid syntax</code></pre></td>
        </tr>
        <tr>
            <td>배열</td>
            <td>밀집 배열<br/><code>int[] a = {1,2};</code></td>
            <td>희소 배열<br/><code>a=[1,2]</code></td>
            <td>배열 개념 없음(리스트만 존재)</td>
        </tr>
        <tr>
            <td>리스트 합치기</td>
            <td>
                <pre>
                    <code class="language-html">
                        List<String> joined = new ArrayList<>();
                        joined.addAll(list1);
                        joined.addAll(list2);
                    </code>
                </pre>
            </td>
            <td>
                <pre><code>list1.concat(list2)</code></pre><br/>
                <pre><code>list1.push(list2)</code></pre>
            </td>
            <td><pre><code>list1+list2</code></pre></td>
        </tr>
        <tr>
            <td>함수</td>
            <td><pre><code>private int a() {} //자바에선 메소드라고 부른다.</code></pre></td>
            <td><pre><code>function a() {}</code></pre></td>
            <td><pre><code>def a():</code></pre></td>
        </tr>
        <tr>
            <td>if-else</td>
            <td colspan=2><pre><code>
            if (x < 10) {
                ...
            } else if (x > 10) {
                ...
            } else {
                ...
            }
            </code></pre></td>
            <td><pre><code>
            if x < 10:
                ...
            elif x > 10:
                ...
            else:
                ...
            </code></pre></td>
        </tr>
        <tr>
            <td>삼항 연산자</td>
            <td colspan=2><pre><code>
            x == 1 ? x : y
            </code></pre></td>
            <td><pre><code>
            x if x == 1 else y
            </code></pre></td>
        </tr>
        <tr>
            <td>반복문(loop)</td>
            <td><pre><code>
            for (int i=0; i<10; i++)) {
                ...
            }
            </code></pre></td>
            <td><pre><code>
            for (i=0; i<10; i++)) {
                ...
            }
            </code></pre></td>
            <td><pre><code>
            for i, x in range(0,10) :
                # 0부터 9까지 
            </code></pre></td>
        </tr>
    </tbody>
</table>
