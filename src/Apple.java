import com.sun.tools.javac.code.Attribute.Enum;
import java.util.Objects;

public class Apple implements Countable{

  private int count = 1;

  public String getColour() {
    return colour;
  }

  private String colour;

  @Override
  public boolean equals(Object o) {
//    if (this.getColour().equals()) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
    Apple apple = (Apple) o;
    return this.getColour().equals(apple.getColour());
  }

  @Override
  public int hashCode() {
    return Objects.hash(colour);
  }

  public Apple(String colour) {
    this.colour = colour;
  }

  @Override
  public int getCount() {
    return count;
  }
}
