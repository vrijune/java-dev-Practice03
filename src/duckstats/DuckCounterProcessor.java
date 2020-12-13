package duckstats;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class imports the duck statistics from a file, prints the first 10 duck
 * statistics, and the first 10 duck statistics in descending order.
 * 
 * @author Yu-Cheng Tu
 *
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
		dp.printFirstTenDuckCounts(duckData);
		System.out.println("=================");
	}

	// step b ii.
	private void printFirstTenDuckCounts(List<DuckCounter> duckData) {
		
	}

	// step b i.
	private List<DuckCounter> processFile(String filePath) {
		return null;
	}

}
