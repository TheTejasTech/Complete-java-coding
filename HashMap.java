import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(120, "India");
		mp.put(80, "USA");
		mp.put(140, "China");
		mp.put(20, "Russia");
		System.out.println(mp);

		if(mp.containsKey(120)) {
			System.out.println("India is present");
		} else {
			System.out.println("India is not present in the map");
		}

		mapToArray(mp);
	}

	public static void mapToArray(HashMap<Integer, String> mp) {
		int[] arr = new int[mp.size()];
		int i = 0;
		for( int key : mp.keySet()) {
			arr[i] = key;
			i++;
		}
		System.out.println("key as array from map is: "+ Arrays.toString(arr));
	}
}