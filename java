package work;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int k;
	int t;
	int n =scan.nextInt();
	int[] a=new int[10000];
	
	for(int i=0;i<n;++i){
		a[i]=scan.nextInt();
	}
	for(int j =1;j<n;++j){
		for(k=0;k<n-j;++k){
			if(a[k]<a[k+1]){
				t=a[k];
				a[k]=a[k+1];
				a[k+1]=t;
			}
		}
	}for(int x=0;x<n;++x)
		System.out.println(a[x]);
	}
}

