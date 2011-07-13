package s29;
import java.util.*;
public class C_MailStamps {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<Integer,List<Integer>>map=new HashMap<Integer,List<Integer>>();
		int n=s.nextInt();
		for(int i=0;i<n;++i){
			int x=s.nextInt(),y=s.nextInt();
			if(!map.containsKey(x)){
				map.put(x, new ArrayList<Integer>());
			}
			map.get(x).add(y);
			if(!map.containsKey(y)){
				map.put(y, new ArrayList<Integer>());
			}
			map.get(y).add(x);
		}
		int e=0;
		Set<Integer>list=new HashSet<Integer>();
		for(int key : map.keySet()){
			if(map.get(key).size()==1){
				list.add(e=key);
				break;
			}
		}
		System.out.print(e);
		for(;list.size()<n+1;){
			for(int i:map.get(e)){
				if(!list.contains(i)){
					list.add(e=i);
					System.out.print(" "+e);
					break;
				}
			}
		}
		System.out.println();
	}
}
