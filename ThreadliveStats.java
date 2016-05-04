package session8;

public class ThreadliveStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread(); // create a new thread 
		
		try { 
		 int i = 0;
		 while(i<10)
		 {
			 i++;
		System.out.println("Main Thread will be alive till the child thread is live ");
		Thread.sleep(1000); 
		} 
		} catch (Exception e) { 
		System.out.println("Main thread interrupted."); 
		} 
		 
		System.out.println("Main thread's run is over."); 
		} 

	}
//Create a second thread. 
class NewThread implements Runnable { 
Thread t; 
NewThread() { 
//Create a new, second thread 
t = new Thread(this, "my extending thread"); 
System.out.println("my thread" + t); 
t.start(); // Start the thread 

} 
//This is the entry point for the second thread. 
public void run() { 
try { 
int j = 0; 
while(j <10)
{ 
System.out.println("Printing the count: " + j);
j++;
Thread.sleep(1000); 
} 
} catch (Exception e) { 
System.out.println("Child interrupted."); 
} 
System.out.println("My thread run is over."); 
} 
}

