public class Test2 {
  private String name = "testy2";
  { System.out.println(name + " 5"); }
  private static int COUNT = 0;
  static { System.out.println(COUNT + " 3"); }
  static { COUNT += 10; System.out.println(COUNT + " 4"); }
  public Test2() {
    System.out.println("constructor 6");
  }}

