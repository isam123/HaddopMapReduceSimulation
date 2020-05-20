package MapReduceTest;

import Mapping.MapperMain;
import Mapping.Pair;
import Mapping.PairList;
import Reducing.GroupByMain;
import Reducing.GroupPairList;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TestMapper {


    @Test
    public void CheckMapper() throws IOException {

        MapperMain.main(new String[]{});
        boolean expected = true;
        List<Pair> pairs = MapperMain.sortPair(PairList.getPairs());
        int i = 0, size = PairList.getPairs().size();
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\wr473\\IdeaProjects\\Big-Data\\src\\AssignmentTestFiles\\MapperOutput.txt"));
        String nextline;

        while ((nextline = bf.readLine()) != null) {
            System.out.println(nextline);
            if (!pairs.
                    get(i).toString().equalsIgnoreCase(nextline)) {
                expected = false;
                break;
            }
            i++;
            if (i > size) {
                expected = false;
                System.out.println("problem");
                break;
            }

        }
        Assert.assertTrue("Files are not Equal", expected);

    }
}
