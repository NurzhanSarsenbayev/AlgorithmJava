package org.example;
import java.util.*;

//Реализовать класс работающий по принципу HashMap. Включая внутренний массив узлов с индексацией по хешу и описание узла. Добавить в класс методы:
//        Object put(Integer key , Integer value) добавить элемент
//        Object get(Integer key) получить значение соответствующее ключу
//        Object remove(Integer key) удалить элемент с соответствующем ключём
//        Object replays(Integer key, Integer v) заменить значение
//        int size() количество элементов(???)
//        boolean containsKey(Integer key) проверка наличия ключа и значения
//        boolean containsValue(Integer v)
public class HashMapClass {
    public static void main(String[] args) {

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(4, 30);
        hashMap.put(3, 40);

        System.out.println(hashMap);
        System.out.println("second is " + hashMap.get(2));
        System.out.println("we remove second ");
        hashMap.remove(2);
        System.out.println("we replace first on with 11");
        hashMap.replace(1, 11);
        System.out.println("size of our hashMap now is " + hashMap.size());
        System.out.println("does first index contain key? " + hashMap.containsKey(1));
        System.out.println("does third index contain value? " +hashMap.containsValue(3));
        System.out.println(hashMap);
        // получим весь набор ключей
//        Set<Integer> keys = hashMap.keySet();
//        // получить набор всех значений
//        Collection<String> values = hashMap.values();
//        //заменить элемент
//        hashMap.replace(1, "Poland");
//        // удаление элемента по ключу 2
//        // перебор элементов
////        for(Map.Entry<Integer, String> item : hashMap.entrySet()){
////
////            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
////        }
////
//////        Map<String, Person> people = new HashMap<String, Person>();
//////        people.put("1240i54", new Person("Tom"));
//////        people.put("1564i55", new Person("Bill"));
//////        people.put("4540i56", new Person("Nick"));
//////
//////        for(Map.Entry<String, Person> item : people.entrySet()){
//////
//////            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
//        }
    }
}


