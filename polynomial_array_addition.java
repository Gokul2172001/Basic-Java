public class polynomial_array_addition {
	static int max(int m, int n) {
		return (m>n)?m:n;
	}
	static int add(int a[], int b[], int m,int n) {
		int size=max(m,n);
		int sum[]=new int[size];
		for(int i=0;i<m;i++) {
			sum[i]=a[i];
		}
		for(int i=0;i<n;i++) {
			 sum[i]+=b[i];
		}
		return sum;
	}
static void poly(int c[], int d) {
	for(int i=d-1;i>=0;i--) {
		System.out.print(c[i]);
		if(i!=0) {
			System.out.print("x^"+i);
		}
		if(i!=d) {
			System.out.print("+");
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,5,6};
		int b[]= {8,3,2};
		int m=a.length;
		int n=b.length;
		System.out.println("First polynomial equation is:");
		poly(a,m);
		System.out.println();
		System.out.println("Second polynomial equation is:");
		poly(b,n);
		//int sum[]=add(a,b,m,n);
		//int size=max(m,n);
		//System.out.println("Addition of polynomial equation is:");
		//poly(sum,size);
	}

}