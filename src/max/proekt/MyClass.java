package max.proekt;

import java.util.*;

public class MyClass {

    public static void main(String[] args) {
//        // es ist das Logik für List
        List<Integer> lst0 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 9, 10));
        CollectUnionIntersect<Integer> iiii = new CollectUnionIntersect<>();
        System.out.println(iiii.intersection(lst0, lst1));
        System.out.println("END LIST Intersect \n");
//
//
//        // es ist das Logik für Set
        Set<Integer> resHashSet0 = new HashSet<>();
        Set<Integer> resHashSet1 = new HashSet<>();
        resHashSet0.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        resHashSet1.addAll(Arrays.asList(1, 3, 4, 5, 9, 11));
        CollectUnionIntersect<Integer> iiii0 = new CollectUnionIntersect<>();
        System.out.println(iiii0.intersection(resHashSet0, resHashSet1));
        System.out.println("END SET Intersect \n");

        //        // es ist das Logik für List
        List<Integer> lst123 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> st0 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Map<Integer, String> mp1 = new HashMap<>();
        mp1.put(0, "vasiya");
        mp1.put(1,"petya");
        mp1.put(2,"koliya");
        mp1.put(3,"mark");
        mp1.put(4,"ivan");


        IterationClassListSet<Integer> listSet = new IterationClassListSet<>();
        System.out.println(listSet.GetElementslistSet(lst123.iterator(),TypeCollectListSet.list.set));
        System.out.println("END Iteration ClassListSet \n");

        IterationClassMap<Integer, String> map = new IterationClassMap<>();
        System.out.println(map.GetElementsMap(mp1,TypeMapCollect.key));
        System.out.println("END Iteration ClassMap \n");

    }


}
