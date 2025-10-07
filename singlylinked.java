public class singlylinked{
    public listnode head;

    public static class listnode{
    public int data;
    public listnode next;

    public listnode(int data){
        this.data=data;
        this.next=null;
    }
}
public void display(){
    listnode current=head;
    while(current !=null){
       System.out.println(current.data+ " ");
       current=current.next;    
    }
}
public int count(){
    int count=0;
    listnode current=head;
    while(current!=null){
        count++;
        current=current.next;
    }
    return count;
}
public static void main(String[] args){
    singlylinked sll=new singlylinked();
    sll.head=new listnode(10);
    listnode second=new listnode(20);
    listnode third=new listnode(30);
    listnode fourth=new listnode(40);
    sll.head.next=second;
    second.next=third;

     sll.display();
     System.out.println("The length is" + sll.count());

 }
}