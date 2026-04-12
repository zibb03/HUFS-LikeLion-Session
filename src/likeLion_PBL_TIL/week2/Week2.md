# 📘 Today I learned...

## 1. 오늘 배운 내용

### Week 2 TIL — 객체지향 I - 클래스와 캡슐화

**날짜**: 2026.04.12

**학습 주제**: 클래스와 객체, 책임 분리, 접근 제어자

---

### 변수 대신 객체로 묶기
이름, 전공, 기수를 `Lion`이라는 하나의 **객체(클래스)**로 묶어서 관리하여 코드가 훨씬 깔끔해졌다.

```java
public class Lion {
public String name;       // 이름
String major;             // 전공 (default)
private int generation;   // 기수 (private)

    // 생성자: 값을 한 번에 묶어서 초기화해줌
    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }
}
```


### 유효성 검증 책임 (main -> 객체)
Step1 패키지에서는 `main` 안에서 이름이 비었는지, 기수가 1 이상인지 if문으로 다 검사했다.
이와 달리 Step2 패키지에서는 `Lion` 클래스 내부의 `isValid()` 메서드를 사용하여 
`main`에서 매서드 호출만 진행하게 되어 코드가 짧아졌다. 

```java
public boolean isValid() {
    if (generation < 1) {
        System.out.println("오류: 기수는 1 이상이어야 합니다.");
        return false;
    }
    return true;
}
```

### 접근 제어자와 캡슐화
아래와 같은 접근자 권한에 따라 클라이언트에게 주어도 되는 정보만 줄 수 있도록 코드를 제어할 수 있다.
* `public`: 패키지가 달라도 밖에서 마음대로 수정 가능.
* `default`: 같은 패키지 안에서만 접근 가능.
* `private`: **클래스 밖에서는 아예 접근 불가.** (빨간 줄이 뜨면서 아예 실행도 안 됨)

---

## 3. 결과 이미지(스크린샷)
Step1

![실행 결과](src/PBL_TIL/week2/Week2-1.png)

Step2

![실행 결과](src/PBL_TIL/week2/Week2-2.png)

Step3

![실행 결과](src/PBL_TIL/week2/Week2-3-1.png)

![실행 결과](src/PBL_TIL/week2/Week2-3-2.png)

---

## 4. 느낀 점

접근자 권한을 오랜만에 다시 써보며 다양한 접근 권한에 대한 정의를 다시 바로 잡았다.
특히 `default` 접근자에 대한 기억이 머릿속에 없었는데, 이번 기회를 통해 다시 확실히 기억하게 되었다.

또한 `private` 접근자를 사용하며, 앞으로 미니 프로젝트나 팀 프로젝트를 통해 백엔드 구조를 만들 때 클라이언트가 접근할 수 있는 영역을 직접 다 정의하고 구현할 생각을 하니.. 약간 머리가 아파졌다..ㅠ

마지막으로 이번 TIL 세선 Today I learned...를 또 진행하며 마크다운에 더 익숙해졌다.
