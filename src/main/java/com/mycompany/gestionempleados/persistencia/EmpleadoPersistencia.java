package com.mycompany.gestionempleados.persistencia;

import com.mycompany.gestionempleados.logica.Empleado;
import com.mycompany.gestionempleados.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoPersistencia {

    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();

    public List<Empleado> listar() {
        return empleadoJPA.findEmpleadoEntities();
    }

    public void crear(Empleado emp) {
        empleadoJPA.create(emp);
    }

    public Empleado buscar(int id) {
        return empleadoJPA.findEmpleado(id);
    }
    public List<Empleado> buscar(String cargo){
        List<Empleado> listaEmpcargo = new ArrayList<>();        
//        for(Empleado emp : listar()){
//            if(emp.getCargo().equals(cargo)){
//                listaEmpcargo.add(emp);
//            }                               
//        }
        List<Empleado> listaEmp = listar();
        for(int i=0;i<listaEmp.size();i++){
            if(listaEmp.get(i).getCargo().equals(cargo)){
                listaEmpcargo.add(listaEmp.get(i));
            }
        }

        return listaEmpcargo;
    }

    public boolean eliminar(int id) {
        try {
            empleadoJPA.destroy(id);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmpleadoPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void editar(Empleado emp) {
        try {
            empleadoJPA.edit(emp);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
//listar crear buscar eliminar y editar
