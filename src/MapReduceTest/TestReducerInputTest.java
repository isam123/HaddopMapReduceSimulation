package MapReduceTest;

import Reducing.GroupByMain;
import Reducing.GroupPairList;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReducerInputTest {

    @Test
    public void TestReduceShuffled() throws IOException{

            boolean expected =true;
            GroupByMain.main(new String[]{});
            int i = 0,size=GroupPairList.getGroupPairList().size();

            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\wr473\\IdeaProjects\\Big-Data\\src\\AssignmentTestFiles\\ReducerInput.txt"));
            String nextline;
            while ((nextline = bf.readLine()) != null) {
                if (!GroupPairList.getGroupPairList().
                    get(i).toString().equalsIgnoreCase(nextline)) {
                    expected = false;
                    break;
                }
                i++;
                if(i>size) {expected =false;
                    System.out.println("");break;
                }
            }
            bf.close();
            Assert.assertTrue(expected);

    }
}
