public class tower_of_hanoi{
    public static void tower(int n,String src,String helper,String destination){
//TRANSFER N-1 FROM SRC TO HELPER USING SRC AS A HELPER::
        tower(n-1,src,destination,helper);
        System.out.println("Transfer disk from" +src+ "to"+helper );
//TRANSFER N-1 FROM HELPER TO DESTINATION USING SRC AS AHELPER;;        
        tower(n-1,helper,src,destination );

    }
    public static void main(String[] args){
    int n=2;
    tower(n,"A","B","C");
    }
}