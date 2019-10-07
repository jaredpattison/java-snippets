public class OrderDriver {
  public static void main(String[] args) {
    System.out.print(Order.result + " ");
    System.out.print(Order.result + " ");
    new Order();
    Order order2 = new Order();
    System.out.print(Order.result);
    System.out.print("**" + Order.result);
    new Order();
    System.out.print("XX" + Order.result);
  }
}
