package s11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class D {
	static int kn, LAB, count;
	static boolean[][] adj;
	static boolean[] vistd;
	static int[] low,lab,make;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		kn = scan.nextInt();
		adj=new boolean[kn+1][kn+1];
		vistd=new boolean[kn+1];
		low=new int[kn+1];
		lab=new int[kn+1];
		make=new int[kn+1];
		LAB=count=0;
		for(int m=scan.nextInt();m>0;m--){
			int r=scan.nextInt();
			int c=scan.nextInt();
			adj[r][c]=adj[c][r]=true;
		}
		for(int i=1;i<=kn;i++){
			if(!vistd[i]){
				vistd[i]=true;
				f(-1,i);
			}
		}
		System.out.println(count);
	}
	static void f(int p,int v){
		low[v]=lab[v]=++LAB;
		LinkedList<List<Integer>> stack=new LinkedList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for(int j=1;j<=kn;j++){
			if(adj[v][j]){
				list.add(j);
			}
		}
		for(int u:list){
			if(p!=u&&lab[v]>lab[u]){
				stack.push(Arrays.asList(v, u));
			}
			if(!vistd[u]){
				vistd[u]=true;
				f(v,u);
				low[v]=Math.min(low[v], low[u]);
				if(low[u]>=lab[v]){
					List<Integer> s;
					do{
						for(int e:(s=stack.pop())){
							make[e]=CNT;
						}
					}while(!s.containsAll(Arrays.asList(v,u)));
					cl=new int[kn+1];
					if(!isok(u,1)){
						count++;
					}
					++CNT;
				}
			}else if(p!=u){
				low[v]=Math.min(low[v], lab[u]);
			}
		}
	}
	static int[] cl;
	static int CNT=0;
	private static boolean isok(int v, int i) {
		cl[v]=i;
		List<Integer> list = new ArrayList<Integer>();
		for(int j=1;j<=kn;j++){
			if(adj[v][j]){
				list.add(j);
			}
		}
		for(int j:list){
			if(make[j]!=CNT)continue;
			if(cl[j]==0){
				if(!isok(j,i==1?0:1)){
					return false;
				}
			}else if(cl[j]==i){
				return false;
			}
		}
		return true;
	}
}
