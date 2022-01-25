import java.util.List;

public class Mango {
    
private ListNode  head;

public static class ListNode{

    private int data;
    private ListNode next;

    public ListNode(int data){
this. data=data;
this.next=null;
    }

}

public static void main(String[] args) {
    Mango obj = new Mango();
    
    obj.add_last(100);
    obj.add_last(200);
    obj.add_last(300);
    obj.display();

}


public void display(){
    ListNode current = head;
    while(current!=null){
        System.out.println(current.data);
        current = current.next;
    }
}

//--------pushing values at the end of the linked list------------

public void add_last(int value){

    ListNode newnode = new ListNode(value);
    if(head==null){
        head=newnode;
        return;
    }

    ListNode current = head;
    while(current.next!=null){
        current = current.next;

    }
    current.next=newnode;

}

}

