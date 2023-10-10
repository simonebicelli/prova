public class Televisione {

    private int canale;
    private int volume;
    private boolean accesa;

    public Televisione(int canale, int volume, boolean accesa){
        this.canale=canale;
        this.volume=volume;
        this.accesa=accesa;
    }
    public Televisione(){
        this.accesa=true;
        this.volume=0;
        this.canale=1;
    }
    
public int getcanale(){
    return this.canale;
}
public int getvolume(){
    return this.volume;
}
public boolean getaccesa(){
    return this.accesa;
}
public void setcanale(int canale){
    this.canale=canale;
}
public void setvolume(int volume){
    this.volume=volume;
}
public void setaccesa(boolean accesa){
    this.accesa=accesa;
}



}
