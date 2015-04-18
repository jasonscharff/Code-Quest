import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob12 
{
    private static final String INPUT_FILE_NAME = "Prob12.in.txt";
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
                for (int j=0; j<N; j++) {
                    // read the line of text
                    inLine = br.readLine();
                    boolean[] data = new boolean[inLine.length()];
                    for (int i = 0; i < data.length; i++)
                    {
                    	data[i] = inLine.charAt(i) == '1';
                    		
                    }
                    int db = 0;
                    int I = 0;
                    for(int i = 1; db < inLine.length(); i *= 2)
                    {
                    	db += (i-1);
                    	I = i;
                    }
                    int pb = (int)(Math.log(I)/Math.log(2)) + 1;
                    int bits = pb + inLine.length();
                    boolean[] hamming = new boolean[bits];
                    int ptr = 0;
                    for (int i = 0; i < bits; i++)
                    {
                    	if ((int)(Math.log(i)/Math.log(2)) != (Math.log(i)/Math.log(2)))
                    	{
                    		hamming[i] = data[ptr];
                    		ptr += 1;
                    	}
                    }
                    for (int i = 0; i < pb; i++)
                    {
                    	
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
