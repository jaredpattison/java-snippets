public class Squares {
 public static int square(long x) {
  int y = (int)(x * x);
  x = -1;
  return y;
 }
 public static void main(String[] args) {
   long value = 9;
   int result = square(value);
   System.out.println(result);
 }} 
