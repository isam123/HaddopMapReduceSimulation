package Reducing;

import Mapping.Pair;
import Mapping.PairList;
import Mapping.MapperMain;

import java.util.ArrayList;
import java.util.List;

public class GroupByMain {

    public static void main(String[] args) {
        MapperMain.main(new String[]{});
        // uncomment this line to test along with Shuffle
        setShuffle();
        System.out.println(getShuffledList().size());
        getShuffledList()
                .forEach((group) -> System.out.println(group) );
        getReducerOutPutList();
    }

    private static void getReducerOutPutList() {
    }

    private static void setShuffle() {
        for (Pair p: PairList.getPairs()) {
            findElement(p);
        }
    }

    private static List<GroupPair> getShuffledList() {
        return GroupPairList.getGroupPairList();
    }

    private static void findElement(Pair p) {
        List<Integer> val = new ArrayList<>();
        for (Pair pair: PairList.getPairs()) {
            if(p.getValue().equals(pair.getValue()))
            {
                val.add(1);
            }
        }
        createGroupPair(p,val);
        }

    private static void createGroupPair(Pair p, List<Integer> values) {
        if(!GroupPairList.getGroupPairList().contains(new GroupPair(p.getValue(),values)))
        GroupPairList.AddGroupPairList(new GroupPair(p.getValue(),values));
    }

}

