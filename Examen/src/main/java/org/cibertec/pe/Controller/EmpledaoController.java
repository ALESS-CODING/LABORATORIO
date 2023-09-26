package org.cibertec.pe.Controller;

import java.util.List;

import org.cibertec.pe.Model.Empleado;
import org.cibertec.pe.Service.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmpledaoController {
	@Autowired
	private EmpleadoServicio es;
	
	@GetMapping("/listar")
	public String listar (Model m) {
		List<Empleado> e = es.listado();
		m.addAttribute("empleado", e);
		m.addAttribute("cant", e.size());
		return "listado";
	}
	@GetMapping("/add")
	public String agregar ( Model m) {
		return "agregar";
	}
	
	@PostMapping("/salvar")
	public String salvar ( Empleado e, Model m) {
		es.Agregar(e);
		return "redirect:/listar";
	}
}
