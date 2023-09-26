package org.cibertec.pe.Service;

import java.util.List;

import org.cibertec.pe.Model.Empleado;
import org.cibertec.pe.Repository.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpleadoServicio implements EmpleadoInterface{
	@Autowired
	private EmpleadoRepositorio er;
	@Override
	public List<Empleado> listado() {
		return (List<Empleado>) er.findAll();
	}

	@Override
	public int Agregar(Empleado e) {
		int resp = 0;
		Empleado em = er.save(e);
		if(em.equals(null)) resp =1;
		return resp;
	}

}
