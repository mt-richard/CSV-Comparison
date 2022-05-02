//NAMES: MBANZA TUYISHIME Richard
//REGNO: 20RP01184
//Class: Y2 IT

// Comparizson of Two CSV Files through reading their data

import java.io.*;
import java.util.*;
import java.nio.*;
import java.lang.*;

public class CSVComparison {
    
    public static void main(String[] args) throws Exception{
        CSVComparison obj =new CSVComparison();
        String a;
        Scanner st = new Scanner(System.in);
        System.out.println("Enter RegNo: ");
        a=st.nextLine();

        Map<String, String> n = obj.getDetails("Names.csv");
        Map<String, String> data = obj.getDetails("data.csv");
        System.out.println("Resuls for this RegNo : " + a);
        System.out.println("Names : " + n.get(a));

        System.out.println("Marks : " + data.get(a));
    }
    public Map<String, String> getDetails(String filename){

        Map<String, String> det = new HashMap<>();
        
        String line = "";        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) !=null) {
                
               String[] values = line.split(",");
               det.put(values[0], values[1]);
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return det;
        
    }
}
