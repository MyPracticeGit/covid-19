/* ************** TECH-RANCH ****************************************************/
/* ***************  PROJECT NAME : Stack Data Structure****************/
/* ***************  AUTHOR : ANJALI SINGH **************************************/
/* ***************  Dated : AUGUST 27, 2019, Tuesday ****************************/
import java.util.Scanner; 
import java.util.Stack;
public class StackDemo{
private int[] stackArray = new int[10];
private int top = 0;
private int capacity;
public void push(int pushValue)
{
stackArray[top] = pushValue;
top++;
}
public int pop()
{
top--;
return stackArray[top];
    }
// Utility function to return top element in a stack
public int peek()	
{
	if (!isEmpty())
		return stackArray[top];
	else
		System.exit(1);
	return -1;
}
// Utility function to return the size of the stack
public int size()
{
	return top + 1;
}

//Utility function to check if the stack is empty or not
	public Boolean isEmpty()
	{
		return top == -1;	// or return size() == 0;
	}

	// Utility function to check if the stack is full or not
	public Boolean isFull()
	{
		return top == capacity - 1;	// or return size() == capacity;
	}



@SuppressWarnings("unchecked")
public static void main(String args[]) {
int choice, pushValue;

boolean done = false;

@SuppressWarnings("rawtypes")
Stack stack1 = new Stack();
StackDemo s = new StackDemo();

@SuppressWarnings("resource")
Scanner keyboard = new Scanner(System.in);

while (!done)

{

	   System.out.println("* * * * * STACK DEMO MAIN MENU * * * * *");
	   System.out.println("1. PUSH");
	   System.out.println("2. POP");
	   System.out.println("3. PEEK");
	   System.out.println("4. DISPLAY");
	   System.out.println("5. EMPTY");
	   System.out.println("6. OVERLOAD");
	   System.out.println("7. SIZE");
	   System.out.println("8. EXIT");
	   System.out.println("ENTER YOUR CHOICE?");
 
choice = keyboard.nextInt();

System.out.println();

switch (choice)

{

case 1:

System.out.print("Enter an integer to push: "); 
pushValue = keyboard.nextInt(); 
stack1.push(pushValue);

System.out.println();
break;

case 2:

System.out.println("The top value on the stack was: " + stack1.pop());
System.out.println();

break;
case 3 : 
	System.out.println("Peek -->"+stack1.peek());
	
	break;

case 4 : 
	System.out.println("Stack -->"+stack1);
	
	break;
case 5 : 
	boolean t = stack1.isEmpty();
	if(t == true)
	System.out.println("Empty -->"+stack1);
	else	
		System.out.println("Not Empty -->"+stack1);
	break;
case 6 : 
	boolean t1 = s.isFull();
	if(t1 == true)
	System.out.println("Empty -->"+stack1);
	else	
	
	System.out.println("Overload -->"+stack1);
	
	break;

case 7 : System.out.println("Size "+ stack1.size());
		break;
case 8:

done = true;

break;

default:

System.out.println("The number you entered, "+ choice + "," + "is not 1, 2, or 3. Try again!");

System.out.println();
break;

}

}

System.out.println("...quitting"); 
}

}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/