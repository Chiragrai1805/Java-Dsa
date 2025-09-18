public class zeroes_toend{

 public void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
 }
 public void array(){
    int[]arr={2,3,0,7,8,0,5,1};
    printarray(arr);
    movezeroes(arr,arr.length);
    printarray(arr);
 }
 public void movezeroes(int arr[],int n){
        int j=0;
        for( int i=0;i<n;i++){
           if(arr[i]!=0 && arr[j]==0){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
           if(arr[j] !=0 ){
           j++;
        }
    }
 }
 public static void main(String[] args){
    zeroes_toend arrUtil =new zeroes_toend();
    arrUtil.array();
 }

}

