import java.util.*;

// hashmaps are always in key value pair and first one is always key
// key has to be unique and only one with specified data type
//value gets printed alongside each key
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

		// mapToArray(mp);
        // HashMap<String, Integer> map = new HashMap<>();


    //    //Insertion
    //    map.put("India", 120);
    //    map.put("US", 30);
    //    map.put("China", 150);


    //    System.out.println(map);


    //    map.put("China", 180);
    //    System.out.println(map);




    //    //Searching
    //    if(map.containsKey("Indonesia")) {
    //        System.out.println("key is present in the map");
    //    } else {
    //        System.out.println("key is not present in the map");
    //    }


    //    System.out.println(map.get("China")); //key exists
    //    System.out.println(map.get("Indonesia")); //key doesn't exist


    //    //Iteration (1)
    //    for( Map.Entry<String, Integer> e : map.entrySet()) {
    //        System.out.println(e.getKey());
    //        System.out.println(e.getValue());
    //    }


    //    //Iteration (2)
    //    Set<String> keys = map.keySet();
    //    for(String key : keys) {
    //        System.out.println(key+ " " + map.get(key));
    //    }

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