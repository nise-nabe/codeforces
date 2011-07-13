package s33;
import java.util.*;

public class D_Knights {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),k=s.nextInt();
        int[][]loc=new int[n][2];
        for(int i=0;i<n;++i){
            loc[i][0]=s.nextInt();
            loc[i][1]=s.nextInt();
        }
        boolean[][]in=new boolean[n][m];
        for(int i=0;i<m;++i){
        	int r=s.nextInt(),cx=s.nextInt(),cy=s.nextInt();
        	for(int j=0;j<n;++j){
        		if(Math.pow(r,2)>Math.pow(loc[j][0]-cx,2)+Math.pow(loc[j][1]-cy,2)){
        			in[j][i]=true;
        		}
        	}
        }

        for(;k-->0;){
            int a=s.nextInt()-1,b=s.nextInt()-1;
            int sum=0;
            for(int i=0;i<m;++i){
            	sum+=in[a][i]^in[b][i]?1:0;
            }
            System.out.println(sum);
        }
    }
}
