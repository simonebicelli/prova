import java.io.BufferedReader; 

import java.io.FileReader; 

import java.io.IOException; 

 

public class main_legdafile { 

    public static void main(String[] args) { 

        String filePath = "patata.txt"; 

         

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { 

            String line; 

            while ((line = br.readLine()) != null) { 

                System.out.println(line); 

            } 

        } catch (IOException e) { 

            System.err.println("Errore nella lettura del file: " + e.getMessage()); 

        } 

    } 

} 