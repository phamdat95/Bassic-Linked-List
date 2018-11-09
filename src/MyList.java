public class MyList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    MyList(){}

    void print(){
        Node curren = head;
        while (curren != null){
            System.out.println(curren.element);
            curren=curren.next;
        }
    }
    void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null){
            tail = head;
        }
    }
    void addLast(E e){
        if(tail == null){
            addFirst(e);
        } else {
            Node<E> newNode = new Node<>(e);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    void add(int index, E e){
        if (size == 0){
            addFirst(e);
        } else if (index >= size){
            addLast(e);
        } else {
           Node<E> current = head;
           for (int i = 1; i < index; i++){
               current = current.next;
           }
           Node<E> temp = current.next;
           current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    E get(int index){
        Node<E> curren = head;
        for (int i=1; i < index; i++){
            curren = curren.next;
        }
        return (E) (curren.next).element;
    }
}
