import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob03 
{
    private static final String INPUT_FILE_NAME = "Prob03.in.txt";
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
                    inLine = br.readLine();
                    int year = Integer.parseInt(inLine);
                    
                    if(year >= 1582 && year % 4 == 0 || year % 100 == 0 && year % 400 != 0)
                    {
                    	if(i != (N-1))
                    		System.out.println("Yes");
                    	else
                    		System.out.print("Yes");
                    }
                    else
                    {
                    	if(i != N-1)
                    		System.out.println("No");
                    	else
                    		System.out.print("No");
                    }
                    // print it out
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
