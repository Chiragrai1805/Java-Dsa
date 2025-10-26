public class deleteleastnode_sll {
  public node head;
  
  public static class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
  }
  public void deletelast(){
    if(head==null){
        System.out.println("null");
    }
    node current=head;
    node previous=null;
    while(current.next!=null){
        previous=current;           
        current=current.next;
    }
    previous.next=null;
  }

  public void display(){
    node current=head;
    while(current!=null){
      System.out.println(current.data);
      current=current.next;
    }
  }
  public static void main(String[] args) {
    deleteleastnode_sll sll=new deleteleastnode_sll();
    sll.head=new node(20);
    node second=new node(30);
    node third=new node(40);
    sll.head.next=second; 
    second.next=third;

    sll.deletelast();
    sll.display();
  }
}
