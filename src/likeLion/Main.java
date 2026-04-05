package likeLion;

public class Main {
    public static void main(String[] args) {

        // 1. 자판기 생성
        VendingMachine vm = new VendingMachine(8);

        // 2. 음료 추가
        //    Beverage는 추상 클래스라 직접 만들 수 없습니다
        //    Coffee, EnergyDrink 같은 자식 클래스만 만들 수 있습니다
        vm.addBeverage(new Coffee      ("맥심 TOP", 2000, 5,  150));
        vm.addBeverage(new Coffee      ("조지아",   1800, 8,  60));
        vm.addBeverage(new EnergyDrink ("레드불",   2500, 3,  1000));
        vm.addBeverage(new EnergyDrink ("몬스터",  2000, 5,  800));
        vm.addBeverage(new DrippedCoffee ("에티오피아 커피",  3000, 5,  800));
        vm.addBeverage(new DrippedCoffee ("나이지리아 커피",  3500, 5,  800));
        vm.addBeverage(new Water ("삼다수",  1000, 5,  3));
        vm.addBeverage(new Water ("아쿠아파나",  3000, 5,  6));

        // 3. 메뉴 출력 (다형성: 각자 자기 방식으로 출력)
        vm.showMenu();

        // 4. 구매
        vm.purchase(1, 2000); // 맥심 TOP, 2000원 → 성공, 거스름돈 0원
        vm.purchase(1, 1000); // 맥심 TOP, 1000원 → 금액 부족
        vm.purchase(3, 3000); // 레드불,    3000원 → 성공, 거스름돈 500원
        vm.purchase(5, 3000); // 에티오피아, 3000원 → 성공, 거스름돈 0원
        vm.purchase(7, 3000); // 삼다수,    1000원 → 성공, 거스름돈 2000원

    }
}
