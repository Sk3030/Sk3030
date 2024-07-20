package BookExplorerManager;


public class LLQueue<E> {

    static class Node<E> {

        private E element; // reference to the element stored at this node
        private Node<E> next; // reference to the subsequent node in the list

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public void setelement(E element) {
            this.element = element;
        }
    }
    protected Node<E> front;
    protected Node<E> rear;
    protected long size;

    public LLQueue() { // constructor
        front = null;
        rear = null;
        size = 0;
    }

    public long getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // returns (but does not remove) the first element
        if (isEmpty()) {
            return null;
        }
        return front.getElement();
    }

    public E last() { // returns (but does not remove) the last element
        if (isEmpty()) {
            return null;
        }
        return rear.getElement();
    }

    public void Enqueue(E elem) {
        Node<E> newest = new Node<E>(elem, null);
        if (isEmpty()) {
            front = newest; // special case of a previously empty queue 
        } else {
            rear.setNext(newest); // add node at the tail of the list 
        }
        rear = newest; // update the reference to the tail node 
        size++;
    }

    public E Dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = front.getElement();
        front = front.getNext();
        size--;
        if (size == 0) {
            rear = null; // the queue is now empty
        }
        return answer;
    }
    
    public void Display(){
        long size = getSize();
        for (int i = 0; i < size; i++) {
            E ele = Dequeue();
            System.out.println(ele);
            Enqueue(ele);
            
        }
       
    }
    public void searchOfKey(E key){
        int count = 1;
        int index = -1;
        long size = getSize();
        for (int i = 0; i < size; i++) {
            E ele = Dequeue();
            if ( ele == key){
                index = count;                
            }
            System.out.println(ele);
            Enqueue(ele);
            count++;
            
        }
    }
    public boolean find (E key){
        
        LLQueue<E> list2 = new LLQueue<>();
        boolean is= false;
        while(! isEmpty()){
            E ele = Dequeue();
            list2.Enqueue(ele);
            if(ele == key){
                is = true;
            }
         
        }
        while(! list2.isEmpty()){
          Enqueue(list2.Dequeue());
        
    }return is;
}
    public void RemoveAllEllemnetE (E e){
    LLQueue<E> list = new LLQueue<>();
    while(! isEmpty()){   
    E ele = first();
    
    if(ele == e){
        Dequeue();
    }else{
        ele = Dequeue();
        list.Enqueue(ele);
    }
    }
    while(! list.isEmpty()){
        Enqueue(list.Dequeue());
    }
}
}
 