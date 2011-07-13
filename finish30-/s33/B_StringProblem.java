package s33;
import java.io.*;
import java.util.*;

public class B_StringProblem {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine(),b=br.readLine();
		if(a.length()!=b.length()){
			System.out.println(-1);
			return;
		}
		long[][]adj=new long[27][27];
		for(long[] ad:adj){
			Arrays.fill(ad, Integer.MAX_VALUE);
		}
		for(int i=0;i<27;++i){
			adj[i][i]=0;
		}
		for(int t=new Integer(br.readLine());t-->0;){
			String[]sp=br.readLine().split(" ");
			int i=sp[0].charAt(0)-'a',j=sp[1].charAt(0)-'a';
			adj[i][j]=Math.min(adj[i][j],new Integer(sp[2]));
		}		
		for(int t=0;t<27;++t){
			for(int i=0;i<27;++i){
				for(int j=0;j<27;++j){
					long len=adj[i][t]+adj[t][j];
					if(len<adj[i][j]){
						adj[i][j]=len;
					}
				}
			}
		}
		int sum=0;
		StringBuffer result=new StringBuffer();
		for(int i=0;i<a.length();++i){
			char ac=a.charAt(i),bc=b.charAt(i);
			int ai=ac-'a',bi=bc-'a';
			long c=Integer.MAX_VALUE;
			int tmp=0;
			for(int j=0;j<27;++j){
				long cost = adj[ai][j]+adj[bi][j];
				if(c>cost){
					c=cost;
					tmp=j;
				}
			}
			if(c==Integer.MAX_VALUE){
				System.out.println(-1);
				return;
			}
			sum+=c;
			result.append((char)(tmp+'a'));
		}
		System.out.println(sum);
		System.out.println(result);
	}
}
