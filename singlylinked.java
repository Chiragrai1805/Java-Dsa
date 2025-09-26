public class singlylinked{
    private Listnode head;

    private static class Listnode{
        private int data;
        private Listnode next;
        
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
    singlylinked sll=new singlylinked();
    sll.head=new Listnode(10);
    Listnode second= new Listnode(1);
    Listnode third= new Listnode(8);
   Listnode fourth=new Listnode(11);

   sll.head=  
    }
}