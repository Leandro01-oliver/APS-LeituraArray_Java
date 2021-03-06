public interface IStack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean empty();
    int size();
}
