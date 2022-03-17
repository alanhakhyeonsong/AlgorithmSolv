# 코테에서 자주 쓰이는 Python 기본 메소드 모음

- [입출력](#입출력)
  - [공백 기준으로 구분하여 입력](#공백-기준으로-구분하여-입력)
  - [빠른 입출력](#빠른-입출력)
  - [콤마로 구분하여 출력](#콤마로-구분하여-출력)
- [리스트 자료형](#리스트-자료형)
  - [1차원 리스트 초기화](#1차원-리스트-초기화)
  - [리스트 인덱싱과 슬라이싱](#리스트-인덱싱과-슬라이싱)
  - [리스트 컴프리헨션](#리스트-컴프리헨션)
  - [2차원 리스트 초기화](#2차원-리스트-초기화)
  - [리스트 관련 메서드](#리스트-관련-메서드)
- [파이썬 주요 라이브러리](#파이썬-주요-라이브러리)
  - [내장함수](#내장함수)
  - [itertools](#itertools)
  - [heapq](#heapq)
  - [bisect](#bisect)
  - [collections](#collections)

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

# 리스트 자료형

파이썬은 내부적으로 연결 리스트 자료구조를 채택하고 있어 `append()`, `remove()` 등의 메서드를 지원한다. C++의 STL vector와 유사하다.

## 1차원 리스트 초기화

```python
a = [0] * n
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
  - `appendleft(x)`, `append()
- `Counter`

```python
from collections import Counter

counter = Counter(['a', 'b', 'c', 'a', 'a', 'b'])
print(counter['a']) # 3 출력
```
