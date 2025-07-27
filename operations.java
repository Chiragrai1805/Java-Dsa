
import java.util.Scanner;

public class operations{
    public static void main(String[] args){
        int stack[]=new int[20];
        int value,choice;
        int top=-1;
        while (true) { 
            System.out.println("Enter Stack Operations:\n");
            System.out.println("1.push");
            System.out.println("2.Pop");
            System.out.println("Display");
            System.out.println("Enter your choice:");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            
            if (choice==1){
                if(top>=19){
                    System.out.println("Stack overflow");
                }
                else{
                    System.out.println("Enter the vlaue to be pushed:");
                    value=sc.nextInt();
                    top++;
                    stack[top]=value;
                    System.out.println(value+"is pushed into stack");
                }

            }
            else if(choice==2){
                if(top==-1){
                    System.out.println("Stack underflow");

                }
                else{
                    System.out.println(stack[top]+"is popped from stack");
                    top--;
                }
            }
            else if(choice==3){
                if(top==-1){
                    System.out.println("Stack underflow");
                }
                else{
                    for(int i=top;i>=0;i--){
                        System.out.println(stack[i]);
                    }
                }
            }
        }
    }
}