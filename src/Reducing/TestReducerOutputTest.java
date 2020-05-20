package Reducing;

import com.sun.jdi.ByteType;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestReducerOutputTest {

    @Test
    public void TestReducerData() throws IOException {
        boolean expected =true;
        int i = 0;
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\wr473\\IdeaProjects\\Big-Data\\src\\AssignmentTestFiles\\ReduceOutput.txt"));
        String nextline;
        GroupPairList.SummedPairList();
        int sizeActual = GroupPairList.getSummedPairList().size();
        while ((nextline = bf.readLine()) != null) {
//
            if (!GroupPairList.getSummedPairList().
                    get(i).toString().equalsIgnoreCase(nextline)) {
                expected = false;
                System.out.println(GroupPairList.getSummedPairList().
                        get(i).toString());
                break;
            }
            i++;
        }
      bf.close();

        Assert.assertTrue(expected);

    }

}
