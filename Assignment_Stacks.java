package assignment_stacks;

import java.util.*;

public class Assignment_Stacks {
    //Stack <Character> stack = new Stack <Character>();
    int maxSize; //size of the stack array
    String[] stackArray; //the array
    String[] secondArray;
    int top; //top of the stack
    int sectop;
    
    public static void main(String[] args) 
    {
        String stackArray[] = {"[","a","v","{","}","]"}; //this is correct
        
        Stack <String> theStack = new Stack <String>();
        
        for (int i=0; i< stackArray.length; i++){
            if(stackArray[i] == "["|| stackArray[i] == "("||stackArray[i] == "{"){
               theStack.push(stackArray[i]);
            }
            else if (stackArray[i] == "]")
            {
                if(theStack.empty() || theStack.pop() != "[")
            System.out.println("THIS DOESNT MATCH");
            }
            else if (stackArray[i] == ")")
            {
                if (theStack.empty() || theStack.pop() != "(")
            System.out.println("THIS DOESNT MATCH");
            }
            else if (stackArray[i] == "}")
            {
                if (theStack.empty() || theStack.pop() != "{")
            System.out.println("THIS DOESNT MATCH");
            }
        }
        System.out.println("1. "+theStack.empty());
        
        //SECOND EXAMPLE
      
        String secondArray[] = {"[","{","}"}; //this is incorrect
        Stack <String> secondStack = new Stack <String>();
        
        for (int y=0; y< secondArray.length; y++){
            if(secondArray[y] == "["|| secondArray[y] == "("||secondArray[y] == "{"){
               secondStack.push(stackArray[y]);
            }
            else if (secondArray[y] == "]")
            {
                if(secondStack.empty() || secondStack.pop() != "[")
            System.out.println("Delimiter does not match");
            }
            else if (secondArray[y] == ")")
            {
                if (secondStack.empty() || secondStack.pop() != "(")
            System.out.println("Delimiter does not match");
            }
            else if (secondArray[y] == "}")
            {
                if (secondStack.empty() || secondStack.pop() != "{")
            System.out.println("Delimiter does not match");
            }
        }
       System.out.println("2. "+secondStack.empty());
    }
    public Assignment_Stacks(int s){
        maxSize = s;
        stackArray = new String[maxSize];
        secondArray = new String [maxSize];
        top = -1;
        sectop = -1;
    }
    public void push(String d){       //this will put the item on top of the stack
        stackArray[++top]= d;
       // secondArray[++sectop]= a;
    
    }
    public String pop(){      //this will take the item from the top of the stack
        return stackArray[top-1];
        
    }
    public boolean full(){      //this means true if the stack is full
        return(top == maxSize-1);
    }
    public boolean empty()  //this will be true if the stack is empty
    {
        return (top == -1);
    }
}
