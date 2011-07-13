package s43;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> sizes = Arrays.asList("S","M","L","XL","XXL");
		int[]nums = new int[5];
		for(int i = 0; i < 5; ++i){
			nums[i]=s.nextInt();
		}
		for(int k = s.nextInt();k-->0;){
			int index = sizes.indexOf(s.next());
			for(int d = 0; d < 5; ++d){
				if(index+d < 5 && nums[index+d]>0){
					--nums[index+=d];
					break;
				}else if(index - d >= 0 && nums[index-d]>0){
					--nums[index-=d];
					break;
				}
			}
			System.out.println(sizes.get(index));
		}
	}
}
