import javax.print.DocFlavor.CHAR_ARRAY;

public class patente {
    private int punti;
    private String datapatente;
    private boolean presente;

    public patente(int punti, String data, boolean presente) {
        this.punti = punti;
        this.datapatente = data;
        this.presente = presente;
    }
    public int getPunti() {
        return punti;
    }
    public void setPunti(int punti) {
        this.punti = punti;
    }
    public String getData() {
        return datapatente;
    }
    public void setData(String data) {
        this.datapatente = data;
    }
    public boolean isPresente() {
        return presente;
    }
    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    @Override
    public String toString() {
        return "patente [punti=" + punti + ", data=" + datapatente + ", presente=" + presente + "]";
    }

}

