package builders;

/**
 *
 * @author cromerofajar
 */
public class EmpleaBuilder{
    
    private String nombre,apellido1,apellido2,cargo,dni,formacion;
    private int  dia,mes,año,altura,pie,cabezaD,sueldo;

    public EmpleaBuilder(final String nombre,final String apellido1,final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
         apellido2="";
        dia=0;
        mes=0;
        año=0;
        altura=0;
        pie=0;
        cabezaD=0;
        sueldo=0;
        cargo="";
        formacion="";
    }

    public EmpleaBuilder setApellido2(String nuevoApellido2) {
        this.apellido2 = nuevoApellido2;
        return this;
    }

    @Override
    public String toString() {
        return "EmpleadoBuilder{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", cargo=" + cargo + ", dni=" + dni + ", formacion=" + formacion + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + ", altura=" + altura + ", pie=" + pie + ", cabezaD=" + cabezaD + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
