interface Nocturnal {
  default boolean isBlind() { return true; }
}
class Bird extends Owl implements Nocturnal {
}
public class Owl implements Nocturnal {
 public boolean isBlind() { return false; }
 public static void main(String[] args) {
  Nocturnal nocturnal = new Owl();
  Nocturnal bird = new Bird();
  Owl bird2 = (Owl) bird;
  System.out.println("nocturnal " + nocturnal.isBlind());
  System.out.println("bird " + bird.isBlind());
  System.out.println("bird2 " + bird2.isBlind());
  }
}
