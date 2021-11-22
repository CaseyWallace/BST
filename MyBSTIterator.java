import java.util.Iterator;

public class MyBSTIterator<T> implements Iterator<T>{

  MyBST mbst;
  int index = 0;

  public MyBSTIterator(MyBST mbst){
    this.mbst = mbst;
  }

  @Override
  public boolean hasNext() {
    return index < mbst.size();
  }

  @SuppressWarnings("unchecked")
  @Override
  public T next() {
    return null;
  }
  
}
