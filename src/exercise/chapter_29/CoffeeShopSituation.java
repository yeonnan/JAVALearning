package exercise.chapter_29;

//손님 현금 : 5만원
//매장 : 100만원
public class CoffeeShopSituation {

    public static void main(String[] args) {
        //미리 인스턴스화(초기화)
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        //로직 시작
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;

        customer.askCoffee(cashier, coffeeName);

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, (int) price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName,500, 30);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        customer.drinkCoffee(coffeeCompleted);
        if (coffeeCompleted.getCoffeeName()==coffeeName &&
            coffeeCompleted.isWrappedUp() == isTakeOut) {
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo();

    }
}
