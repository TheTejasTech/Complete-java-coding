import java.util.*;

public class Main{
  public static void main(String[] args){
    System.out.println("Hello World!");

    int[] arr = {1,2,6,9,5,7,3,4};
    printArray(arr);
    arrayToMap(arr);
    arraysToList(arr);
  }

  public static void printArray(int[] arr){
    for(int i =0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void arrayToMap(int[] arr){
    Map<Integer, Integer> mp = new HashMap<>();
    for(int i = 0; i< arr.length; i++){
      mp.put(arr[i], 0);
    }
    System.out.println(mp);
  }
  
  public static void arraysToList(int[] arr){
    List<Integer> ll = new ArrayList<>();
    for(int i = 0; i< arr.length; i++){
        ll.add(arr[i]);
    }
    System.out.println(ll+" ");
  }
}
