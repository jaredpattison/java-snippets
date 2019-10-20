
class StringEquality {

  public static void main(String[] args) {
    String a = "";
    a += 2;
    a += 'c';
    a += false;
    // a = "2cfalse";
    if (a == "2cfalse") System.out.println("==");
    if (a.equals("2cfalse"))
    System.out.println("equals");
  }  
}
