package max.proekt;

import java.util.Map;

public class IterationClassMap<K, V> {
    public String GetElementsMap(Map<K, V> mapCollect, TypeMapCollect typeMapCollect) {
        StringBuilder res = new StringBuilder();
        if(typeMapCollect == TypeMapCollect.value) {
            for (V value : mapCollect.values()) {
                res.append(String.format("<%s>\n", value.toString()));
            }
        }

        if(typeMapCollect == TypeMapCollect.key) {
            for (K key : mapCollect.keySet()) {
                res.append(String.format("<%s>\n", key.toString()));
            }
        }

        return res.toString();
    }
}

