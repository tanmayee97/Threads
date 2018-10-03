package threads;

public class MyThreads implements Runnable
{
	public void run()
	{
	for(int i=1;i<=100;i++)
	{
		System.out.println(i);
	}
	}
	public static void main(String[] args)
	{
		MyThreads t=new MyThreads();
		Thread t1=new Thread(t);
		t1.start();
		for(int j=100;j>=1;j--)
		{
			System.out.println(j);
		}

	}

}
