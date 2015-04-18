

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob08 {
	private static final String INPUT_FILE_NAME = "Prob08.in.txt";
	


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
				int N = Integer.parseInt(br.readLine());

				// loop through the lines
				for (int i=0; i<N; i++) {
					// read the line of text


					String planeName = br.readLine();
					
					String coordinatePair = br.readLine();
					int indexComma = coordinatePair.indexOf(",");
					double planeX = Double.parseDouble(coordinatePair.substring(0, indexComma));
					double planeY = Double.parseDouble(coordinatePair.substring(indexComma + 1));
					
					coordinatePair = br.readLine();
					indexComma = coordinatePair.indexOf(",");
					double startX = Double.parseDouble(coordinatePair.substring(0, indexComma));
					double startY = Double.parseDouble(coordinatePair.substring(indexComma + 1));
					
					coordinatePair = br.readLine();
					indexComma = coordinatePair.indexOf(",");
					double endX = Double.parseDouble(coordinatePair.substring(0, indexComma));
					double endY = Double.parseDouble(coordinatePair.substring(indexComma + 1));
					
					double slopeToFirst = (planeY - endY) / (planeX - startX);
					double slopeToLast = (planeY - endY) / (planeX - endX);
					if(slopeToFirst <= -0.8 && slopeToFirst >= -1.6 && slopeToLast <= -0.8 && slopeToLast 
							>= -1.6)
					{
						System.out.println(planeName + ", Clear To Land!");

					}
					else
					{
						System.out.println(planeName + ", Abort Landing!");
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
