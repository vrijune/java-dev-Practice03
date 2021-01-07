package duckstats;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class imports the duck statistics from a file, prints the first 10 duck
 * statistics, and the first 10 duck statistics in descending order.
 *
 * @author Yu-Cheng Tu
 */
public class DuckCounterProcessor {

    /**
     * This is the main method, you may modify this method appropriately.
     */
    public static void main(String[] args) {
        DuckCounterProcessor dp = new DuckCounterProcessor();

        System.out.println("Processing Duck Data");
        System.out.println("----------------------");
        String currentDir = System.getProperty("user.dir");
        List<DuckCounter> duckData = dp.processFile(currentDir + "/ducks.csv");

        System.out.println();
        System.out.println("=================");
        System.out.println("First 10 Duck Stats");
        System.out.println("=================");
        dp.printFirstTenDuckCounts(duckData);
        System.out.println("=================");

        System.out.println("First 10 Duck Stats in Descending Order");
        System.out.println("=================");

        // step c.

        List<DuckCounter> firstTenDuckOrdering = new ArrayList<DuckCounter>();
        Number maxNum = Collections.max(duckData, new Comparator<DuckCounter>() {
                    @Override
                    public int compare(DuckCounter o1, DuckCounter o2) {

                        return Double.valueOf(o1.getDuckCount()).compareTo((double) o2.getDuckCount());

                        Collections.sort(DuckCounter,maxNum );
                        dp.printFirstTenDuckCounts(duckData);
                        System.out.println("=================");
                    }



                    // step b ii.
                    private void printFirstTenDuckCounts(List<DuckCounter> duckData) {

                        List<DuckCounter> FirstTenData = new ArrayList<>();

                        try {
                            for (int i = 0; i < 10; i++) {
                                FirstTenData.add(duckData.get(i));
                                Object date = duckData.getDate().toString();
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }


            // step b i.
            private List<DuckCounter> processFile(String filePath) {


                    List<DuckCounter> DuckCounter = new ArrayList<>();

                    try (BufferedReader reader = new BufferedReader(new FileReader(new File("/ducks.csv")))) {

                        String oneRecord = null;
                        String[] strArray = oneRecord.split(",");

                        for (int i = 0; i < DuckCounter.size(); i++) {

                            DuckCounter.add(new DuckCounter(String.getDate.toString(strArray[0]), Integer.parseInt(strArray[1]), Integer.parseInt(strArray[2])))
                        }


                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();


                    }


                    return DuckCounter;
                }


            }