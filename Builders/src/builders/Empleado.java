
package builders;

/**
 *
 * @author cromerofajar
 */
public class Empleado {
    
    private String nombre,apellido1,apellido2,cargo,dni,formacion;
    private int  dia,mes,año,altura,pie,cabezaD,sueldo;

    public Empleado(){
        
    }

    public Empleado(final String nombre,final String apellido1,final String apellido2,final String cargo,final String dni,final String formacion,final int dia,final int mes,final int año,final int altura,final int pie,final int cabezaD,final int sueldo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cargo = cargo;
        this.dni = dni;
        this.formacion = formacion;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.altura = altura;
        this.pie = pie;
        this.cabezaD = cabezaD;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", cargo=" + cargo + ", dni=" + dni + ", formacion=" + formacion + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + ", altura=" + altura + ", pie=" + pie + ", cabezaD=" + cabezaD + ", sueldo=" + sueldo + '}';
    }
    
    
}
