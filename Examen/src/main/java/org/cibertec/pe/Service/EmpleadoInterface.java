package org.cibertec.pe.Service;

import java.util.List;

import org.cibertec.pe.Model.Empleado;

public interface EmpleadoInterface {
	public List<Empleado> listado();
	public int Agregar(Empleado e); 
}
