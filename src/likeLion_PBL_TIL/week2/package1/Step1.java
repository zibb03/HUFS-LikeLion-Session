package likeLion_PBL_TIL.week2.package1;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("전공을 입력하세요: ");
        String major = scanner.nextLine();

        System.out.print("기수를 입력하세요: ");
        int generation = scanner.nextInt();

        // main 메서드에서 직접 유효성 검증 수행
        boolean isValid = true;
        if (name == null || name.isEmpty()) {
            System.out.println("오류: 이름이 비어 있습니다.");
            isValid = false;
        } else if (major == null || major.isEmpty()) {
            System.out.println("오류: 전공이 비어 있습니다.");
            isValid = false;
        } else if (generation < 1) {
            System.out.println("오류: 기수는 1 이상이어야 합니다.");
            isValid = false;
        }

        // 검증 통과 시에만 객체 생성
        if (isValid) {
            Lion lion = new Lion(name, major, generation);
            System.out.println("Lion 객체가 성공적으로 생성되었습니다.");
            lion.printInfo();
        } else {
            System.out.println("유효하지 않은 입력값으로 인해 객체를 생성하지 않습니다.");
        }
    }
}
