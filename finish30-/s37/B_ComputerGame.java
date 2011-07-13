package s37;
import java.io.*	;
import java.util.*;


public class B_ComputerGame {
	// copy
	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = s.nextInt(), max = s.nextInt(), reg = s.nextInt();// 1-1000
		int[][] scrolls = new int[n][3];
		for (int i = 0; i < n; ++i) {
			int pow = s.nextInt(), dmg = s.nextInt(); // 0-100, 1-2000
			scrolls[i][0]=i;
			scrolls[i][1]=pow;
			scrolls[i][2]=dmg;
		}
		int hp = max;
		int dmg = 0;
		boolean[] used = new boolean[n];
		List<int[]> history = new ArrayList<int[]>();
		String result="NO";
		int t = 0;
		for(; t < 10001; ++t){
			hp -= dmg;
			hp = Math.min(max, hp + reg);
			if(hp <= 0){
				result = "YES";
				break;
			}
			int[] selectScroll = {-1,-1,-1};
			for(int[] scroll : scrolls){
				if(!used[scroll[0]] && selectScroll[2] < scroll[2] && scroll[1] * max >= hp * 100){
					selectScroll = scroll;
				}
			}
			if(selectScroll[0] >= 0){
				used[selectScroll[0]]=true;
				history.add(new int[]{t, selectScroll[0]+1});
				dmg += selectScroll[2];
			}
		}
		pw.println(result);
		if(result.equals("YES")){
			pw.println(t+" "+history.size());
			for(int[] is : history){
				pw.println(is[0] +" " + is[1]);
			}
		}
		pw.close();
	}
}
