class Mammal {
  public Mammal(int age) {
    System.out.println("Mammal is " + age);
  }
}
public class Platypus extends Mammal {
  public Platypus() {
   System.out.println("Platypus");
  }
  public static void main(String[] args) {
    new Mammal(5);
  }
}
