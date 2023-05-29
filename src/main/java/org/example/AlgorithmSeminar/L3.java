package org.example.AlgorithmSeminar;

public class L3 {

    public static void main(String[] args) {

        OneWayList<Integer> integerOneWayList = new OneWayList<>();
        integerOneWayList.add(55);
        integerOneWayList.add(26);
        integerOneWayList.add(13);
        integerOneWayList.add(122,2);
        integerOneWayList.add(98);
        integerOneWayList.revert();
        System.out.println(integerOneWayList);
//        integerOneWayList.addLast(156);
////        System.out.println(integerOneWayList.size());
////        System.out.println(integerOneWayList.get(integerOneWayList.size()-1 ));
////        System.out.println(integerOneWayList.contains(55));
//        System.out.println(integerOneWayList.indexOf(54));
//        TwoWayList<Integer> integerTwoWayList = new TwoWayList<>();

    }
}
