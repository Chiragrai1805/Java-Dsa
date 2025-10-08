public class insertion_atbeg{
    public node head;

    public static class node{
     public  int data;
      public  node next;
    
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
    public void display(){
        node current=head;
        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
    }
    public void insertfirst(int data){
        node newnode=new node(data);   //Creation of a newnode;
        newnode.next=head;               
        head=newnode;
    }

    public static void main(String[] args) {
    insertion_atbeg sll=new insertion_atbeg();
    /*sll.head=new node(10);
    node second=new node(20);
    node third=new node(30);
    sll.head.next=second;
    second.next=third;
    */
   
    sll.insertfirst(20);
    sll.insertfirst(30);
    sll.display();
    }
}

    
