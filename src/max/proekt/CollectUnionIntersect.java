package max.proekt;

import java.util.*;

public class CollectUnionIntersect<T> {
    public List Unic(List<T> list1, List<T> list2) {

        List list = new ArrayList();

//        for (T t0 : list1) {
//            for (T t1 : list2) {
//                if(t0.equals(t1))
//                    break;
//            }
//        }

        List list0 = new ArrayList();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j)))
                    break;
                if (j == list2.size() - 1)
                    list0.add(list1.get(i));
            }
        }

        return list0;
    }


    public Collection<T> intersection(Collection<T> сol1, Collection<T> сol2) {
        Collection<T> collectRes = new ArrayList<>();
        Iterator<T> iter0 = сol1.iterator();

        while (iter0.hasNext()) {
            T cool0 = iter0.next();
            Iterator<T> iter1 = сol2.iterator();
            while (iter1.hasNext()) {
                T cool1 = iter1.next();
                if (cool0.equals(cool1)) {
                    collectRes.add(cool1);
                    break;
                }
            }
        }
        return collectRes;
    }
}