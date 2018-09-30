
public class String_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]=new String[10];
		
		str[0]= "sanjeev";
		System.out.println(str[0]);
		
		String str1 = "The rains have come";
		String str2 = "The rains have not come";
		
		System.out.println(str1.equals(str2));
		System.out.println("Length of first string is " + str1.length());
		System.out.println("Character at 10 for string1 is " + str1.charAt(10));
		System.out.println("Index of s is " + str1.indexOf('s'));
		System.out.println("Index of s is " + str1.indexOf("s"));
		System.out.println("Index of s is " + str1.indexOf("rains"));
		System.out.println(str1.substring(0, 10));
		
		System.out.println("**********Spliting the string**************");
		String splitted[] = str1.split(" ");
		
		System.out.println(splitted.length);
		for(int i=0; i<splitted.length; i++)
		{
			System.out.println(splitted[i]);
		}
		
		System.out.println("***********Coverting data types*************");
		String str3="100";
		
		int i = Integer.parseInt(str3);
		String str4 = String.valueOf(i);

		System.out.println(str4);
		

	}

}
