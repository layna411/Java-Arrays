import java.io.*;
class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		System.out.println(word);
		
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
	}
}
