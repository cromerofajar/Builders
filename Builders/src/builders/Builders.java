package builders;

/**
 *
 * @author cromerofajar
 */
public class Builders {

    public static void main(String[] args) {
        Empleado Empl4=new EmpleadoBuilder("Robert","Ulloa","2345614S")
        .setApellido2("Rodrigues") .createEmpleado();
        System.out.println(Empl4);
        
    }
    
}
