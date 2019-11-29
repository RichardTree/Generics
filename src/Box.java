import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Box <T> implements Countable {


ArrayList <T> box = new ArrayList<>();

  public <T> Box () {
  }

  @Override
  public int getCount() {
    return this.box.size();
  }

  public List<T> getList() {
    return this.box;
  }
}
