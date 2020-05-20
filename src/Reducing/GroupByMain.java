package Reducing;

import Mapping.Pair;
import Mapping.PairList;
import Mapping.MapperMain;

import java.util.ArrayList;
import java.util.List;

public class GroupByMain {

    public static void main(String[] args) {
        MapperMain.main(new String[]{});
        // uncomment this line to test along with Group and Sort
        setShuffle(); // Group and Sort the key-value mapped
        getShuffledList();//
//        getReducerOutPutList();
    }

    private static void getReducerOutPutList() {
        GroupPairList.SummedPairList();
        GroupPairList
        .getSummedPairList()
        .forEach((sumpair)-> System.out.println(sumpair));
    }
    private static void setShuffle() {
        for (Pair p: PairList.getPairs()) {
            findElement(p);
        }
    }
    private static void getShuffledList()
    {
         GroupPairList
                 .getGroupPairList()
                 .forEach((group) ->
                System.out.println(group));
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

