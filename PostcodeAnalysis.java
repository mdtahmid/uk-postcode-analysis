import java.util.*;
import java.io.*;

public class PostcodeAnalysis {
	static ArrayList<String> postcodes = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		
		int wordsInDictionary = 0;

		Scanner scan = new Scanner(new File("postcodes.csv")); 
		while(scan.hasNext()) { 
			postcodes.add(scan.next()); 
			wordsInDictionary++;
		}

		System.out.println("Total postcodes: " + wordsInDictionary/2);

		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();

		for (int i = 0; i < 36; i++) {
			System.out.println(alphabet[i] + ": " + (OccurencesOfCharacter(alphabet[i]))/2);
		}
	}

	public static int OccurencesOfCharacter(char givenCharacter) {
        int count = 0;

        for(String s: postcodes) {
            if(s.charAt(s.length()-1)==givenCharacter)
                count++;
        }

        return count;
    }
}