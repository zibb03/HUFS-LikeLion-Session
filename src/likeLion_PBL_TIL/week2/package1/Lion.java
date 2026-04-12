package likeLion_PBL_TIL.week2.package1;

public class Lion {
    public String name;       // 어디서든 접근 가능
    String major;             // 같은 패키지 내에서만 접근 가능 (default)
    private int generation;   // Lion 클래스 내부에서만 접근 가능

    // 생성자: 객체의 초기 상태만 설정 (출력 없음)
    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    // Step 2에서 사용할 객체 내부 유효성 검증 메서드
    public boolean isValid() {
        if (name == null || name.isEmpty()) {
            System.out.println("오류: 이름이 비어 있습니다.");
            return false;
        }
        if (major == null || major.isEmpty()) {
            System.out.println("오류: 전공이 비어 있습니다.");
            return false;
        }
        if (generation < 1) {
            System.out.println("오류: 기수는 1 이상이어야 합니다.");
            return false;
        }

        return true;
    }

    // 객체 정보 출력 메서드
    public void printInfo() {
        System.out.println("아기사자 정보 - 이름: " + name + ", 전공: " + major + ", 기수: " + generation);
    }
}