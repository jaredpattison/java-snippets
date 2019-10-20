class Arthropod {
  public void printName(double input) { System.out.print("Anthropod"); }
}
public class Spider extends Arthropod {
  public void printName(int input) { System.out.print("spider"); }
  public static void main(String[] args) {
    Spider spider = new Spider();
    spider.printName(4);
    spider.printName(9.0);
  }
}
