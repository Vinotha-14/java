import java.util.*;
public class ProductMultiply {
static void multiply(int a[]) {
	int p=1;
	for(int i=0;i<a.length;i++) {
		p*=a[i];
	}
	System.out.println(p);
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		multiply(a);

	}

}
