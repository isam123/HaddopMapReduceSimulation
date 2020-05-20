package Mapping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Wrapper class that has list of Mapping.Pair values
 *
 */

public class PairList {

    static List<Pair> pairs =new ArrayList<>();

    public static void AddPair(Pair pair) {
        pairs.add(pair);
    }

    public static List<Pair> getPairs() {
        return pairs;
    }
}
