public class Test {// 0 static 1  read to construct, in main Testy instance1 1
  // instace 2 and finally the constructor
  private String name = "Testy";
  { System.out.println(name + " instance1"); }
  private static int COUNT = 0;
  static { System.out.println(COUNT + " static 1"); }
  { COUNT++; System.out.println(COUNT + " instance2"); }
  public Test() {
    System.out.println("and finally the constructor");
  }
  public static void main(String[] args) {
    System.out.println("read to construct, in main");
    new Test();
  }
}
