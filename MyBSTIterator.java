import java.util.Iterator;
import java.util.ArrayList;

public class MyBSTIterator<T extends Comparable <T>> implements Iterator<T>{

  Iterator<T> it;
  ArrayList<T> list;

  public MyBSTIterator(MyBST mbst){
    list = mbst.toArrayList();
  }

  @Override
  public boolean hasNext() {
    return it.hasNext();
  }

  @Override
  public T next() {
    return it.next();
  }
  
}
