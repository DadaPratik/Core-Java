package data_structure;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        //setDemo();
       // listDemo();
       // queueDemo();
        mapDemo();

    }
    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("apple");

        fruits.add("orange");
        fruits.add("banana");
        fruits.add("lemon");

       var i = fruits.iterator();
       while(i.hasNext()){
           System.out.println(i.next());
       }


//        System.out.println(fruits);
//        fruits.remove("lemon");
//        System.out.println(fruits);
//        System.out.println("Collection size is : " + fruits.size());
//        System.out.println("contains lemon? " + fruits.contains("lemon"));
//
//
//// this Set.of() makes immutable string i.e. we can not change
//        Set moreFruits = Set.of("pear","raisin","cherry");
//
//        System.out.println(moreFruits);



    }
    public static void listDemo(){
        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2,"grapes");
        fruits.add("lemon");
        fruits.remove("lemon");

//        for(String fruit : fruits ){
//            System.out.println(fruit);
//        }

//        fruits.forEach(f->System.out.println(f));
        fruits.forEach(
                f->{
                    f = "fruit: " + f;
                    System.out.println(f);
                }
        );
//        method reference shortHand for single method
//        fruits.forEach(System.out::println);
//        fruits.remove(3);
//        System.out.println("index 2: " + fruits.get(2));
//        System.out.println("index of grape: " + fruits.indexOf("grapes"));
//
//        System.out.println(fruits);
//// this will create immutable list and cont modify
//        List moreFruits = List.of("pear","raisin","cherry");
//        System.out.println(moreFruits);

    }
    public static void queueDemo(){
        Queue<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

       var removed = fruits.remove();
        System.out.println("removed item is: " + removed);
        System.out.println("head of queue " + fruits.peek());
        System.out.println(fruits);
    }

    public static void mapDemo(){
        Map<String,Integer> fruitsCalories = new HashMap();
        fruitsCalories.put("apple", 95);
        fruitsCalories.put("lemon", 80);
        fruitsCalories.put("banana", 70);
        fruitsCalories.put("orange", 60);
        fruitsCalories.putIfAbsent("lemon", 50);

        fruitsCalories.forEach((k,v)->{
            System.out.println(k + " => " + v);
        });

//        fruitsCalories.remove("lemon");
//        for(Map.Entry<String,Integer> entry : fruitsCalories.entrySet() ){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//
//        }



//        System.out.println(fruitsCalories);
//        System.out.println("banana calories : " + fruitsCalories.get("banana"));
//        System.out.println("contains orange? " + fruitsCalories.containsKey("orange"));
    }

}

