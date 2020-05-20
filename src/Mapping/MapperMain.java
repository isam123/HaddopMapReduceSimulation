package Mapping;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MapperMain {


    public static void main(String[] args) {
        ReadFile();
//        UnComment If it going to be tested for Mapping
        List<Pair> sortedPairs = sortPair(PairList.getPairs());
//         sortedPairs.forEach((pair) -> System.out.println(pair));
    }

    public static List<Pair> sortPair(List<Pair> pairs) {
        Collections.sort(pairs, new PairComparator());
        return pairs;
    }

    private static void chekPattern(String currentWord) {
        if (!currentWord.matches("^(.*\\.txt.)") && Pattern.matches("([^0-9_/])*$", currentWord)) {
            if (currentWord.contains("-")) {
                String[] str = currentWord.split("-");
                for (String word :
                        str) {
                    trimNonAlpha(word);
                }

            } else {
                trimNonAlpha(currentWord);
            }
        }
    }

    private static void trimNonAlpha(String currentWord) {
        currentWord = currentWord.replaceAll("[^[a-zA-Z]-/]", "");
        createPair(currentWord.toLowerCase());
    }

    private static void createPair(String currentWord) {
        PairList.AddPair(new Pair(1, currentWord));
    }


    //    Reading File ans Assigning
    private static void ReadFile() {
        String currentWord = "";

        try {
            File testData = new File("C:\\Users\\wr473\\IdeaProjects\\Big-Data\\src\\File\\testDataForW1D1.txt");
            Scanner scanner = new Scanner(testData);
            while (scanner.hasNext()) {
                currentWord = scanner.next();
                chekPattern(currentWord);
            }
            scanner.close();
        } catch (Exception f) {
            System.out.println(f);
        }

    }


}