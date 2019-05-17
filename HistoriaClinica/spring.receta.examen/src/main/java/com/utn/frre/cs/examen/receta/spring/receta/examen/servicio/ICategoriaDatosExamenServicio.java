package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

/**
 * Interface que define las operaciones basicas get,insert,delete,update para <code>CategoriaDatosExamen</code>.
 * 
 * @author Gonza
 * @version 1.0
 */

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaDatosExamen;

@Repository
public interface ICategoriaDatosExamenServicio {

	boolean addCategoriaDatosExamen(CategoriaDatosExamen categoriaDatosExamen);

	CategoriaDatosExamen getCategoriaDatosExamen(long categoriaDatosExamen_id);

	void updateCategoriaDatosExamen(CategoriaDatosExamen categoriaDatosExamen);

	void deleteCategoriaDatosExamen(int categoriaDatosExamen_id);

	List<CategoriaDatosExamen> getAllCategoriaDatosExamen();

}
