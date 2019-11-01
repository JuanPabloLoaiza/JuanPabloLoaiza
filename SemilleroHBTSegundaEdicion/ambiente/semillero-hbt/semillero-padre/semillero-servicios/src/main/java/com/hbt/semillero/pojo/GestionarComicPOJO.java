/**
 * GestionarComicPOJO.java
 */
package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author Juan Pablo Loaiza
 * @version
 */
public class GestionarComicPOJO {
	private List<ComicDTO> listaComics = null;
	
	/*
	 *En este metodo creamos un comic y retornamos ese mismo comic
	 */
	public ComicDTO crearComicDTO(String id, String nombre, String editorial, String tematica, String coleccion,
			Integer numeroPaginas, BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta,
			String estado, Long cantidad) {

		ComicDTO comicDTO = new ComicDTO(id, nombre, editorial, tematica, coleccion, numeroPaginas, precio, autores,
				color, fechaVenta, estado, cantidad);
		return comicDTO;

	}

	/*
	 *En este metodo agregamos un comic a la lista de comics, si la lista no tiene valores primero la creamos y luego le agregamos el comic entrante
	 */
	public void agregarComicDTOLista(ComicDTO comicDTO) {
		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}
		listaComics.add(comicDTO);
	}

	/*
	 *En este metodo creamos un comic y lo agregamos a la lista de comics, si la lista esta vacia, la creamos primero y luego agregamos el comic que se acabo de crear
	 */
	public void crearComicDTO() {
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId("100");
		comicDTO.setNombre("Dragon Ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematica("AVENTURAS");
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);
		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}
		listaComics.add(comicDTO);
	}
	
	/*
	 *En este metodo le cambiamos el nombre a un comic en una posicion especifica de la lista de comics
	 */
	public void modificarComicDTO(String id, String nombre) {
		ComicDTO comicModificar = null;
		for (int i = 0; i < listaComics.size(); i++) {
			comicModificar = listaComics.get(i);
			if (listaComics.get(i).getId().equals(id)) {
				comicModificar.setNombre(nombre);
				return;
			}
		}
	}

	/*
	 *En este metodo eliminamos un comic de la lista mediante el id del comic a eliminar
	 */
	public void eliminarComicDTO(String id) {
		if (!this.listaComics.isEmpty()) {
			int i = 0;
			while (i < this.listaComics.size()) {
				if (this.listaComics.get(i).getId().equals(id)) {
					this.listaComics.remove(i);
					return;
				}
				i++;
			}
		}
	}

	/**
	 * Metodo encargado de retornar el valor del atributo listaComics
	 * 
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo listaComics
	 * 
	 * @param listaComics El nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}

}
