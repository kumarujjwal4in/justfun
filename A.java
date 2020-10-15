import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class A{
	static FastScanner fs=new FastScanner();
	static PrintWriter pw=new PrintWriter(System.out);
	static void Solve(long the){
		long n;
		n=fs.nextLong();
		long i,j,k;
		for(i=0;i<=(n/7)+1;i++){
			for(j=0;j<=(n/5)+1;j++){
				for(k=0;k<=(n/3)+1;k++){
					if(i*7+j*5+k*3==n){
						pw.println(k+" "+j+" "+i);
						return;
					}
				}
			}
		}
		pw.println(-1);

		
	}
	public static void main(String args[]){
		long t=1;
		t=fs.nextInt();
		for(long i=1;i<=t;i++){
			Solve(i);
		}
		pw.close();
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next(){
			while((!st.hasMoreTokens()) || (st==null)){
				try{
					st=new StringTokenizer(br.readLine());
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(next());
		}
		int[] readArray(int n){
			int[] a=new int[n];
			for(int i=0;i<n;i++)	a[i]=nextInt();
			return a;
		}
		long nextLong(){
			return Long.parseLong(next());
		}
		double nextDouble(){
			return Double.parseDouble(next());
		}
		String nextLine(){
			String str="";
			try{
				str=br.readLine();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
}