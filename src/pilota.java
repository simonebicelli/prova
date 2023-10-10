public class pilota {
    public pilota(int età, String destinazione, int km) {
        this.età = età;
        this.destinazione = destinazione;
        this.km = km;
    }
    private int età;
    private String destinazione;
    private int km;
    
    public int getEtà() {
       
        return età; 
    }
    public String getDestinazione() {
            return destinazione;
    }
    public int getKm() {
        return km;
    }
    public void setEtà(int età) {
        if( età<18){
            System.out.println(" non puoi guidare ");
        }
        else{
            System.out.println(" puoi guidare ");
        this.età = età;}
    }
    public void setDestinazione(String destinazione) {
        if (destinazione == "reggiocalabria") {
            System.out.println("DESTINAZIONE MAAAAARE");
            
        }
        else {System.out.println(" calcolo etinerario.......... calcolo concluso ");}
        this.destinazione = destinazione;
    }
    public void setKm(int km) {
        
        this.km = km;

    }
    @Override
    public String toString() {
        return "pilota [età=" + età + ", destinazione=" + destinazione + ", km=" + km + "]";
    }













}
