
package hotel;


public class HAB {
    private int NUMHAB;
    private String Tipo;
    private int THABENT;

    public HAB(int NUMHAB, String Tipo,int THABENT) {
        this.NUMHAB = NUMHAB;
        this.Tipo = Tipo;
        this.THABENT=THABENT;
    }
    public HAB(int nh, int thab){
        NUMHAB = nh;
        THABENT = thab;
    }

    HAB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNUMHAB() {
        return NUMHAB;
    }

    public void setNUMHAB(int NUMHAB) {
        this.NUMHAB = NUMHAB;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getTHABENT() {
        return THABENT;
    }

    public void setTHABENT(int THABENT) {
        this.THABENT = THABENT;
    }
    
}
