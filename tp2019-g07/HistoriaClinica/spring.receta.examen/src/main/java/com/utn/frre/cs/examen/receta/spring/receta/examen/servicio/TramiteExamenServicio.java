package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio.TramiteExamenSpringDataRepositorio;

/**
 * servicio que implementa las operaciones basicas get,insert,delete,update para
 * <code>TramiteExamen</code>. cableo con TramiteExamenSpringDataRepositorio
 * para ayudarme a definir el comportamiento mas adecuado para esta clase
 * 
 * @author Gonza
 * @version 1.0
 */
@Service
public class TramiteExamenServicio implements ITramiteExamenServicio {

	// Dependencies -----------------------------------------------------------

	@Autowired
	private TramiteExamenSpringDataRepositorio tramiteExamenRepositorio;

	// Operation --------------------------------------------------------------

	@Override
	public synchronized boolean addTramiteExamen(TramiteExamen tramiteExamen) {
		tramiteExamenRepositorio.save(tramiteExamen);
		return true;

	}

	@Override
	public TramiteExamen getTramiteExamen(long tramiteExamen_id) {
		TramiteExamen obj = tramiteExamenRepositorio.findById(tramiteExamen_id).get();
		return obj;
	}

	@Override
	public void updateTramiteExamen(TramiteExamen tramiteExamen) {
		tramiteExamenRepositorio.save(tramiteExamen);

	}

	@Override
	public void deleteTramiteExamen(int tramiteExamen_id) {
		tramiteExamenRepositorio.delete(getTramiteExamen(tramiteExamen_id));

	}

	@Override
	public List<TramiteExamen> getAllTramiteExamen() {
		List<TramiteExamen> list = new ArrayList<>();
		tramiteExamenRepositorio.findAll().forEach(e -> list.add(e));
		return list;
	}

}
