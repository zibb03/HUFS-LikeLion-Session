package likelion;

// Coffee.java — name, price, stock이 private이 됐으므로
// getter를 사용합니다
public class DrippedCoffee extends Beverage {

    private int caffeine;

    public DrippedCoffee(String nation, int price,
                  int stock, int caffeine) {
        super(nation, price, stock);
        this.caffeine = caffeine;
    }

    @Override
    public void displayInfo() {
        System.out.println("원산지: "   + getName());   // getter 사용
        System.out.println("가격: "   + getPrice() + "원");
        System.out.println("재고: "   + getStock() + "개");

        System.out.println("카페인: " + caffeine + "mg");
    }
}