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
            System.out.println(" puoi partire ");
            
        } else{ System.out.println(" accendi l'auto ");}
        this.acceso = acceso;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + velocità;
        result = prime * result + ((marca == "") ? 0 : marca.hashCode());
        result = prime * result + (acceso ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == "")
            return false;
        if (getClass() != obj.getClass())
            return false;
        auto other = (auto) obj;
        if (velocità != other.velocità)
            return false;
        if (marca == "") {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (acceso != other.acceso)
            return false;
        return true;
    }
}
