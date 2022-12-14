import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,Integer> map = new HashMap<>();
		
//	map.put("abc", 1);
		
		System.out.println("1 " + map.put("abc", 1));
		System.out.println("1 " + map.put("abc", 1));
		System.out.println("1 " + map.put("cbc", 1));
		
		
		Set<String> set = new HashSet<>();
		set.add("abc");
		

		
	}

}
