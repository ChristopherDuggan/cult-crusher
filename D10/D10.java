import java.util.SplittableRandom;

class D10 {
  public static void main(String[] args) {
    SplittableRandom die = new SplittableRandom();
    System.out.println(die.nextInt(1, 10));
  }
}
