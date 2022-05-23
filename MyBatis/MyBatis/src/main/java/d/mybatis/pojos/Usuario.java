package d.mybatis.pojos;


public class Usuario {
    private int IDUSU;
    private String NOMUSU;
    private String APEUSU;
    private String NIVUSU;
    private String PASUSU;

    public Usuario(){
    }
    public Usuario(int IDUSU,String NOMUSU, String APEUSU, String NIVUSU, String PASUSU){
    this.IDUSU = IDUSU;
    this.NOMUSU = NOMUSU;
    this.APEUSU = APEUSU;
    this.NIVUSU = NIVUSU;
    this.PASUSU = PASUSU;
    }
    public Usuario(String NOMUSU, String APEUSU, String NIVUSU, String PASUSU){
    this.NOMUSU = NOMUSU;
    this.APEUSU = APEUSU;
    this.NIVUSU = NIVUSU;
    this.PASUSU = PASUSU;
    }

    public int getIDUSU() {
        return IDUSU;
    }

    public void setIDUSU(int IDUSU) {
        this.IDUSU = IDUSU;
    }

    public String getNOMUSU() {
        return NOMUSU;
    }

    public void setNOMUSU(String NOMUSU) {
        this.NOMUSU = NOMUSU;
    }

    public String getAPEUSU() {
        return APEUSU;
    }

    public void setAPEUSU(String APEUSU) {
        this.APEUSU = APEUSU;
    }

    public String getNIVUSU() {
        return NIVUSU;
    }

    public void setNIVUSU(String NIVUSU) {
        this.NIVUSU = NIVUSU;
    }

    public String getPASUSU() {
        return PASUSU;
    }

    public void setPASUSU(String PASUSU) {
        this.PASUSU = PASUSU;
    }

    @Override
    public String toString() {
        return NOMUSU+"-------"+PASUSU;
    }
    
}
