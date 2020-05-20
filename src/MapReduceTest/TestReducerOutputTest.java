package MapReduceTest;

import Reducing.GroupByMain;
import Reducing.GroupPairList;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReducerOutputTest {

    @Test
    public void TestReducerData() throws IOException {
        boolean expected =true;
        GroupByMain.main(new String[]{});
        GroupPairList.SummedPairList();
        int i = 0,size = GroupPairList.getSummedPairList().size();
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\wr473\\IdeaProjects\\Big-Data\\src\\AssignmentTestFiles\\ReduceOutput.txt"));
        String nextline;
        while ((nextline = bf.readLine()) != null) {
            if (!GroupPairList.getSummedPairList().
                    get(i).toString().equalsIgnoreCase(nextline)) {
                expected = false;
                break;
            }
            i++;
            if(i>size) {expected =false;break;};
        }
      bf.close();

        Assert.assertTrue(expected);

    }

}
