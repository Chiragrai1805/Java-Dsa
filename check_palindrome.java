//check a string is palindrome or not
public class check_palindrome{
    public static boolean isPalindrome(String word){
     char[] chararray=word.toCharArray();  //makes the wod character in a string(array) format
     int start=0;
     int end=word.length()-1;

     while(start<end){
        if(chararray[start]!=chararray[end]){
            return false;
        }
        start++;
        end--;

     }
     return true;
    }
    public static void main(String[] args) {
     
    }
}
