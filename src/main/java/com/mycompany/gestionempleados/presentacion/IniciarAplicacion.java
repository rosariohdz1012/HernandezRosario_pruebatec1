package com.mycompany.gestionempleados.presentacion;

import java.util.Scanner;

public class IniciarAplicacion {

    String menu;
    Scanner teclado;
    int opcion = 0;
    boolean bandera = true;
    Presentacion presentacion;

    public IniciarAplicacion() {
        presentacion = new Presentacion();
        teclado = new Scanner(System.in);

    }

    public void Iniciar() {
        while (bandera) {
            crearMenu();
            opcion = teclado.nextInt();
            realizarAccion(opcion);
        }
    }

    public void crearMenu() {
        menu = "----------------------------------\n";
        menu += "G E S T I O N  E M P L E  A D O\n";
        menu += "----------------------------------\n";
        menu += "1. Agregar empleado.\n";
        menu += "2. Listar empleados.\n";
        menu += "3. Buscar empleados por cargo.\n";
        menu += "4. Actualizar empleado.\n";
        menu += "5. Eliminar empleado.\n";
        menu += "6. Salir.\n";
        menu += "----------------------------------\n";

        System.out.println(menu);
    }

    public void realizarAccion(int opcion) {
        switch (opcion) {
            case 1:
                presentacion.crearEmpleado();
                break;
            case 2:
                presentacion.listarEmpleado();
                break;
            case 3:
                presentacion.buscarEmpleadosXcargo();
                break;
            case 4:
                presentacion.editarEmpleado();
                break;
            case 5:
                presentacion.eliminarEmpleado();
                break;
            case 6:
                bandera = false;
                break;
                
            default:
                throw new AssertionError();
        }
    }

}
