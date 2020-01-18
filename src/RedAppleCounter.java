import java.util.ArrayList;

public class RedAppleCounter <T>{


  private ArrayList<Apple> count = new ArrayList<>();

  void add (T o) {
    Apple apple = (Apple) o;
    if (apple.getColour().equals("Red"))
    this.count.add(apple);
    else {
      System.out.println("You can only add red apples to this counter!");
    }
  }

  int getCount () {
    int sum = 0;
    for (Apple a :count) {
      sum++;
    }
    return sum;
  }
}
