import java.io.*;

class Q1
{
	public static void main(String x[])
	{
		File f = new File("F:/Chitkara/ACADVIEW/10-09-18/abc.txt");
		System.out.println();
		try
		{
			FileInputStream fi = new FileInputStream(f);
			int i = fi.read();
			int Count=1;
			System.out.print("Path "+Count+": ");
			while(i != -1)
			{
				if((char)i == '\n')
				{
					System.out.println();
					Count++;
					System.out.print("Path " +Count+ ": ");
				}
				else
					System.out.print((char)i);
				i = fi.read();
			}
			fi.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}