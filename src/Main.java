public class Main {

  public static void main(String[] args) {

  Counter<Apple> appleCounter = new Counter<>();
  RedAppleCounter<Apple> redAppleCounter = new RedAppleCounter<>();

  appleCounter.add(new Apple("Red"));
  appleCounter.add(new Apple("Green"));

  redAppleCounter.add(new Apple("Red"));
  redAppleCounter.add(new Apple("Blue"));


  System.out.println("Apple Counter:" + appleCounter.getCount());
  System.out.println("Red Apple Counter:" + redAppleCounter.getCount());
  }
}