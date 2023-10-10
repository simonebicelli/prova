public class auto {
    private int velocità;
    private String marca;
    private boolean acceso;
    public auto(int velocità, String marca, boolean acceso) {
        this.velocità = velocità;
        this.marca = marca;
        this.acceso = acceso;
    }
    public int getVelocità() {
        return velocità;
    }
    public void setVelocità(int velocità) {
        if (velocità>160) {
            System.out.println(" OOOOOOO, rallenta ");
            
        }
        
        this.velocità = velocità;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isAcceso() {
        return acceso;
    }
    public void setAcceso(boolean acceso) {
        if (acceso == true) {
            System.out.println(" puoi paartire ");
            
        } else{ System.out.println(" accendi l'auto ");}
        this.acceso = acceso;
    }
}
