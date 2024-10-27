public class Order {
    private int orderID;
    private int customerID;
    private int productID;
    private int quantity;

    public Order(int orderID, int customerID, int productID, int quantity) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.productID = productID;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID + "; Customer ID: " + customerID +
                "; Product ID: " + productID + "; Quantity: " + quantity;
    }

    public static void main(String[] args){
        SinglyLinkedList<Order> orders = new SinglyLinkedList<>();
        Order order1 = new Order(1, 2, 3, 4);
        Order order2 = new Order(2, 9, 8, 7);
        Order order3 = new Order(3, 3, 5, 7);

        orders.display();
        orders.append(order1);
        orders.display();
        System.out.println();
        orders.append(order2);
        orders.display();
        System.out.println();
        orders.append(order3);
        orders.display();
        System.out.println();
        orders.reverse();
        orders.display();
    }
}
