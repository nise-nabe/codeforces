package s19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class A_WorldFootballCup {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = new Integer(scan.nextLine());
		List<String> names = new ArrayList<String>();
		Map<String, Integer> r1 = new HashMap<String, Integer>();
		Map<String, Integer> r2 = new HashMap<String, Integer>();
		Map<String, Integer> r3 = new HashMap<String, Integer>();
		for (int i = 0; i < n; ++i) {
			String s = scan.next();
			names.add(s);
			r1.put(s, 0);
			r2.put(s, 0);
			r3.put(s, 0);
		}
		for (int i = n * (n - 1) / 2; i-- > 0;) {
			String[] s = scan.next().split("-");
			String[] t = scan.next().split(":");
			int t0 = new Integer(t[0]);
			int t1 = new Integer(t[1]);
			r1.put(s[0], r1.get(s[0])+(t0>t1?3:t0==t1?1:0));
			r1.put(s[1], r1.get(s[1])+(t1>t0?3:t0==t1?1:0));
			r2.put(s[0], r2.get(s[0])+t0-t1);
			r2.put(s[1], r2.get(s[1])+t1-t0);
			r3.put(s[0], r3.get(s[0])+t0);
			r3.put(s[1], r3.get(s[1])+t1);
		}

		Set<String>result = new TreeSet<String>();
		
		Map<Integer, List<String>> vics = new TreeMap<Integer, List<String>>(Collections.reverseOrder());
		for(String name : names){
			int i = r1.get(name);
			if(!vics.containsKey(i)){
				vics.put(i, new ArrayList<String>());
			}
			vics.get(i).add(name);
		}

		l:for(int i : vics.keySet()){
			List<String> list = vics.get(i);
			if(result.size() + list.size() <= n/2){
				result.addAll(list);
			}else{
				Map<Integer, List<String>> subs = new TreeMap<Integer, List<String>>(Collections.reverseOrder());
				for(String name : list){
					int j = r2.get(name);
					if(!subs.containsKey(j)){
						subs.put(j, new ArrayList<String>());
					}
					subs.get(j).add(name);
				}
				for(int j : subs.keySet()){
					List<String> list2 = subs.get(j);
					if(result.size() + list2.size() <= n/2){
						result.addAll(list2);
					}else{
						Map<Integer, List<String>> sums = new TreeMap<Integer, List<String>>(Collections.reverseOrder());
						for(String name : list2){
							int k = r3.get(name);
							if(!sums.containsKey(i)){
								sums.put(k, new ArrayList<String>());
							}
							sums.get(k).add(name);
						}
						while(result.size() < n/2){
							List<String> list3 = sums.get(new ArrayList<Integer>(sums.keySet()).get(0));
							result.addAll(list3.subList(0, Math.min(list3.size(), n/2-result.size())));
						}
						break l;
					}
				}
				break l;
			}
		}
		
		for(String name : result){
			System.out.println(name);
		}
	}
}
