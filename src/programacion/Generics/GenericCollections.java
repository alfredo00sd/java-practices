package programacion.Generics;

import java.util.*;

public class GenericCollections {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Grapes");
        System.out.println("List");
        print(myList);

        Set<String> mySet = new HashSet<>();
        mySet.add("2000");
        mySet.add("3000");
        mySet.add("4000");
        System.out.println("Set");
        print(mySet);

        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Manzana");
        myMap.put(2,"Naranja");
        myMap.put(3,"Uvas");
        System.out.println("Map");
        print(myMap.keySet());
        print(myMap.values());
    }

    private static void print(Collection collection){

        for(Object element : collection){
            System.out.println(" El elemento es : " + element);
        }
        System.out.println(" ");
    }
}
