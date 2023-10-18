package solution04;

import java.util.*;

public class Solution04Main {

	public static void main(String[] args) {

		// ArrayList Stores Null,Multiple null and duplicates also

		List<Integer> list = new ArrayList<>();

		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(3);
		list.add(3);
		System.out.println(list);

		// hashSet: One null value allowed, Duplicates not allowed
		Set<Integer> set = new HashSet<>();
		set.add(null);
		set.add(null);
		set.add(3);
		set.add(3);
		System.out.println(set);

		// hashSet: One null value allowed, Duplicates not allowed
		Set<Integer> set1 = new LinkedHashSet<>();

		set1.add(null);
		set1.add(null);
		set1.add(3);
		set1.add(3);
		System.out.println(set1);

		//TreeSet : Null value not allowed Null pointer exception,
		Set<Integer> set2 = new TreeSet<>();
//
//		set2.add(null);
//		set2.add(null);
		set2.add(3);
		set2.add(3);
		System.out.println(set2);

	}

}
