package clientepizza;

/**
 *
 * @author cromerofajar
 */
public class PizzaBuilder {
    private int grHarina,mlAgua,grSal=0,mlAceite=0,grTomate=0,grQueso=0,grPinha=0;
    private String tipoAceite=null,tipoQueso=null;
    
    public PizzaBuilder(int grHarina,int mlAgua){
        this.grHarina=grHarina;
        this.mlAgua=mlAgua;
    }
    public PizzaBuilder setgrSal(int grSal){
        this.grSal=grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(int grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(int grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(int grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    
    public Pizza createPizza(){
        return new Pizza(this.grHarina,this.mlAgua,this.grSal,this.mlAceite,this.grTomate,this.grQueso,this.grPinha,this.tipoAceite,this.tipoQueso);
        
    }
}
