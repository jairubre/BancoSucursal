package src.BancoCliente;

import java.time.LocalDate;


public class ClienteBnaco {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private LocalDate fechaNacimiento;
    private String ciudad;
    private String profesion;

    public ClienteBnaco(String nombre, String apellidos, String dni, int edad, LocalDate fechaNacimiento,
            String ciudad, String profesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "ClienteBanco {\n" +
                "  nombre: '" + nombre + "',\n" +
                "  apellidos: '" + apellidos + "',\n" +
                "  dni: '" + dni + "',\n" +
                "  edad: " + edad + ",\n" +
                "  fechaNacimiento: " + fechaNacimiento + ",\n" +
                "  ciudad: '" + ciudad + "',\n" +
                "  profesion: '" + profesion + "'\n" +
                "}";
    }

}
