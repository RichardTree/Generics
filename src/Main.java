public class Main {

  public static void main(String[] args) {

  Counter<Apple> appleCounter = new Counter<>();

  appleCounter.add(new Apple());
  appleCounter.add(new Apple());

  Box<Apple> boxOfApples = new Box<>();
  Box<Pear> boxOfPears = new Box<>();

  Cart<Box> cartOfBoxes = new Cart<>();

  boxOfApples.getList().add(new Apple());
  boxOfApples.getList().add(new Apple());
  boxOfApples.getList().add(new Apple());

  boxOfPears.getList().add(new Pear());
  boxOfPears.getList().add(new Pear());
  boxOfPears.getList().add(new Pear());
  boxOfPears.getList().add(new Pear());

  cartOfBoxes.getList().add(boxOfApples);
  cartOfBoxes.getList().add(boxOfPears);


  System.out.println(appleCounter.getCount());
  System.out.println(boxOfApples.getCount());
  System.out.println(cartOfBoxes.getCount());


  }
}