package clientepizza;

/**
 *
 * @author cromerofajar
 */
public class Pizza {
    private int grHarina,mlAgua,grSal,mlAceite,grTomate,grQueso,grPinha;
    private String tipoAceite,tipoQueso;

    public Pizza() {
    }

    public Pizza(int grHarina, int mlAgua, int grSal, int mlAceite, int grTomate, int grQueso, int grPinha, String tipoAceite, String tipoQueso) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.grPinha = grPinha;
        this.tipoAceite = tipoAceite;
        this.tipoQueso = tipoQueso;
    }

    public void setGrHarina(int grHarina) {
        this.grHarina = grHarina;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }

    public void setGrSal(int grSal) {
        this.grSal = grSal;
    }

    public void setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
    }

    public void setGrTomate(int grTomate) {
        this.grTomate = grTomate;
    }

    public void setGrQueso(int grQueso) {
        this.grQueso = grQueso;
    }

    public void setGrPinha(int grPinha) {
        this.grPinha = grPinha;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public int getGrHarina() {
        return grHarina;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public int getGrSal() {
        return grSal;
    }

    public int getMlAceite() {
        return mlAceite;
    }

    public int getGrTomate() {
        return grTomate;
    }

    public int getGrQueso() {
        return grQueso;
    }

    public int getGrPinha() {
        return grPinha;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", grPinha=" + grPinha + ", tipoAceite=" + tipoAceite + ", tipoQueso=" + tipoQueso + '}';
    }
    
    
}
