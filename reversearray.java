class reversearray{
    public static void printarrays(int arr[]){
         for(int i=0;i<arr.length;i++){
           System.out.print( arr[i] + " ");
         }
    }
    public static void reverse_array(int numbers[],int start,int end){
        while(start<end){
            int temp=numbers[start];  
            numbers[start]=numbers[end];
            numbers[end]=temp;  
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
       int numbers[]={2,3,5,5,7};
       printarrays(numbers);
       reverse_array(numbers,0,numbers.length-1);
       printarrays(numbers);    
    }
}