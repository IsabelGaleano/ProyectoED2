package com.estructuras.proyecto.logic;

import com.estructuras.proyecto.entities.*;

import java.util.ArrayList;

public class Gestor {
    public ListaVertices listaVertices;
    private TablaHash hash;
    private ArrayList<String> verticesMarcados;
    private ArrayList<NodoDijkstra> costosAnteriores;

    public Gestor() {
        this.listaVertices = new ListaVertices();
        this.hash = new TablaHash();
        this.verticesMarcados = new ArrayList<String>();
        this.costosAnteriores = new ArrayList<NodoDijkstra>();
        agregarPlayas();
        agregarArcos();


    }

    public ArrayList<DireccionModel> playasAdyacentes(String idPlaya){
        return  this.listaVertices.buscarAdyacentes(idPlaya);
    }

    public PlayaModel[] generatePlayas(){
        PlayaModel[] playas = new PlayaModel[26];

        playas[0] = new PlayaModel("plConchal", "Playa conchal","10.39971650735049","-85.81430567532414");
        playas[1] = new PlayaModel("plCoco", "Playas del Coco","10.558567526142369","-85.69680047053085");
        playas[2] = new PlayaModel("plFlamingo", "Playa Flamingo","10.437925116180041","-85.78429108500035");
        playas[3] = new PlayaModel("plHermosa", "Playa Hermosa","10.575381104040826","-85.67877705813504");
        playas[4] = new PlayaModel("plOcotal", "Playa Ocotal","10.546213833552857","-85.72246527110377");
        playas[5] = new PlayaModel("plReal", "Playa Real","10.387875345572505","-85.83857421820362");
        playas[6] = new PlayaModel("plTamarindo", "Tamarindo","10.302535200188062","-85.8409023580492");
        playas[7] = new PlayaModel("plDanta", "Playa Danta","10.480421792068348","-85.78635964995759");
        playas[8] = new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204");
        playas[9] = new PlayaModel("plSamara", "Playa Samara","9.880298753716504","-85.51840426688355");
        playas[10] = new PlayaModel("plNosara", "Playa Nosara","9.97025562456834","-85.68165428595007");
        playas[11] = new PlayaModel("plPuntaUva", "Playa Punta Uva","9.637984341619502","-82.6954542869789");
        playas[12] = new PlayaModel("plCahuita", "Cahuita","9.734594876270107","-82.8444780179702");
        playas[13] = new PlayaModel("plPuertoViejo", "Playa Puerto Viejo","9.659201924905283","-82.75156620844119");
        playas[14] = new PlayaModel("plManzanillo", "Playa Manzanillo","9.633282466833355","-82.661755084094");
        playas[15] = new PlayaModel("plCocles", "Playa Cocles","9.648314751381818","-82.73259428752297");
        playas[16] = new PlayaModel("plChiquita", "Playa Chiquita","9.64087730217948","-82.7092247841809");
        playas[17] = new PlayaModel("plNegra", "Playa Negra","10.19430027919836","-85.83031305709804");
        playas[18] = new PlayaModel("plUvita", "Playa Uvita","9.151653269739114","-83.74008633232361");
        playas[19] = new PlayaModel("plSantaTeresa", "Playa Santa Teresa","9.642574635920075","-85.16880518012282");
        playas[20] = new PlayaModel("plMontezuma", "Playa Montezuma","9.657065480193081","-85.06392011696835");
        playas[21] = new PlayaModel("plJaco", "Playa Jaco","9.613094176046152","-84.62929500874989");
        playas[22] = new PlayaModel("plPavones", "Playa Pavones","8.396069447060002","-83.138114755097");
        playas[23] = new PlayaModel("plBlanca", "Playa Blanca","10.062242835691857","-84.95590345973088");
        playas[24] = new PlayaModel("plTambor", "Playa Tambor","9.733542034542914","-85.01587110251006");
        playas[25] = new PlayaModel("plCuevas", "Playa Cuevas","9.594509707412833","-85.14363615234333");
        return playas;
    }

    private void agregarArcos(){

        this.listaVertices.agregarArco(
                "plConchal",
                new NodoArco(new PlayaModel("plTambor", "Playa Tambor","9.733542034542914","-85.01587110251006"), 150)
        );
        costosAnteriores.add(new NodoDijkstra(150, "plConchal","plTambor"));
        this.listaVertices.agregarArco(
                "plConchal",
                new NodoArco(new PlayaModel("plPavones", "Playa Pavones","8.396069447060002","-83.138114755097"), 200)
        );
        costosAnteriores.add(new NodoDijkstra(200, "plConchal","plPavones"));
        this.listaVertices.agregarArco(
                "plPavones",
                new NodoArco(new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"), 100)
        );
        costosAnteriores.add(new NodoDijkstra(100, "plPavones","plDantita"));
        this.listaVertices.agregarArco(
                "plDantita",
                new NodoArco(new PlayaModel("plManzanillo", "Playa Manzanillo","9.633282466833355","-82.661755084094"), 25)
        );
        costosAnteriores.add(new NodoDijkstra(25, "plDantita","plManzanillo"));
        this.listaVertices.agregarArco(
                "plManzanillo",
                new NodoArco(new PlayaModel("plTamarindo", "Tamarindo","10.302535200188062","-85.8409023580492"), 300)
        );
        costosAnteriores.add(new NodoDijkstra(300, "plManzanillo","plTamarindo"));
        this.listaVertices.agregarArco(
                "plTamarindo",
                new NodoArco(new PlayaModel("plFlamingo", "Playa Flamingo","10.437925116180041","-85.78429108500035"), 175)
        );
        costosAnteriores.add(new NodoDijkstra(200, "plTamarindo","plFlamingo"));
        this.listaVertices.agregarArco(
                "plFlamingo",
                new NodoArco(new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"), 250)
        );
        costosAnteriores.add(new NodoDijkstra(250, "plFlamingo","plDantita"));

        this.listaVertices.agregarArco(
                "plTambor",
                new NodoArco(new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"), 500)
        );
        costosAnteriores.add(new NodoDijkstra(500, "plTambor","plDantita"));

        this.listaVertices.agregarArco(
                "plTambor",
                new NodoArco(new PlayaModel("plTamarindo", "Tamarindo","10.302535200188062","-85.8409023580492"), 200)
        );
        costosAnteriores.add(new NodoDijkstra(200, "plTambor","plTamarindo"));

    }


    public ArrayList<InfoArcos> generarArcos(){

        ArrayList<InfoArcos> temp = new ArrayList<InfoArcos>();
        temp.add(new InfoArcos(new PlayaModel("plConchal", "Playa conchal","10.39971650735049","-85.81430567532414"),
                new PlayaModel("plTambor", "Playa Tambor","9.733542034542914","-85.01587110251006"), 150)
        );
        temp.add(new InfoArcos(new PlayaModel("plConchal", "Playa conchal","10.39971650735049","-85.81430567532414"),
                new PlayaModel("plPavones", "Playa Pavones","8.396069447060002","-83.138114755097"), 200)
        );
        temp.add(new InfoArcos(new PlayaModel("plPavones", "Playa Pavones","8.396069447060002","-83.138114755097"),
                new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"), 100)
        );
        temp.add(new InfoArcos(new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"),
                new PlayaModel("plManzanillo", "Playa Manzanillo","9.633282466833355","-82.661755084094"), 25)
        );
        temp.add(new InfoArcos(new PlayaModel("plManzanillo", "Playa Manzanillo","9.633282466833355","-82.661755084094"),
                new PlayaModel("plTamarindo", "Tamarindo","10.302535200188062","-85.8409023580492"), 300)
        );
        temp.add(new InfoArcos(new PlayaModel("plTamarindo", "Tamarindo","10.302535200188062","-85.8409023580492"),
                new PlayaModel("plFlamingo", "Playa Flamingo","10.437925116180041","-85.78429108500035"), 175)
        );
        temp.add(new InfoArcos(new PlayaModel("plFlamingo", "Playa Flamingo","10.437925116180041","-85.78429108500035"),
                new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"), 250)
        );
        temp.add(new InfoArcos(new PlayaModel("plTambor", "Playa Tambor","9.733542034542914","-85.01587110251006"),
                new PlayaModel("plDantita", "Playa Dantita","10.48364873457308","-85.79184737217204"), 500)
        );

        temp.add(new InfoArcos(new PlayaModel("plTambor", "Playa Tambor","9.733542034542914","-85.01587110251006"),
                new PlayaModel("plTamarindo", "Tamarindo","10.302535200188062","-85.8409023580492"), 200)
        );

        return temp;


    }
    private int hashing(String nombrePlaya){
        return (nombrePlaya.length() % 13);
    }


    public PlayaModel buscarPlaya(String nombrePlaya){
        int indice = this.hashing(nombrePlaya);
        PlayaModel playa = this.hash.getValor(indice, nombrePlaya);
        return playa;
    }

    public PlayaModel buscarPlayaById(String idPlaya){
        int indice = this.hashing(idPlaya);
        PlayaModel playa = this.hash.getByID(indice, idPlaya);
        return playa;
    }

    private void agregarPlayas(){
        PlayaModel[] playas = this.generatePlayas();

        for(int i = 0; i< playas.length; i++){
            DatoHash nuevo = new DatoHash(playas[i]);
            this.hash.insertar( this.hashing(playas[i].getNombre()), nuevo);
            this.listaVertices.agregarVertice(playas[i].getIdPlaya(), playas[i]);
        }
    }

    private DireccionModel crearDireccion(NodoDijkstra r){

        DireccionModel direccion = new DireccionModel(this.listaVertices.buscarPlaya(r.getVertice()), r.getCosto());
        return direccion;
    }

    public NodoDijkstra buscarDireccion(String idPlayaDestino){
        NodoDijkstra result = new NodoDijkstra();

        for(NodoDijkstra c: this.costosAnteriores){
            if(c.getVertice().equals(idPlayaDestino)){
                result = c;
            }
        }
        return result;
    }

    public ArrayList<DireccionModel> getCaminoMinimo(String idPlayaInicio, String idPlayaDestino){

        ArrayList<DireccionModel> result = new ArrayList<DireccionModel>();

        String d = idPlayaDestino;

        do{
            NodoDijkstra r = this.buscarDireccion(d);
            PlayaModel tempPlaya = this.listaVertices.buscarPlaya(r.getVertice());
            DireccionModel direccion = new DireccionModel(tempPlaya, r.getCosto());
            result.add(direccion);

            d = r.getVerticeAnterior();
        }while(!d.equals(idPlayaInicio));

        return result;
    }
}
