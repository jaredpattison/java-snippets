public class Order {
  static String result = "reset static-";
  { result += "firstInstace-"; }
  static  
  { result += "static-"; }
  { result += "secondInstace"; }
}
