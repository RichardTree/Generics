import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Counter <T> {

  private ArrayList<T> count = new ArrayList<>();

  void add (T item) {
    this.count.add(item);
  }


  int getCount () {
    int sum = 0;
    for (T t:count) {
    sum++;
    }
    return sum;
  }



}
