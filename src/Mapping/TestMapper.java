package Mapping;

import org.junit.Assert;

public class TestMapper {


  public void CheckMapper() {
        String actual ="[< a , 1 >\n" +
                "< a , 1 >\n" +
                "< a , 1 >\n" +
                "< a , 1 >\n" +
                "< and , 1 >\n" +
                "< and , 1 >\n" +
                "< and , 1 >\n" +
                "< and , 1 >\n" +
                "< are , 1 >\n" +
                "< as , 1 >\n" +
                "< as , 1 >\n" +
                "< cat , 1 >\n" +
                "< cat , 1 >\n" +
                "< class , 1 >\n" +
                "< collections , 1 >\n" +
                "< comparator , 1 >\n" +
                "< each , 1 >\n" +
                "< each , 1 >\n" +
                "< extract , 1 >\n" +
                "< file , 1 >\n" +
                "< for , 1 >\n" +
                "< form , 1 >\n" +
                "< given , 1 >\n" +
                "< however , 1 >\n" +
                "< inserted , 1 >\n" +
                "< integer , 1 >\n" +
                "< into , 1 >\n" +
                "< involve , 1 >\n" +
                "< is , 1 >\n" +
                "< is , 1 >\n" +
                "< is , 1 >\n" +
                "< is , 1 >\n" +
                "< key , 1 >\n" +
                "< key , 1 >\n" +
                "< key , 1 >\n" +
                "< list , 1 >\n" +
                "< list , 1 >\n" +
                "< list , 1 >\n" +
                "< may , 1 >\n" +
                "< not , 1 >\n" +
                "< note , 1 >\n" +
                "< note , 1 >\n" +
                "< one , 1 >\n" +
                "< output , 1 >\n" +
                "< pair , 1 >\n" +
                "< pair , 1 >\n" +
                "< pair , 1 >\n" +
                "< program , 1 >\n" +
                "< program , 1 >\n" +
                "< same , 1 >\n" +
                "< should , 1 >\n" +
                "< sort , 1 >\n" +
                "< such , 1 >\n" +
                "< text , 1 >\n" +
                "< that , 1 >\n" +
                "< that , 1 >\n" +
                "< the , 1 >\n" +
                "< the , 1 >\n" +
                "< the , 1 >\n" +
                "< the , 1 >\n" +
                "< the , 1 >\n" +
                "< the , 1 >\n" +
                "< the , 1 >\n" +
                "< this , 1 >\n" +
                "< tokens , 1 >\n" +
                "< treat , 1 >\n" +
                "< two , 1 >\n" +
                "< using , 1 >\n" +
                "< value , 1 >\n" +
                "< value , 1 >\n" +
                "< value , 1 >\n" +
                "< where , 1 >\n" +
                "< will , 1 >\n" +
                "< word , 1 >\n" +
                "< word , 1 >\n" +
                "< word , 1 >\n" +
                "< words , 1 >\n" +
                "< words , 1 >\n" +
                "< writing , 1 >\n" +
                "< your , 1 >]";
        MapperMain.main(new String[]{});
        Assert.assertEquals(MapperMain.sortPair(PairList.getPairs()),actual);
    }


}
