package src.BancoCliente;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppSucursalBancaria {
    static Scanner sc = new Scanner(System.in);
    static List<CuentaBanco> clientes = new ArrayList<CuentaBanco>();

    public static void main(String[] args) {

        CuentaCorriente c1 = new CuentaCorriente(1, new ClienteBnaco("null", "null",
                "null", 10, LocalDate.of(2001, 12, 11), "null", "null"));
        System.out.println(c1.toString());
        c1.ingresarDinero(100);
        System.out.println(c1.saldo);
        try {
            c1.retirarDinero(400);
        } catch (excepcionValidar e) {
            System.out.println(e);
        }
        System.out.println(c1.saldo);
        System.out.println("-----------------------------------");
        CuentaVivienda c2 = new CuentaVivienda(1, new ClienteBnaco("Jaime", "null",
                "null",
                12, LocalDate.of(2001, 11, 1), "Mostoles", "Cura"));
        System.out.println(c2.toString());
        c2.ingresarDinero(100);
        System.out.println(c2.saldo);
        try {
            c2.retirarDinero(100);
            c2.retirarDinero(50);
        } catch (excepcionValidar e) {
            System.out.println(e);
        }
        System.out.println(c2.saldo);
        System.out.println(c2.movimientos);
        // MenuCrear();
        System.out.println("pepe");
        
    }

    

    public static void MenuCrear() {

        int opcion = 0;
        do {
            System.out.println("Bienvenido a nuestro banco");
            System.out.println("Dinos q tipo de cuenta te quieres abrir");
            System.out.println("1.Cuenta Corriente");
            System.out.println("2.Cuenta Vivienda");
            System.out.println("3.Fondos de inversión");
            System.out.println("4.salir");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                tiposCenta(opcion);

            } catch (InputMismatchException e) {
                System.out.println("Has introducido un valor que no es válido");
                System.out.println("Intentelo de nuevo");
            }
            sc.nextLine();

        } while (opcion != 4);

    }

    public static void tiposCenta(int opcion) {

        switch (opcion) {
            case 1:
                System.out.println("Vamos a crear una cuenta corriente");
                try {
                    System.out.println("Introduce nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce apellidos");
                    String apellidos = sc.nextLine();
                    System.out.println("Introduce dni");
                    String dni = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduce edad");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Fecha de nacimiento");
                    System.out.println("Introduce dia");
                    int dia = sc.nextInt();
                    System.out.println("Introduce mes en numero");
                    int mes = sc.nextInt();
                    System.out.println("introduce años");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    LocalDate fecha = LocalDate.of(ano, mes, dia);
                    System.out.println("Ciudad");
                    String ciudad = sc.nextLine();
                    System.out.println("Profesion");
                    String profesion = sc.nextLine();
                    CuentaBanco c1 = new CuentaCorriente(clientes.size() + 1,
                            new ClienteBnaco(nombre, apellidos, dni, edad, fecha, ciudad, profesion));

                    System.out.println(c1.toString());

                } catch (InputMismatchException e) {
                    System.out.println("Has metido un valor mal ");
                } catch (Exception e) {
                    System.out.println(e);
                }

                break;

            default:
                break;
        }
    }

}
