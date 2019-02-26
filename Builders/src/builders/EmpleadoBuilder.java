package builders;

/**
 *
 * @author cromerofajar
 */
public class EmpleadoBuilder {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cargo = "";
    private String dni;
    private String formacion = "";
    private int dia = 0;
    private int mes = 0;
    private int año = 0;
    private int altura = 0;
    private int pie = 0;
    private int cabezaD = 0;
    private int sueldo = 0;

    public EmpleadoBuilder(final String nombre, final String apellido1, final String dni) {
    }

    public EmpleadoBuilder setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilder setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilder setFormacion(String formacion) {
        this.formacion = formacion;
        return this;
    }

    public EmpleadoBuilder setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilder setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilder setAño(int año) {
        this.año = año;
        return this;
    }

    public EmpleadoBuilder setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilder setPie(int pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilder setCabezaD(int cabezaD) {
        this.cabezaD = cabezaD;
        return this;
    }

    public EmpleadoBuilder setSueldo(int sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public Empleado createEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, cargo, dni, formacion, dia, mes, año, altura, pie, cabezaD, sueldo);
    }
    
}
