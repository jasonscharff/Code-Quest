

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Prob09 {
    private static final String INPUT_FILE_NAME = "Prob09.in.txt";
    
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
                char[][] arr = new char[N][];
                // loop through the lines
                int maxLength = 0;
                for (int i=0; i<N; i++) {
                    arr[i] = br.readLine().toCharArray();
                    if (arr[i].length > maxLength)
                    	maxLength = arr[i].length;
                }
                String how = br.readLine();
                
                if (how.equals("X"))
                {
                	for (int r = arr.length-1; r >= 0; r--)
                	{
                		System.out.println(arr[r]);
                	}
                }
                
                if (how.equals("Y"))
                {
                	for (int r = 0; r < arr.length; r++)
                	{
                		for (int c = arr[r].length -1; c >= 0; c--)
                		{
                			System.out.print(arr[r][c]);
                		}
                		System.out.println();
                	}
                }
                
                if (how.equals("INVERSE"))
                {

                    
                    for (int i = 0; i < N; i++)
                    {
                    	char[] tmp = new char[maxLength];
                    	for (int j = 0; j < arr[i].length; j++)
                    		tmp[j] = arr[i][j];
                    	for (int j = arr[i].length; j < tmp.length; j++)
                    		tmp[j] = ' ';
                    	arr[i] = tmp;
                    }
                	for (int r = 0; r < maxLength; r++)
                	{
                		for (int c = 0; c < arr.length; c++)
                		{
                			System.out.print(arr[c][r]);
                		}
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
