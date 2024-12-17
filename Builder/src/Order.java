import java.util.ArrayList;
import java.util.List;

class Order {
    private final String orderId;
    private final List<String> products;
    private final String deliveryAddress;
    private final double totalCost;

    private Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.products = builder.products;
        this.deliveryAddress = builder.deliveryAddress;
        this.totalCost = builder.totalCost;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<String> getProducts() {
        return products;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", products=" + products +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }

    public static class OrderBuilder {
        private String orderId;
        private List<String> products = new ArrayList<>();
        private String deliveryAddress;
        private double totalCost;

        public OrderBuilder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder addProduct(String product) {
            this.products.add(product);
            return this;
        }

        public OrderBuilder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OrderBuilder setTotalCost(double totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public Order build() {
            if (orderId == null || deliveryAddress == null) {
                throw new IllegalStateException("Идентификатор заказа и адрес доставки обязательны!");
            }
            return new Order(this);
        }
    }
}