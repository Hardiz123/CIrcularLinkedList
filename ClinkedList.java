public class ClinkedList {
    static Node head = null;
    static Node tail = null;

    public  void addNode(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail= newNode;
        tail.next = head;
    }

    public void addAtFirst(int val) {
        if(head==null){
            addNode(val);
        }else{
            Node newNode = new Node(val);
            
            tail.next = newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    public void addSorted(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        Node current =null;

        do {
            temp = temp.next;
            
        } while (temp!=head && val < temp.value);

        current=temp.next;
        temp.next = newNode;
        newNode.next = current;
    }
    public void insertAtpos(int pos,int val) {
        Node temp =head;
        if(pos==1){
            addAtFirst(val);
        }
        else if(pos>getSize())
        {
            System.out.println("Enter a valid Position" +getSize());
        }
        else if
        (pos>1&&pos<=getSize()){
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            Node current = temp.next;
            temp.next=newNode;
            newNode.next=current;
        }
    }


    public void deleteByValue(int val) {
        Node current = head;
        Node temp = tail;

        while (current!=tail && current.value!=val) {
            temp = current;
            current=current.next;
        }
        temp.next = current.next;
    }


    public void deleteFirst() {
        Node temp =head;
        if(getSize()==1){
            head=null;
            tail=null;
            return;
        }
        temp =head.next;
        head = temp;
        tail.next = head;
    }


    public void deleteLast() {
        Node temp = head;
        if(getSize()==1){
            head=null;
            tail=null;
            return;
        }
        while (temp.next!=tail) {
            temp=temp.next;
        }
        temp.next=tail.next;
        tail=temp;
    }
    public int getSize(){
        Node temp =head;
        int size=0;
        do if(head!=null){
            size++;
            temp=temp.next;
        } while (temp!=head);
        return size;
    }
    public  void printList() {
        Node temp = head;
        do if(head!=null){
            System.out.print(temp.value+"-->");
            temp = temp.next;
        } while (temp!=head);
    }
    public void ReverseList(){
        if(head==null){
            return;
        }
        Node prev =null;
        Node current = head;
        Node next;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current!=head);

        head.next = prev;
        head = prev;
    }
}