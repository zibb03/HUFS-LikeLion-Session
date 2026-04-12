package likeLion_PBL_TIL.week2.package1;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("전공을 입력하세요: ");
        String major = scanner.nextLine();

        System.out.print("기수를 입력하세요: ");
        int generation = scanner.nextInt();

        // 입력값과 관계없이 우선 객체 생성
        Lion lion = new Lion(name, major, generation);

        // 객체 스스로 자신의 상태를 검증하도록 책임 위임
        if (lion.isValid()) {
            System.out.println("Lion 객체 검증 완료.");
            lion.printInfo();
        } else {
            System.out.println("객체는 생성되었으나, 내부 상태가 유효하지 않습니다.");
        }
    }
}