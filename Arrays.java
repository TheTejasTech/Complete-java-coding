import java.util.*;

public class Arrays{
  public static void main(String[] args){
    System.out.println("Hello World!");
  }

  public static void printArray(int[] arr){
    for(int i =0; i < arr.length; i++){
      System.out.print(arr[i] + " ")
    }
    System.out.print();
  }

  public static void arrayToMap(int[] arr){
    Map<Integer> mp = new HashMap();
    for(int i = 0; i< arr.length; i++){
      mp[i] = arr[i];
    }
  }
}
