package likeLion_PBL_TIL.week2.package2;

import likeLion_PBL_TIL.week2.package1.Lion;

public class Step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("홍길동", "컴퓨터공학", 14);

        // 1. public 필드 접근
        lion.name = "김멋사"; // 정상: 외부 패키지에서도 자유롭게 접근 및 변경 가능

        // 2. default 필드 접근 시도 (주석 해제 시 컴파일 에러 발생)
        // lion.major = "소프트웨어학";
        // 에러 원인: major is not public in package1.Lion; cannot be accessed from outside package

        // 3. private 필드 접근 시도 (주석 해제 시 컴파일 에러 발생)
        // lion.generation = 15;
        // 에러 원인: generation has private access in package1.Lion
    }
}
