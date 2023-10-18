import javax.print.DocFlavor.CHAR_ARRAY;

public class patente {
    private int punti;
    private int datapatente;
    private boolean presente;

    public patente(int punti, int data, boolean presente) {
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
    public int getData() {
        return datapatente;
    }
    public void setData(int data) {
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

