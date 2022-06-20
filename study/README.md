# 코테에서 자주 쓰이는 Python 기본 메소드 모음

- [입출력](#입출력)
  - [공백 기준으로 구분하여 입력](#공백-기준으로-구분하여-입력)
  - [빠른 입출력](#빠른-입출력)
  - [콤마로 구분하여 출력](#콤마로-구분하여-출력)
- [알파벳인지 숫자인지 판별](#알파벳인지-숫자인지-판별)
  - [알파벳인지 판별](#알파벳인지-판별)
  - [숫자인지 판별](#숫자인지-판별)
  - [알파벳 또는 숫자인지 판별](#알파벳-또는-숫자인지-판별)
- [리스트 자료형](#리스트-자료형)
  - [1차원 리스트 초기화](#1차원-리스트-초기화)
  - [리스트 인덱싱과 슬라이싱](#리스트-인덱싱과-슬라이싱)
  - [리스트 컴프리헨션](#리스트-컴프리헨션)
  - [2차원 리스트 초기화](#2차원-리스트-초기화)
  - [리스트 관련 메서드](#리스트-관련-메서드)
- [문자열 자료형](#문자열-자료형)
- [튜플 자료형](#튜플-자료형)
- [딕셔너리 자료형](#딕셔너리-자료형)
- [집합 자료형](#집합-자료형)
- [파이썬 주요 라이브러리](#파이썬-주요-라이브러리)
  - [내장함수](#내장함수)
  - [itertools](#itertools)
  - [heapq](#heapq)
  - [bisect](#bisect)
  - [collections](#collections)
- [2차원 배열 돌리기](#2차원-배열-돌리기)
- [enumerate](#enumerate)
- [defaultdict](#defaultdict)

// 계속 업데이트 될 예정

---

# 입출력

## 공백 기준으로 구분하여 입력

```python
n, m, k = map(int, input().split())
```

## 빠른 입출력

```python
import sys
input = sys.stdin.readline()
s = input.rstrip()
print(s)
```

## 콤마로 구분하여 출력

```python
a = 1
b = 2
print(a, b)
// 결과: 1 2
```

# 알파벳인지 숫자인지 판별

## 알파벳인지 판별

```python
a = 'test'
print(a.isalpha())
# 결과: True
```

## 숫자인지 판별

```python
a = 123
print(a.isdigit())
# 결과: True
```

## 알파벳 또는 숫자인지 판별

```python
test1 = '안녕'
test2 = 'Hello3'
test3 = "1.Where"
test4 = "1 Where"

print(test1.isalnum())
print(test2.isalnum())
print(test3.isalnum())
print(test4.isalnum())
# 결과: True True False False
```

# 리스트 자료형

파이썬은 내부적으로 연결 리스트 자료구조를 채택하고 있어 `append()`, `remove()` 등의 메서드를 지원한다. C++의 STL vector와 유사하다.

## 1차원 리스트 초기화

```python
a = [0] * n

# 값을 입력 받아 초기화(한줄에 한 값씩 입력)
arr = [int(sys.stdin.readline().rstrip()) for _ in range(n)]
# 같은 코드
arr = []
for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))

# 한 줄에 여러 값 입력
b = list(map(int, sys.stdin.readline().split()))
b = list(map(int, input().split()))
```

## 리스트 인덱싱과 슬라이싱

```python
a = [1,2,3,4,5,6,7,8,9]

# 두 번째 원소부터 네 번째 원소까지
print(a[1:4])
```

## 리스트 컴프리헨션

```python
# 0부터 19까지 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]

# 다음 코드와 같다
array = []
for i in range(20):
	if i % 2 == 1:
    	array.append(i)
```

## 2차원 리스트 초기화

```python
n = 3
m = 4
array = [[0] * m for _ in range(n)]
print(array)

# 다음 초기화 코드는 잘못된 코드이다. 사용 x
# 내부적으로 포함된 3개의 리스트가 모두 동일한 객체에 대한 3개의 레퍼런스로 인식된다.
array = [[0] * m] * n
```

결과는 `[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]` 이다.

```python
# 그래프 문제 풀때 활용
n, m = map(int, input().split())
visited = [[False] * m for _ in range(n)]
graph = [list(map(int, input().split())) for _ in range(n)]
```

## 리스트 관련 메서드

| 메서드      | 사용법                                         | 설명                                                              | 시간 복잡도 |
| ----------- | ---------------------------------------------- | ----------------------------------------------------------------- | ----------- |
| `append()`  | `변수명.append()`                              | 리스트에 원소를 하나 삽입할 때 사용한다.                          | O(1)        |
| `sort()`    | `변수명.sort()`                                | 기본 정렬 기능으로, 오름차순으로 정렬한다.                        | O(NlogN)    |
| --          | `변수명.sort(reverse=True)`                    | 내림차순으로 정렬                                                 | O(N)        |
| `reverse()` | `변수명.reverse()`                             | 리스트의 원소의 순서를 모두 뒤집는다.                             | O(N)        |
| `insert()`  | `변수명.insert(삽입할 위치 인덱스, 삽입할 값)` | 특정한 인덱스 위치에 원소를 삽입                                  | O(N)        |
| `count()`   | `변수명.count(특정값)`                         | 리스트에서 특정한 값을 가지는 데이터의 개수를 카운팅              | O(N)        |
| `remove()`  | `변수명.remove(특정값)`                        | 특정 값을 갖는 원소를 제거. 같은 값이 여러개라면 하나만 제거한다. | O(N)        |

```python
a = [1,2,3,4,5,5,5]
remove_set = [3,5]

# remove_set에 포함되지 않은 값만을 저장
result = [i for i in a if i not in remove_set]
print(result)

// 결과: [1, 2, 4]
```

# 문자열 자료형

파이썬의 문자열은 내부적으로 리스트와 같이 처리된다. 문자열은 여러 개의 문자가 합쳐진 리스트라고 볼 수 있다. 따라서 문자열 데이터에 대해서도 마찬가지로 인덱싱과 슬라이싱을 이용할 수 있다.

```python
a = "ABCDEF"
print(a[2:4]) # 결과: CD

# 문자열 연산 - 문자열이 양의 정수와 곱하는 경우 그 값만큼 여러 번 더해진다.
print(a * 3) # 결과: ABCDEFABCDEFABCDEF
```

# 튜플 자료형

리스트와 거의 비슷하지만 다음과 같은 차이가 있다.

- 튜플은 한 번 선언된 값을 변경할 수 없다.
- 리스트는 대괄호(`[]`)를 이용하지만, 튜플은 소괄호(`()`)를 이용한다.

튜플 자료형은 그래프 알고리즘을 구현할 때 자주 사용된다.  
예를 들어, 다익스트라 알고리즘 처럼 최단 경로를 찾아주는 알고리즘의 내부에선 우선순위 큐를 사용하는데, 해당 알고리즘에서 우선순위 큐에 한 번 들어간 값은 변경되지 않는다. 따라서 그 우선순위 큐에 들어가는 데이터를 튜플로 구성하여 소스코드를 작성한다.

또한 튜플은 리스트에 비해 상대적으로 공간 효율적이고, 일반적으로 각 원소의 성질이 서로 다를 때 주로 사용된다. 다익스트라 알고리즘의 경우 '비용'과 '노드 번호'라는 서로 다른 성질의 데이터를 `(비용, 노드번호)`의 형태로 함께 튜플로 묶어서 관리한다.

# 딕셔너리 자료형

딕셔너리는 키, 값의 쌍을 데이터로 가지는 자료형이다. 우리가 원하는 변경 불가능한 데이터를 키(key)로 사용할 수 있다. 파이썬의 딕셔너리는 내부적으로 '해시 테이블'을 이용하므로 기본적으로 데이터의 검색, 수정에 있어 `O(1)`의 시간에 처리할 수 있다.

```python
data = dict() # data = {} 와 같음
data['라모스'] = 'Ramos'
data['호날두'] = 'Ronaldo'
data['벤제마'] = 'Benzema'

print(data)
# 결과: {라모스': 'Ramos', '호날두': 'Ronaldo', '벤제마': 'Benzema'}
```

딕셔너리 자료형에 특정한 원소가 있는지 검사할 때는 `원소 in 딕셔너리`의 형태를 사용할 수 있다. 이는 리스트나 튜플에 대해서도 가능하다.

```python
data = dict() # data = {} 와 같음
data['라모스'] = 'Ramos'
data['호날두'] = 'Ronaldo'
data['벤제마'] = 'Benzema'

if '음바페' not in data:
  print("OK")
# 결과: OK
```

- 키 데이터만 뽑아서 리스트로 이용: `keys()`
- 값 데이터만 뽑아서 리스트로 이용: `values()`

# 집합 자료형

집합(set)은 리스트 혹은 문자열을 이용해서 만들 수 있는데, 다음과 같은 특징이 있다.

- 중복을 허용하지 않는다.
- 순서가 없다.

리스트나 튜플은 순서가 있기 때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만, 딕셔너리나 집합은 순서가 없어 인덱싱으로 값을 얻을 수 없다.

집합 자료형은 키가 존재하지 않고, 값 데이터만을 담게 된다. 특정 원소가 존재하는지 검사하는 연산의 시간 복잡도는 `O(1)`이다.

```python
data = set([1, 1, 2, 3, 4, 4, 5])
print(data) # {1, 2, 3, 4, 5}

a = set([1, 2, 3, 4, 5])
b = set([3, 4, 5, 6, 7])

print(a | b) # 합집합
print(a & b) # 교집합
print(a - b) # 차집합

data.add(6) # 새로운 원소 추가: O(1)
data.update([7, 8]) # 새로운 원소 여러 개 추가
data.remove(3) # 특정한 값을 갖는 원소 삭제: O(1)

arr = list(data)
print(arr) # [1, 2, 4, 5, 6, 7, 8]
```

# 파이썬 주요 라이브러리

- 내장함수: `sum()`, `min()`, `max()`, `eval()`
- `itertools`: 순열과 조합 라이브러리
- `heapq`: 힙(Heap)
- `bisect`: 이진 탐색
- `collections`: 덱(deque), 카운터(Counter)
- `math`: 팩토리얼, 제곱근, 최대공약수, 삼각함수 관련 함수

## 내장함수

- `eval()`: 문자열 형태로 주어진 수식을 계산

```python
result = eval("(3 + 5) * 7")
print(result)
// 결과: 56
```

- key값 기준으로 정렬

```python
result = sorted([('홍길동', 35), ('이순신', 75), ('아무개', 50)], key=lambda x: x[1])
```

## itertools

- permutations

```python
from itertools import permutations

data = ['a', 'b', 'c']
result = list(permutations(data, 3)) # 3개 뽑아 모든 순열 구하기
```

- product

```python
from itertools import product

data = ['a', 'b', 'c']
result = list(product(data, repeat=2)) # 2개 뽑아 모든 순열 구하기(중복 허용)
```

- combinations

```python
from itertools import combinations

data = ['a', 'b', 'c']
result = list(combinations(data, 2)) # 2개를 뽑는 모든 조합 구하기
```

- combinations_with_replacement

```python
from itertools import combinations_with_replacement

data = ['a', 'b', 'c']
# 2개를 뽑는 모든 조합 구하기(중복 허용)
result = list(combinations_with_replacement(data, 2))
```

## heapq

다익스트라 알고리즘을 포함한 다양한 알고리즘에서 우선순위 큐 기능을 구현하고자 할 때 사용된다. `PriorityQueue`보다 `heapq`가 더 빠르다. 최소 힙 기반으로 단순히 원소를 힙에 전부 넣었다가 빼는 것만으로도 O(NlogN)에 오름차순 정렬이 완료된다.

```python
import heapq

def heapsort(iterable):
	h = []
    result = []
    # 모든 원소를 차례대로 힙에 삽입
    for value in iterable:
    	heapq.heappush(h, value) # 최대 힙일 경우, -value
    # 힙에 삽입된 모든 원소를 차례대로 꺼내어 담기
    for i in range(len(h)):
    	result.append(heapq.heappop(h)) # 최대 힙일 경우, -heapq.heappop(h)
    return result
```

## bisect

```python
from bisect import bisect_left, bisect_right

a = [1,2,4,4,8]
x = 4

print(bisect_left(a, x))
print(bisect_right(a, x))
// 결과: 2, 4
```

### 정렬된 리스트에서 범위안의 원소의 개수 찾기

```python
from bisect import bisect_left, bisect_right

def count_by_range(a, left_value, right_value):
	right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index
```

## collections

- `deque`: 단순하게 큐라고 생각하고 사용하자.
  - `popleft()`, `pop()`
  - `appendleft(x)`, `append()`
- `Counter`

```python
from collections import Counter

counter = Counter(['a', 'b', 'c', 'a', 'a', 'b'])
print(counter['a']) # 3 출력
```

# 2차원 배열 돌리기
시뮬레이션 유형에서 한 번씩 등장하는 내용이다.

```python
def rotate(a):
    row_length = len(a)
    column_length = len(a[0])

    res = [[0] * row_length for _ in range(column_length)]
    for r in range(row_length):
        for c in range(column_length):
            res[c][row_length - 1 - r] = a[r][c]

    return res

a = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
]

print(rotate(a))
print(a)
```

# enumerate
파이썬 답게 인덱스와 원소를 동시에 접근하면서 루프를 돌릴 수 있는 방법이다.

```python
for idx, x in enumerate(id_list):
    print(idx, x)

# 0 A
# 1 B
# 2 C
```

추가로 `enumerate`의 인자로 `start=`를 지정한다면, 0이 아니라 지정한 숫자부터 시작할 수 있다.

// [python enumerate](https://www.daleseo.com/python-enumerate/)

# defaultdict
dictionary의 키에 대한 값이 없는 경우에 대한 처리를 해야하는 경우 기본 딕셔너리보다 유용하게 사용할 수 있는 방법이다.  
Java의 `HashMap.getOrDefault()`와 유사한 컨셉이다.

`defaultdict` 클래스의 생성자로 기본값을 생성해주는 함수를 넘기면, 모든 키에 대해 값이 없는 경우 자동으로 생성자의 인자로 넘어온 함수를 호출하여 그 결과값으로 설정해준다.

이를 활용하면 딕셔너리의 기본값으로 int 뿐만 아니라 list, set 역시 지정할 수 있다.
```python
from collection import defaultdict

banned_cnt = defaultdict(int)
report_dict = defaultdict(set)

for id in report:
    banned_cnt[id.split(" ")[1]] += 1

...
```