package BookExplorerManager;
public class LLstack<E> {

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
    private Node<E> top;   // reference to the head node 
    private int size;   // number of elements in the LLstack 

    public LLstack() {   // constructs an empty LLstack
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return top.getElement(); 
    }

    public void push(E elem) {
        Node<E> v = new Node<E>(elem, top);   // create and link-in a new node 
        top = v;
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E temp = top.getElement();
        top = top.getNext();   // link-out the former top node 
        size--;
        return temp;
    }

    public void Display() {
        LLstack<E> temp = new LLstack<E>();
        while (!this.isEmpty()) {
            System.out.println(this.top());
            temp.push(this.pop());
        }
        while (!temp.isEmpty()) {
            this.push(temp.pop());
        }
    }
    public boolean find (E key){
        
        LLstack<E> list2 = new LLstack<>();
        boolean is= false;
        while(! isEmpty()){
            E ele = pop();
            list2.push(ele);
            if(ele == key){
                is = true;
            }
         
        }
        while(! list2.isEmpty()){
          push(list2.pop());
        
    }return is;
}
public void RemoveAllEllemnetE (E e){
    LLstack<E> list = new LLstack<>();
    while(! isEmpty()){   
    E ele = top();
    
    if(ele == e){
        pop();
    }else{
        ele = pop();
        list.push(ele);
    }
    }
    while(! list.isEmpty()){
        push(list.pop());
    }
}
    
    
}   