package likeLion;

public class Water extends Beverage {

    private int ExpirationDate; // EnergyDrink만의 추가 필드

    public Water(String name, int price,
                       int stock, int ExpirationDate) {
        super(name, price, stock);
        this.ExpirationDate = ExpirationDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("이름: "   + getName());   // getter 사용
        System.out.println("가격: "   + getPrice() + "원");
        System.out.println("재고: "   + getStock() + "개");

        System.out.println("유통기한: " + ExpirationDate + "일 남음");
    }
}