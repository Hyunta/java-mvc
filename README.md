# 만들면서 배우는 스프링
[Next Step - 과정 소개](https://edu.nextstep.camp/c/4YUvqn9V)

## @MVC 구현하기

### 학습목표
- @MVC를 구현하면서 MVC 구조와 MVC의 각 역할을 이해한다.
- 새로운 기술을 점진적으로 적용하는 방법을 학습한다.

### 시작 가이드
1. 미션을 시작하기 전에 학습 테스트를 먼저 진행합니다.
    - [Junit3TestRunner](study/src/test/java/reflection/Junit3TestRunner.java)
    - [Junit4TestRunner](study/src/test/java/reflection/Junit4TestRunner.java)
    - [ReflectionTest](study/src/test/java/reflection/ReflectionTest.java)
    - [ReflectionsTest](study/src/test/java/reflection/ReflectionsTest.java)
    - 나머지 학습 테스트는 강의 시간에 풀어봅시다.
2. 학습 테스트를 완료하면 LMS의 1단계 미션부터 진행합니다.

## 학습 테스트
1. [Reflection API](study/src/test/java/reflection)
2. [Servlet](study/src/test/java/servlet)


---

# 🚀 1단계 - @MVC 구현하기

## 요구사항
### 1. @MVC Framework 테스트 통과하기
- [x] AnnotationHandlerMapping 를 이용해 HandlerExectutions를 등록한다.
- [x] AnnotationHandlerMapping 을 이용해 HandlerExectutions를 찾는다.
- [x] HandlerExecution 에서 인스턴스를 통해 ModelAndView 를 반환한다.

### 2. JspView 클래스를 구현한다.
- [x] JspView 에서 viewName 을 통해 JspView 를 반환한다.

# 🚀 2단계 - 점진적인 리팩터링

## 요구사항

### 1.ControllerScanner 클래스 추가
- [x] Reflections 를 이용해 Controller 를 찾는다.
- [x] 각 클래스의 인스턴스를 생성한다.

### 2. HandlerMapping 인터페이스 추가
- [x] HandlerMapping 인터페이스를 추가한다.
- [x] AnnotationHandlerMapping, ManualHandlerMapping 을 구현체로 수정한다.
- [x] DispatcherServlet 초기화 과정에서 모두 초기화해서 List로 관리한다.

### 3. HandlerAdapter 인터페이스 추가
- [x] HandlerAdapter 인터페이스를 추가한다.
- [x] ManualHandlerAdapter, AnnotationHandlerAdpate 를 구현체로 수정한다.
- [x] DispatcherServlet 생성할 때 주입한다.

### AS-IS
- [x] ManualHandlerMapping 을 이용해 Controller 를 찾는다.
- [x] DispatcherServlet 에서 Controller를 통해 viewName을 찾는다.
- [x] DispatcherServlet 에서 viewName을 통해 페이지를 조회한다.

### TO-BE
- [x] HandlerMappingRegistry 에서 HandlerMapping 을 찾는다.
- [x] 각각의 HandlerMapping 을 초기화하면서 Controller의 path 를 등록한다.
- [x] HandlerAdapterRegistry 에서 instance 타입에 맞는 HandlerAdapter 를 찾는다.
- [x] HandlerAdapter 를 통해 ModelAndView 를 반환한다.
- [x] ModelAndView 에서 viewName 을 통해 View 를 찾는다.
- [x] Register, Login, Logout Controller 를 애노테이션 기반의 컨트롤러로 변경한다.
