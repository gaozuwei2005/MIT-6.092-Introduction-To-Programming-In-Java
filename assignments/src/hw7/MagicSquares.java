package hw7;

import java.io.*;
import java.util.ArrayList;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        InputStream inputStream = MagicSquares.class.getResourceAsStream(pathName);
        if (inputStream == null) {
            throw new FileNotFoundException("File not found in classpath: " + pathName);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        // For each line in the file ...
        String line;
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            String[] parts = line.split("\t");
            ArrayList<Integer> row = new ArrayList<>();
            for (String part : parts)
                row.add(Integer.parseInt(part));
            table.add(row);
        }

        int sum, Sum = -1;
        for (ArrayList<Integer> row : table) {
            sum = 0;
            for(int val : row)
                sum += val;
            if (Sum == -1)
                Sum = sum;
            else if (sum != Sum) {
                reader.close();
                return false;
            }
        }

        for(int i = 0; i < table.size(); i ++) {
            sum = 0;
            for (ArrayList<Integer> row : table)
                sum += row.get(i);
            if(sum != Sum) {
                reader.close();
                return false;
            }
        }

        sum = 0;
        for(int i = 0; i < table.size(); i ++)
            sum += table.get(i).get(i);
        if(sum != Sum) {
            reader.close();
            return false;
        }

        sum = 0;
        for(int i = 0; i < table.size(); i ++)
            sum += table.get(i).get(table.size() - i - 1);
        if(sum != Sum){
            reader.close();
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}