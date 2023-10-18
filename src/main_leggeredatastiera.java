import java.util.Scanner; 

 

public class main_leggeredatastiera { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

         

        System.out.print("Inserisci qualcosa da tastiera: "); 

        String input = scanner.nextLine(); 

        System.out.println("Hai inserito: " + input); 

         

        scanner.close(); 

    } 

} 