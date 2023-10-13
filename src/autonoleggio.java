public class autonoleggio {
    private int autovetture;
    private String nomeautonoleggio;
    private String datanoleggio;
    public autonoleggio(int autovetture, String nomeautonoleggio, String datanoleggio) {
        this.autovetture = autovetture;
        this.nomeautonoleggio = nomeautonoleggio;
        this.datanoleggio = datanoleggio;
    }
    public int getAutovetture() {
        return autovetture;
    }
    public void setAutovetture(int autovetture) {
        this.autovetture = autovetture;
    }
    public String getNomeautonoleggio() {
        return nomeautonoleggio;
    }
    public void setNomeautonoleggio(String nomeautonoleggio) {
        this.nomeautonoleggio = nomeautonoleggio;
    }
    public String getDatanoleggio() {
        return datanoleggio;
    }
    public void setDatanoleggio(String datanoleggio) {
        this.datanoleggio = datanoleggio;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + autovetture;
        result = prime * result + ((nomeautonoleggio == null) ? 0 : nomeautonoleggio.hashCode());
        result = prime * result + ((datanoleggio == null) ? 0 : datanoleggio.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        autonoleggio other = (autonoleggio) obj;
        if (autovetture != other.autovetture)
            return false;
        if (nomeautonoleggio == null) {
            if (other.nomeautonoleggio != null)
                return false;
        } else if (!nomeautonoleggio.equals(other.nomeautonoleggio))
            return false;
        if (datanoleggio == null) {
            if (other.datanoleggio != null)
                return false;
        } else if (!datanoleggio.equals(other.datanoleggio))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "autonoleggio [autovetture=" + autovetture + ", nomeautonoleggio=" + nomeautonoleggio + ", datanoleggio="
                + datanoleggio + "]";
    }


    
}
