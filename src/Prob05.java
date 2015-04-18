import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Prob05 
{
	private static final String INPUT_FILE_NAME = "Prob05.in.txt";

	public static void main(String[] args) {
		try {
			// prepare to read the file
			File inFile = new File(INPUT_FILE_NAME);
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);
			String inLine = null;

			// get the number of test cases
			int T = Integer.parseInt(br.readLine());

			// loop through test cases
			while (T-- > 0) {
				// get the number of lines in each test case
				System.out.println(br.readLine() + ":");

				int N = Integer.parseInt(br.readLine());

				HashMap<Double, Integer> pc = new HashMap<Double, Integer>();
				ArrayList<Double> al = new ArrayList<Double>();

				// loop through the lines
				for (int i=0; i<N; i++) {
					// read the line of text
					inLine = br.readLine();

					pc.put(Double.parseDouble(inLine.substring(0, inLine.indexOf(" "))), Integer.parseInt(inLine.substring(inLine.indexOf(" ") + 1, inLine.length())));



					// print it out
				}

				for (int b=0; b<N; b++) {
					Object[] keys = (pc.keySet()).toArray();

					al.add((Double)keys[b]);
				}
				
				Collections.sort(al);

				
				for(int k = 0; k < al.size(); k++)
				{
					int year = pc.get(al.get(k));
					System.out.print(year + " ");
					int numStars = (int) (Math.round(al.get(k)/1000));
					for(int a = 0; a < numStars; a++)
					{
						System.out.print("*");
					}
					if(k != al.size() - 1)
					{
						System.out.println();
					}
					
				}
			}


			// clean up
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
