import java.io.*;
import java.util.*;
class Filedemo
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("abc.txt");
		int data;
		while((data=fis.read())!=-1)
		{
			char ch=(char)data;
			if(Character.isLowerCase(ch))
			{
				ch=Character.toUpperCase(ch);
				System.out.println("UPPERCASE="+ch);
			}
			else if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
				System.out.println("LOWERCASE="+ch);
			}
			else if(Character.isDigit(ch))
			{
				System.out.println("DIGIT="+ch);
			}
		}
		fis.close();	
	}
}
