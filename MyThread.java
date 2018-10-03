package threads;

public class MyThread extends Thread
{
	public void run()
	{
	int n=5;
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(n+"*"+i+"="+(n*i));
	}
}
	public static void main(String[] args)
	{
	
		MyThread t=new MyThread();
		t.start();

	}
	
}
