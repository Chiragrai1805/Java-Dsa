
public class missing_Numbers{
    public static int findmissing(int arr[]){
      int n=arr.length+1;
      int sum=n*(n+1)/2;
      for(int num:arr){
        sum=sum-num;
      }
       return sum;
        }
     public static void main(String[] args){
        int arr[]={1,2,3,4,6,7,8};
        int missing=findmissing(arr);
        System.out.println("The missing number is:" + missing);
     }   
    }