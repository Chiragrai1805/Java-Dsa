public class minvalue_inarray{
      public static int findmin(int[] arr){
       int min=arr[0];
       for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
       }
       return min;
    }

    public static void main(String[] args){
        int[] arr={4,4,3,1,7};
        int minvalue=findmin(arr);
        System.out.println("The minimum value is :" + minvalue);
    }
 
}