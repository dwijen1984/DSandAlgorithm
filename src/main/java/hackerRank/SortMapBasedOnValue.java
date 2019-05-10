package hackerRank;

import org.junit.Test;

import java.util.*;

public class SortMapBasedOnValue {
    @Test
    public void testSortMap(){
        countWordOccurance("AAAABBBCCDDDDDD");
    }
    public void countWordOccurance(String input){
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        for(Character c: input.toCharArray()){
            int count =0;
            count = countMap.getOrDefault(c, 0)+1;
            countMap.put(c, count);
        }
        compareMapValue c = new compareMapValue(countMap);
        TreeMap<Character, Integer> t = new TreeMap<>(c);
        t.putAll(countMap);
        for(Character charector : t.keySet()){
            System.out.println(charector+ " : " +t.get(charector));
        }
        List<Integer> l = new ArrayList<>();

    }

    public class compareMapValue implements Comparator<Character>
    {
        Map<Character, Integer> countMap;
        public compareMapValue(Map<Character, Integer> countMap) {
            this.countMap = countMap;
        }

        @Override
        public int compare(Character o1, Character o2) {
            if(countMap.get(o1) > countMap.get(o2)){
                return -1;
            }else if(countMap.get(o1) < countMap.get(o2)){
                return 1;
            }else {
                return 0;
            }
        }
    }

    public static void swap(Integer i, Integer j)
    {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }
    public static void main(String[] args)
    {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }

    /*
    public static void main (String[] args) {
		countWordOccurance("AAAABBBCCDDDDDD");
	}

  public void countWordOccurance(String input){


  }
     */

}
