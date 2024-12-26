package com.mycompany.gestionempleados.presentacion;

import com.mycompany.gestionempleados.logica.ControladoraPrincipalGE;
import com.mycompany.gestionempleados.logica.Empleado;
import com.mycompany.gestionempleados.presentacion.validacion.Validar;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Presentacion {

    ControladoraPrincipalGE control;
    Empleado empleado;
    Scanner teclado;

    public Presentacion() {
        control = new ControladoraPrincipalGE();
        empleado = new Empleado();
        teclado = new Scanner(System.in);
    }

    public void listarEmpleado() {
        String informacion = "==============================\n";
        informacion += "--------Empleados enlistados--------\n";
        informacion += "==============================\n";

        for (Empleado emp : control.listar()) {
            informacion += emp;
            informacion += "\n==============================\n";
        }
        System.out.println(informacion);
    }

    public void listarEmpleadoXCargo(List<Empleado> lista) {
        String informacion = "==============================\n";
        informacion += "--------Empleados x Cargo--------\n";
        informacion += "==============================\n";

        for (Empleado emp : lista) {
            informacion += emp;
            informacion += "\n==============================\n";
        }
        System.out.println(informacion);
    }

    public void crearEmpleado() {
        String nombre = "", apellido = "", cargo = "";
        double salario;
        System.out.println("Digitar nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Digitar el apellido del empleado: ");
        apellido = teclado.nextLine();
        System.out.println("Digitar el cargo del empleado: ");
        cargo = teclado.nextLine();
        try {
            System.out.println("Digitar salario del empleado: ");
            salario = Double.parseDouble(teclado.nextLine());
            if (!Validar.esVacio(nombre, apellido, cargo)
                    && !Validar.esNumeros(nombre, apellido, cargo)) {
                control.crear(new Empleado(nombre, apellido, cargo, salario, new Date()));
                System.out.println("Empleado agregado con exito.");
            } else {
                System.out.println("Revisar que los campos no sean vacios y sin valores"
                        + "numericos. ");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Es necesario un valor numerico en salario. ");
        }
    }

    public void buscarEmpleado() {
        int id;
        try {
            System.out.println("Digite el ID del empleado: ");
            id = Integer.parseInt(teclado.nextLine());
            empleado = control.buscar(id);
            //System.out.println(empleado);
        } catch (NumberFormatException ex) {
            System.out.println("Digite valor numerico");

        }
    }

    public void buscarEmpleadosXcargo() {
        String cargo;
        List<Empleado> listaEmpleado;

        try {
            System.out.println("Digite el Cargo de empleado");
            cargo = teclado.nextLine();

            listaEmpleado = control.buscar(cargo);
            //listarEmpleadoXCargo(listaEmpleado);

            if (!listaEmpleado.isEmpty()) {
                listarEmpleadoXCargo(listaEmpleado);
            } else {
                System.out.println("No existen empleados con ese Cargo");
            }

        } catch (Exception ex) {

        }
    }

    public void eliminarEmpleado() {
        int id;

        try {
            System.out.println("Digite el ID del empleado: ");
            id = Integer.parseInt(teclado.nextLine());
            if (control.eliminar(id)) {
                System.out.println("Empleado eliminado con exito.. ");
            } else {
                System.out.println("Empleado no encontrado... ");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Digite valor numerico");

        }
    }

    public void editarEmpleado() {
        String nombre = "", apellido = "", cargo = "";
        double salario;
        buscarEmpleado();
        if (empleado != null) {
            System.out.println("Digitar nuevo nombre del empleado: ");
            nombre = teclado.nextLine();
            System.out.println("Digitar nuevo apellido del empleado: ");
            apellido = teclado.nextLine();
            System.out.println("Digitar nuevo cargo del empleado: ");
            cargo = teclado.nextLine();
            try {
                System.out.println("Digite el salaro del empleado: ");
                salario = Double.parseDouble(teclado.nextLine());
                if (!Validar.esVacio(nombre, apellido, cargo)
                        && !Validar.esNumeros(nombre, apellido, cargo)) {
                    empleado.setNombre(nombre);
                    empleado.setApellido(apellido);
                    empleado.setCargo(cargo);
                    empleado.setSalario(salario);
                    control.editar(empleado);
                    System.out.println("Actualizado con exito. ");
                } else {
                    System.out.println("Revisar que los campos nombre, apellido y cargo "
                            + "no se encuentren vacios o con valores numericos. ");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Es necesario un valor numerico en salario. ");
            }
        } else {
            System.out.println("Empleado no encontrado.. ");
        }

    }
}
