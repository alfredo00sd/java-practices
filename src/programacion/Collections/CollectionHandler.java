package programacion.Collections;

import java.util.*;

public class CollectionHandler {

    public static void main(String[] args) {

        //Collection has Lists, Sets, and maps

        //create the list
        //List es una interface  que implementa Arraylist
        //Es tipo object by default
        List<Object> myList = new ArrayList<>();
        //Add items to the list
        myList.add("Alfredo");
        myList.add("Carlo");
        myList.add("Martin");
        myList.add("Martin");
        System.out.println("---------------------List-----------------");
        print(myList);

        //Estructura de datos, no permite objetos duplicados
        Set<Object> mySet = new HashSet<>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");
        mySet.add("1");
        System.out.println("---------------------Set-----------------");
        print(mySet);

        //El mapa es una estructura de datos guidado por el concepto Llave, valor
        //que almacena datos de forma ordenada similar a una tabla de BD.
        Map<Object, Object> myMap = new HashMap<>();
        myMap.put("1","Jaua");
        myMap.put("2","Carso");
        myMap.put("3","Acosta");
        myMap.put("4","Esmeralda");

        System.out.println("---------------------Map-----------------");
        //No se puede imprimir el mapa, pero si un set de las llaves de este...
        print(myMap.keySet());
        //Para ver los valores es necesario el uso de .. regresa una lista con los valores del mapa
        print(myMap.values());

    }

    //Recibe un collection, porque es la que porque es el api principal y puede recibir y procesar las estructuras
    //usadas previamente.
    private static void print(Collection<Object> collection){
        for (Object element : collection){
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

}
