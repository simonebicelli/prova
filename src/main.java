import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class main {
        
public static void main(String[] args) {
  pilota pilota2 = new pilota(18, "roma", 530);


 System.out.println("i dati sono: "+ pilota2 );
 System.out.println("marca: " + "Mercedes-Benz"); 
 System.out.println("velocità :" + 130 );
 System.out.println(true);

 
System.out.println("puoi partire");

LocalDate dataCorrente = LocalDate.now();
System.out.println("Data corrente: " + dataCorrente);

LocalTime orarioCorrente = LocalTime.now();
System.out.println("Orario corrente: " + orarioCorrente);

LocalDateTime dataOraCorrenti = LocalDateTime.now();
System.out.println("Data e orario correnti: " + dataOraCorrenti);

int anno = dataCorrente.getYear();
int mese = dataCorrente.getMonthValue();
int giorno = dataCorrente.getDayOfMonth();
int ora = orarioCorrente.getHour();
int minuto = orarioCorrente.getMinute();
int secondo = orarioCorrente.getSecond();

System.out.println("Anno: " + anno);
System.out.println("Mese: " + mese);
System.out.println("Giorno: " + giorno);
System.out.println("Ora: " + ora);
System.out.println("Minuto: " + minuto);
System.out.println("Secondo: " + secondo);

LocalDate dataModificata = dataCorrente.withYear(2024);
LocalTime orarioModificato = orarioCorrente.withHour(15).withMinute(30);
System.out.println("Data modificata: " + dataModificata);
System.out.println("Orario modificato: " + orarioModificato);

LocalDate dataFutura = dataCorrente.plusDays(7);
LocalTime orarioFuturo = orarioCorrente.plusHours(2).plusMinutes(15);
        System.out.println("Data futura: " + dataFutura);
        System.out.println("Orario futuro: " + orarioFuturo);
 
 String datapatente = "11 12 2029";

if (datapatente == "11 12 2029") {
        datapatente = "scaduta";
        
}

System.out.println("la data di scadenza della patente è: " + datapatente);
}

    

}



