public class MyBSTNode<T> {

    public T item;
    public MyBSTNode rNode;
    public MyBSTNode lNode;

    public MyBSTNode (T value){
        item = value;
        lNode = rNode = null;
    }
}
