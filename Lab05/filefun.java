import java.io.*;

class file_fun
{

	public static void main(String[] args) {
		try
		{
			FileWriter f1 = new FileWriter("first.txt");
				f1.write("222\n333\n444");
				f1.close();
			
			FileWriter f2 = new FileWriter("Second.txt");
			BufferedWriter bw = new BufferedWriter(f2);
				bw.write("AAA\nBBB");
				bw.newLine();
				bw.write("CCC");

				bw.close();

			FileReader fr = new FileReader("first.txt");
				int i;

				while((i=fr.read())!= -1)					
					System.out.print((char)i);
					fr.close();		
					System.out.println();
			FileReader fr1 = new FileReader("Second.txt");
			BufferedReader bw1 = new BufferedReader(fr1);

				int j;

					while((j=bw1.read())!= -1)
						System.out.print((char)j);
						bw1.close();
						
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("\nSuccessFull ...");
	}
}
© 2020 GitHub, Inc.