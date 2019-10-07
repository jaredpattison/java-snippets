public class Test3 { // 2 4 6 8 5
  static { add(2); }
  static void add(int num) { System.out.print(num + " "); }
  Test3() { add(5); }
  static { add(4); }
  { add(6); }

  static { 
    add(77);
    new Test3();
    add(99); }
  { add(8); }
  public static void main(String[] args) {} }
