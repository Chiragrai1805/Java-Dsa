public class deletefirstnode_sll {
    public node head;

    public static class node{
        int data;
        public node next; 

    public node(int data){
    this.data=data;
    this.next=null;
    }
    }
    public void insertatbeg(int data){
       node newnode=new node(data);
       newnode.next=head;
       head=newnode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("null");
        }
         node temp=head;
         head=head.next;
         temp.next=null;
    }
    public void display(){
        node current=head;
        while(current!=null){
            System.out.print(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
       deletefirstnode_sll sll = new deletefirstnode_sll();
       sll.head=new node(10);
       node second=new node(20);
       node third=new node(30);
       sll.head.next=second;
       second.next=third;
       sll.insertatbeg(40);
       sll.display();

       sll.deletefirst();
       sll.display();
    }
 }



