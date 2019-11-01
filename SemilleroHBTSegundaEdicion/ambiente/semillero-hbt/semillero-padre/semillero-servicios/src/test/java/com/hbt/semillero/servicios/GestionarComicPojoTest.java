package com.hbt.semillero.servicios;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hbt.semillero.entidades.*;
import com.hbt.semillero.pojo.*;

public class GestionarComicPojoTest {
	
	@Test
	public void eliminar() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.agregarComicDTOLista(gestionarComicPOJO.crearComicDTO("1", "Dragon Ball Yamcha",
				"Planeta Comic", TematicaEnum.AVENTURAS.name(), "Manga Shonen", 144, new BigDecimal(2100),
				"Dragon Garow Lee", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO.name(), 20l));
		gestionarComicPOJO.agregarComicDTOLista(gestionarComicPOJO.crearComicDTO("2", "Captain America Corps 1-5 USA",
				"Panini Comics", TematicaEnum.FANTASTICO.name(), "BIBLIOTECA MARVEL", 128, new BigDecimal(5000),
				"Phillippe Briones, Roger Stern", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO.name(), 5l));
		gestionarComicPOJO.agregarComicDTOLista(gestionarComicPOJO.crearComicDTO("3",
				"The Spectacular Spider-Man v2 USA", "Panini Comics", TematicaEnum.FANTASTICO.name(), "MARVEL COMICS",
				208, new BigDecimal(6225), "Straczynski,Deodato Jr.,Barnes,Eaton", Boolean.TRUE, LocalDate.now(),
				EstadoEnum.INACTIVO.name(), 0l));

		int tamañoAnterior = gestionarComicPOJO.getListaComics().size();
		gestionarComicPOJO.eliminarComicDTO("1");
		Assert.assertEquals(gestionarComicPOJO.getListaComics().size(), tamañoAnterior - 1);
	}

	@Test
	public void modificar() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.agregarComicDTOLista(gestionarComicPOJO.crearComicDTO("1", "Dragon Ball Yamcha",
				"Planeta Comic", TematicaEnum.AVENTURAS.name(), "Manga Shonen", 144, new BigDecimal(2100),
				"Dragon Garow Lee", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO.name(), 20l));
		gestionarComicPOJO.agregarComicDTOLista(gestionarComicPOJO.crearComicDTO("2", "Captain America Corps 1-5 USA",
				"Panini Comics", TematicaEnum.FANTASTICO.name(), "BIBLIOTECA MARVEL", 128, new BigDecimal(5000),
				"Phillippe Briones, Roger Stern", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO.name(), 5l));
		gestionarComicPOJO.agregarComicDTOLista(gestionarComicPOJO.crearComicDTO("3",
				"The Spectacular Spider-Man v2 USA", "Panini Comics", TematicaEnum.FANTASTICO.name(), "MARVEL COMICS",
				208, new BigDecimal(6225), "Straczynski,Deodato Jr.,Barnes,Eaton", Boolean.TRUE, LocalDate.now(),
				EstadoEnum.INACTIVO.name(), 0l));

		gestionarComicPOJO.modificarComicDTO("2", "Captain America");
		Assert.assertEquals(gestionarComicPOJO.getListaComics().get(1).getNombre(), "Captain America");
	}
}
