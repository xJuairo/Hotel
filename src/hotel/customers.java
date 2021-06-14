package hotel;

public class customers {
    
    private String Nombre;
    private String NumTel;
    private String Correo;
    private String MetodoP;
    private int NumH;
    private String Sexo;
    
    public customers(String n, String nt, String c, String mp, int nh, String s){
        Nombre = n;
        NumTel = nt;
        Correo = c;
        MetodoP = mp;
        NumH = nh;
        Sexo = s;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumTel() {
        return NumTel;
    }

    public void setNumTel(String NumTel) {
        this.NumTel = NumTel;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getMetodoP() {
        return MetodoP;
    }

    public void setMetodoP(String MetodoP) {
        this.MetodoP = MetodoP;
    }

    public int getNumH() {
        return NumH;
    }

    public void setNumH(int NumH) {
        this.NumH = NumH;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
}
