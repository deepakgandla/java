class Multi extends Thread
{
public void run() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("Thread Name: "+Thread.currentThread().getName());
	System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
}




public static void main(String args[]) {
/* Multi m1=new Multi();
 Multi m2=new Multi();
 System.out.println("T1 name: "+m1.getName());
 System.out.println("T2 name: "+m2.getName());
 System.out.println("T1 ID: "+m1.getId());
 m1.start();
 m2.start();
 m1.setName("Thread");
 System.out.println("Actual T1 name: "+m1.getName());*/
	
	
	
	
/*	Multi m1=new Multi();
	Multi m2=new Multi();
	m1.start();
	m2.start();*/
	
	Multi m1=new Multi();
	Multi m2=new Multi();
	m1.setPriority(Thread.MIN_PRIORITY);
	m2.setPriority(Thread.MAX_PRIORITY);
	m1.start();
	m2.start();
	
	
	
	
}
}