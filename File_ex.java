import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
class File_ex
{
	public static void main(String s[])
	{
		try
		{
			File f=new File("jeni.txt");
			FileWriter writer=new FileWriter("jeni.txt");
			FileReader reader=new FileReader("jeni.txt");
			BufferedReader buffer=new BufferedReader(reader);
			if(f.createNewFile())
			{
				System.out.println("File created: "+f.getName());
			}
			else
			{
			System.out.println("File already exists");
			}
			writer.write("Hello");
			System.out.println("File is writed successfully");
			writer.close();
			String l;
			while((l=buffer.readLine())!=null)
			{
				System.out.print(l);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}