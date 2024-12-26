package com.mycompany.gestionempleados.logica;

import com.mycompany.gestionempleados.persistencia.EmpleadoPersistencia;
import java.util.List;

public class ControladoraPrincipalGE {
    
    EmpleadoPersistencia empleadoPersis = new EmpleadoPersistencia();
    
    
    public List<Empleado> listar(){
        return empleadoPersis.listar();
    }
    
    public void crear(Empleado emp){
        empleadoPersis.crear(emp);
        }
    
    public Empleado buscar(int id){
        return empleadoPersis.buscar(id);
    }
    
    public List<Empleado> buscar(String cargo){
        return empleadoPersis.buscar(cargo);
    }
    
    public boolean eliminar(int id){
        return empleadoPersis.eliminar(id);
    }
    
    public void editar(Empleado emp){
        empleadoPersis.editar(emp);
    }
}

