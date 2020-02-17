package max.proekt;

import java.util.Iterator;

public class IterationClassListSet<E> {

    public String GetElementslistSet(Iterator<E> iterator, TypeCollectListSet elType) {
        int num = -1;
        StringBuilder res = new StringBuilder();

        while (iterator.hasNext()) {
            num++;
            E element = iterator.next();
            if (elType == TypeCollectListSet.list) {
                res.append(String.format("<%d>:<%s>\n", num, element));
            }
            if (elType == TypeCollectListSet.set) {
                res.append(String.format("<%d>\n", element));
            }
        }
        return res.toString();
    }


}


