
package clientepizza;

/**
 *
 * @author cromerofajar
 */
public class ClientePizza {

    public static void main(String[] args) {
        Pizza miPizzaHawaina;
        miPizzaHawaina=new PizzaBuilder(3,4).setGrPinha(4).setTipoAceite("patata").createPizza();
        System.out.println(miPizzaHawaina);
    }
    
}
