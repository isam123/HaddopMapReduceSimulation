package Reducing;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static List<GroupPair> getSummedPairList()
    {
        return sumGroupPairList;
    }

    public static void SummedPairList() {

        for(GroupPair gp :groupPairList) {
         int value= adder(gp.getValue());
         sumGroupPairList.add(new GroupPair(gp.key, Arrays.asList(value)));
        }
    }

    private static int adder(List<Integer> values) {
        int sum=0;
        for(int i:values) {
            sum+=1;
        }
        return sum;
    }


}
