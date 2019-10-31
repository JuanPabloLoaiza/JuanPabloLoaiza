import { Component } from '@angular/core';
/**
 * @description componente con el nombre, ciudad y url del repositorio.
 * 
 * @author Juan Pablo Loaiza Cardona <juan.1701422854@ucaldas.edu.co>
 */


@Component({
    selector: 'mi-mensaje',
    templateUrl: './mi-mensaje-componente.html',
})

export class InformacionComponent{
    /**
     * Los atributos que llevaran la informacion 
     */
    nombre : string
    repositorio : string
    ciudad : string

    /**
     * 
     * @param nombre 
     * @param repositorio 
     * @param ciudad 
     * El constructor d
     */
    constructor()
    {
        this.nombre = "Juan Pablo Loaiza"
        this.ciudad = "Manizales"
        this.repositorio = "https://github.com/JuanPabloLoaiza/JuanPabloLoaiza.git"
    }
}
