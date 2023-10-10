import java.util.Scanner;
// import java.util.InputMismatchException;
public class Appseconda {
    public static void main(String[] args) /*throws Exception*/ {
        Scanner scanner = new Scanner(System.in);
       Televisione prova = new Televisione(0, 0, false);
    //    System.out.println(prova.getvolume());
    //    System.out.println(prova.getcanale());
       System.out.println("accesa? (s/n)");
       boolean accesa;
       char a = scanner.next().charAt(0);
        if(a == 's' ){accesa = true;}
        else if(a == 'n') {accesa = false;}
        else{System.out.println("è spenta bro");
    accesa = false;}
        Televisione mio = new Televisione(a, a, accesa);
System.out.print(mio.toString());

        
}
}
