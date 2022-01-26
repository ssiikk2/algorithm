# 탐욕법(그리디) 알고리즘이란?

----
탐욕법(이하 '그리디') 알고리즘이란 현재 상황에서 가장 좋은 것(최선의 선택)을 고르는 알고리즘을 말합니다.

그리디 알고리즘은 동적 프로그래밍을 간단한 문제 해결에 사용하면 지나치게 많은 일을 한다는 것을 착안하여 고안되었습니다.

그리디 알고리즘은 현재 상황에서 가장 좋은 결과를 선택해나가는 방식입니다. 하지만 이 가장 좋은 결과는 최종적인 결과 도출에 대한 최적해를 보장해주는 것은 아닙니다!

----
여기서 가장 좋은 것(최선의 선택) 이란?
그리디 알고리즘이 추구하는 가장 좋은 것에 대해 예시
![greedy](https://user-images.githubusercontent.com/97833006/151116187-67512f52-093f-43ab-8e30-c5590e748f12.png)

시작 지점에서부터 시작하여 가장 큰 수를 구하는 문제가 있다고 가정해봅시다.

우리는 가장 좋은 결과가 "시작 - 6 - 128"을 거치는 Path가 가장 큰 수를 도출할 수 있다는 것을 알 수 있습니다.
하지만 그리디 알고리즘을 사용한다면 시작 지점부터 가장 큰 수를 얻는 Path인 "17"을 선택하게 됩니다.
결론적으로는 그리디 알고리즘은 "시작 - 17 - 23" Path가 가장 좋은 것이라고 판단합니다.

이처럼 그리디 알고리즘은 현재 상황에서 가장 좋은 결과를 선택하는 방식입니다!

이러한 이유때문에 그리디 알고리즘을 사용하는 문제는 간단한 문제로 나올 가능성이 매우 크다고 할 수 있습니다.

-----

# 그리디 알고리즘 조건

### 그리디 알고리즘을 사용하기 위해 필요한 조건은 2가지가 있다.

1. 탐욕스러운 선택 조건
- 탐욕적인 선택은 항상 안전하다는 것이 보장되어야 합니다. 여기서 "안전하다"라는 것은 이 선택으로 인해 전체 문제의 최적해를 반드시 도출할 수 있어야 한다는 것입니다.

2. 최적 부분 구조 조건
- 문제에 대한 최종 해결 방법이 부분 문제에 대해서도 또한 최적의 해결 방법이다라는 조건입니다.
이 말은 전체 문제의 안에는 여러 단계가 존재하고, 이 여러 단계 내의 하나 하나의 단계에 대해 최적해가 도출되어야 한다는 것입니다.

-----
### 그리디 알고리즘 문제 예시 1

가장 일반적인 문제의 예는 거스름돈 문제가 있다.

ex) 거스름돈 문제

```
 문제 : 당신은 음식점의 계산을 도와주는 점원입니다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원 동전이 무한개 존재합니다. 
 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러주어야 할 동전의 최소 개수를 구하라. 단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
 
```
10원만 사용해서 거슬러 줄 수도 있고, 다양한 동전을 사용하여 거슬러 줄 수 있지만,
조건에서는 '최소 개수'를 구하는 문제이므로 가장 큰 단위부터 거슬러주고 나머지를 그 다음 단위의 화폐로 거슬러 주는 것 이라는 해결 방법을 떠올릴 수 있습니다.

----

### 그리디 알고리즘 문제 예시 2
활동 선택 문제

이 문제는 시간표짜기, 회의실 시간 분배 문제와 비슷한 문제 유형에 해당한다.

활동 선택 문제란, 한 강의실에서 여러개의 수업을 하려고 할 때 한번에 가장 많은 수업을 할 수 있는 경우를 고르는 것입니다. (수업 시작 시간, 수업 종료 시간)

조건으로는 시작 시간과 끝나는 시간이 같은 경우, 그것도 하나의 수업으로 쳐줍니다.(3 3, 5 5 등)
또 수업이 끝나고 바로 다른 수업을 시작할 수 있습니다. (1 3, 3 5, 5 7)
![hwaldong](https://media.vlpt.us/images/contea95/post/b0c32292-5ecd-49cc-bd68-a87d67739396/%ED%99%9C%EB%8F%99%EC%84%A0%ED%83%9D%EB%AC%B8%EC%A0%9C1.png)
![ex2](https://media.vlpt.us/images/contea95/post/013df58d-9f27-45f6-8a02-f58ff71a7e2b/%ED%99%9C%EB%8F%99%EC%84%A0%ED%83%9D%EB%AC%B8%EC%A0%9C2.png)

Si는 시작시간, Fi는 종료시간이다. 수업들은 하나의 강의실에서 진행해야 하므로 2개의 수업이 중복해서 실행될 수 없습니다. 이 때 가장 많은 수업을 할 수 있는 경우를 찾아보세요.

a1이 가장 빨리 끝나므로 선택한다. 이 때 a2, a4는 시간이 겹치므로 고를 수 없다. 즉, 여기서 a2와 a4의 시작 시간(Si)가 a1의 종료 시간(Fi)보다 작으므로 고를 수 없다.

그다음 가장 빨리 끝나는 수업은 a3이고, 위와 같은 이유로 a5는 고를 수 없다.

이를 반복해보면 정답은 a1, a3, a6, a8 또는 a1, a3, a7, a8을 고를 수 있다.

최적해를 구하기 위해서는 가장 빨리 끝나는 수업을 골라야 한다. 현재 상태에서 가장 빨리 끝나는 수업이 일찍 끝나게 되면 다음 단계에서 더 많은 활동을 구할 수 있기 때문이다.

 
