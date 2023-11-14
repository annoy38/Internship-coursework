import java.util.*;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(15);
//        list.add(22);
//        list.add(25);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        list.add(0, 5);
//        System.out.println(list);
//        Iterator il = list.descendingIterator();
//        while (il.hasNext()){
//            System.out.print(il.next()+" ");
//        }
//        System.out.println();
//        System.out.println(list.contains(25));
//        System.out.println(list.get(4));
//        System.out.println(list.size());
//        System.out.println(list.getFirst());

//        HashSet<Integer> set = new HashSet<>();
//        set.add(2);
//        set.add(5);
//        set.add(6);
//        set.add(8);
//        System.out.println(set);
//        set.add(3);
//        set.add(5);
//        System.out.println("New Set "+set);
//        System.out.println(set.contains(6));
//        System.out.println(set.size());


//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "Sataru Gojo");
//        map.put(2, "Saguru Geto");
//        map.put(3, "Nanami");
//        map.put(4, "Sukuna");
//        map.put(5, "Yuji Itadori");
//        map.put(6, "Megumi Fushiguru");
//        map.put(7, "Nobara");
//        map.put(8, "Mei Mei");
//        map.put(9, "Mohito");
//        map.put(10, "Kenjako");
//
//        for(Map.Entry m: map.entrySet()){
//            System.out.println(m.getKey()+": "+m.getValue());
//        }

        ArrayList<Integer> array = new ArrayList<>();
        array.add(56);
        array.add(21);
        array.add(35);
        array.add(20);
        array.add(16);
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array, Collections.reverseOrder());
        System.out.println(array);
    }
}