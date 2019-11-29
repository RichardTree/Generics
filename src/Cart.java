import java.util.ArrayList;
import java.util.List;

public class Cart <T> implements Countable{

  ArrayList<Box> cart = new ArrayList<>();

  public Cart() {
  }

  @Override
  public int getCount() {
    int x = 0;

    for (int i = 0; i < this.cart.size(); i++ ){
      x = x + this.cart.get(i).box.size();
    }

  return x;
  }

  public ArrayList<Box> getList() {
    return this.cart;
  }

}
