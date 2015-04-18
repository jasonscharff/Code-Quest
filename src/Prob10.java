

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob10 {
    private static final String INPUT_FILE_NAME = "Prob10.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            int[] scores = {0, 0};
            
            boolean done = false;
            
            while ((inLine = br.readLine()) != null)
            {
            	if (done)
            	{
            		System.out.println();
            	}
            	done = true;
            	if (scores[0] == 0 && scores[1] == 0)
            	{
            		System.out.println("Game start");
            	}
            	int p = Integer.parseInt(inLine);
            	scores[p-1] += 1;
            	String ret = parseScore(scores[0], scores[1]);
            	System.out.print(ret);
            	if (ret.contains("Game"))
            	{
            		scores[0] = 0;
            		scores[1] = 0;
            	}
            	
            }
            
            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String parseScore(int p1, int p2)
    {
    	String n1 = "";
    	String n2 = "";
    	if ((p1 >= 3 && p2 >= 3 && p1 == p2))
    	{
    		return "deuce";
    	}
    	if ((p1 >= 3 && p2 >= 3 && p1-p2 == 1))
    	{
    		return "Advantage Player 1";
    	}
    	if ((p1 >= 3 && p2 >= 3 && (p2-p1 == 1)))
    	{
    		return "Advantage Player 2";
    	}
    	if ((p1 > 3 && p2 < 3) || (p1 > 3 && p2 > 3 && p1-p2 == 2))
    	{
    		return "Game Player 1";
    	}
    	if ((p2 > 3 && p1 < 3) || (p1 > 3 && p2 > 3 && p2-p1 == 2))
    	{
    		return "Game Player 2";
    	}
    	if (p1 == 0)
    		n2 = "love";
    	if (p1 == 1)
    		n2 = "15";
    	if (p1 == 2)
    		n2 = "30";
    	if (p1 == 3)
    		n2 = "40";
    	if (p2 == 0)
    		n1 = "love";
    	if (p2 == 1)
    		n1 = "15";
    	if (p2 == 2)
    		n1 = "30";
    	if (p2 == 3)
    		n1 = "40";
    	if (n2.equals(n1))
    		return n2 + "-all";
    	return n2 + "-" + n1;
    	
    }
}
