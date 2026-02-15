/*
 * Sara Sunny - Homework 6
 * Array Based
 */

package stacktest;

public class AccountStack {
    private AccountNode[] mystack;
    private int size;
    private int current_index;

    public AccountStack(int size)
    {
        mystack = new AccountNode[size];
        this.size = size;
        this.current_index = 0;
        // your code goes here:
        // constructor
    }
    private boolean isFull()
    {
        if(current_index==size) return true;
	else return false;
    }
	
    private boolean isEmpty()
    {
        if(current_index==0) return true;
	else return false;
    }
	
    public boolean push(AccountNode n)
    {
        if(isFull() == false){
            mystack[current_index] = n;
            current_index++;
            return true;
        }
        else
            return false;
        // your code goes here:
        // push AccountNode n to the top of stack and return true
        // if stack is full, do nothing and return false
    }
	
    public AccountNode pop()
    {
        if(isEmpty() == false){
            current_index--;
            return mystack[current_index];
        }
        else
            return null;
        // your code goes here:
        // return the data item at the top of stack
        // if stack is empty, retun null
    }
}
