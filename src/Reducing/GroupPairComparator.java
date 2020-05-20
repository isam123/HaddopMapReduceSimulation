package Reducing;

import java.util.Comparator;

public class GroupPairComparator implements Comparator<GroupPair> {

    @Override
    public int compare(GroupPair g1, GroupPair g2) {
        return g1.getKey().compareTo(g2.getKey());
    }
}
