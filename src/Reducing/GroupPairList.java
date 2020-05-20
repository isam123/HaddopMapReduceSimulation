package Reducing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupPairList {

    static List<GroupPair> groupPairList = new ArrayList<>();
    static List<GroupPair> sumGroupPairList = new ArrayList<>();


    public static List<GroupPair> getGroupPairList() {
        Collections.sort(groupPairList , new GroupPairComparator());
        return groupPairList;
    }

    public static void AddGroupPairList(GroupPair groupPair) {
        groupPairList.add(groupPair);
    }

    public static List<GroupPair> getSummedPairList() {
        return sumGroupPairList;
    }
    public static void SummedPairList() {

    }



}
