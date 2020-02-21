public class Node<T>{

    private T value;

    public Node(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value
    }
}

public class Stack{
    private Node[] stackArr;
    private int top;

    public Stack(){
        this.stackArr = (Node[])new Object[32];
        this.top = -1;
    }

    public boolean isEmpty(){
        if (this.top==-1){
            return true;
        } else {
            return false;
        }
    }

    public T peek(){
        if (!(this.isEmpty()){
            return this.stackArr[this.top]
        }
    }

    public void push(T item){

    } 
}