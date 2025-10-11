public class insertion_atend {
    public node head;

    public static class node{
       public int data;
        public node next;
    
    public node(int data){
    this.data=data;
    this.next=null;
    }
   }

   public void insert_atend(int data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
    }
    node current=head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newnode;
   }

  public void display(){
    node current=head;
    while(current!=null){
        System.out.println(current.data);
        current=current.next;
    }
  } 


   public static void main(String[] args) {
    insertion_atend sll=new insertion_atend();
    sll.head=new node(10);
    node second =new node(20);
    node third=new node(30);
    node fourth=new node(40);
    sll.head.next=second;
    second.next=third;
    third.next=fourth;

    sll.insert_atend(50);
    sll.display();
    }
}
