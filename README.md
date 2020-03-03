# Thymeleaf_CRUD

아래 링크 참조하여 코드 작성
https://www.baeldung.com/spring-boot-crud-thymeleaf

Thymeleaf는 웹환경과 비웹 환경 모두에서 작동이 가능한 Java 템플릿 엔진이다.
html파일을 가져와 파싱, 분석 후 정해진 위치에 데이터를 치환해서 웹페이지를 생성한다.
html element에 id가 중복이 되거나 태그를 제대로 닫지 않는 경우 에러가 발생할 수 있다.
위치는 src/main/resources/templates/...html이다.

form에 입력 처리 
<form action="#" th:action="@{/saveStudent}" th:object="${student}" method="post">
th:action="@{url}"
th:object="${Object}"
데이터 입력 필드는 th:field="*{name}" 속성을 사용하여 매핑한다.
th: 가 타임리프의 약자이다.

사용방법
<html xmlns:th="http://www.thymeleaf.org"> 속성설정
  
자동완성
http://www.thymeleaf.org/eclipse-plugin-update-site/
