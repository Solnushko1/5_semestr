public class Main {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder()
                .setOrderId("12")
                .addProduct("Аэрогриль")
                .setDeliveryAddress("Воронеж, ул. Ленина, дом 10")
                .setTotalCost(1500.50)
                .build();

        System.out.println(order);
    }
}