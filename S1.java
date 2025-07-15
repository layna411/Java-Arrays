import java.util.*;
class ArraySizeNotGven 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = sc.nextLine();
		if (str.startsWith("{") && str.endsWith("}"))
		{
			str = str.substring(1,str.length()-1);
		}
		String nums[] = str.split(",");
		ArrayList<Integer>list = new ArrayList<>();
		
		for (String num:nums )
		{
	         list.add(Integer.parseInt(num));
		}
		for (int ele:list)
		{
			System.out.print(ele + " ");
		}
	}
}
