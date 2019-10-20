interface Aquatic {
  public default int getNumberOfGills(int input) { return 2; }
}
public class ClownFish implements Aquatic {
  public String getNumberOfGills() { return "3"; }
  public String getNumberOfGills(int input) { return "8"; }
  public static void main(String[] args) {
    System.out.println(new ClownFish().getNumberOfGills(-1));
  }
}
