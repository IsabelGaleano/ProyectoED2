package com.estructuras.proyecto.controller;
import com.estructuras.proyecto.entities.DireccionModel;
import com.estructuras.proyecto.entities.InfoArcos;
import com.estructuras.proyecto.entities.PlayaModel;
import com.estructuras.proyecto.logic.Gestor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/Grafo")

public class GrafoController {

    private final Gestor gestor = new Gestor();

    @CrossOrigin
    @RequestMapping( value = "playasAdyacentes/{idPlaya}", method = RequestMethod.GET, consumes = "application/json",
            produces = "application/json")
    @ResponseBody
    public List<DireccionModel> getPlayasAdyacentes(@PathVariable("idPlaya") String idPlaya){

        return this.gestor.playasAdyacentes(idPlaya);
    }

    @CrossOrigin
    @RequestMapping( value = "buscarPlaya/{nombre}", method = RequestMethod.GET, consumes =  MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PlayaModel getPlaya(@PathVariable("nombre") String nombre){
        return this.gestor.buscarPlaya(nombre);
    }

    @CrossOrigin
    @RequestMapping( value = "buscarCamino/{inicio}", method = RequestMethod.GET, consumes = "application/json",
            produces = "application/json")
    @ResponseBody
    public ArrayList<DireccionModel> getCamino(@PathVariable("inicio") String inicio){
        String[] parts = inicio.split("-");
        return this.gestor.getCaminoMinimo(parts[0], parts[1]);
    }

    @CrossOrigin
    @RequestMapping( value = "obtenerPlayas", method = RequestMethod.GET, consumes = "application/json",
            produces = "application/json")
    @ResponseBody
    public PlayaModel[] getPlayas(){
        return this.gestor.generatePlayas();
    }

    @CrossOrigin
    @RequestMapping( value = "obtenerArcos", method = RequestMethod.GET, consumes = "application/json",
            produces = "application/json")
    @ResponseBody
    public ArrayList<InfoArcos> getArcos(){
        return this.gestor.generarArcos();
    }
}
