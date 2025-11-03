import java.util.*;
public class anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		if(ch.length==ch1.length) {
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
			System.out.println("Angram");
		else
			System.out.println("Not Anagram");
	}
	}
}
