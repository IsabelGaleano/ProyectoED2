function initMap(playas, arcos) {
    const map = new google.maps.Map(document.getElementById("map"), {
      zoom: 7,
      center: new google.maps.LatLng(9.927792, -84.091033),
      mapTypeId: google.maps.MapTypeId.ROADMA,
    });

    // Creación de vertices
    for (var i = 0; i < playas.length; ++i) {

        new google.maps.Marker({
            'map' : map,
            'position' : new google.maps.LatLng(playas[i].latitud, playas[i].longitud),
            'title' : playas[i].nombre
        });

    }

    //Creación de arcos 
    for (var i = 0; i < arcos.length; ++i) {

        const flightPlanCoordinates = [
            { lat: parseFloat(arcos[i].inicio.latitud), lng: parseFloat(arcos[i].inicio.longitud) },
            { lat: parseFloat(arcos[i].fin.latitud), lng: parseFloat(arcos[i].fin.longitud) }
          ];
 
          const flightPath = new google.maps.Polyline({
            path: flightPlanCoordinates,
            geodesic: true,
            strokeColor: "#FF0000",
            strokeOpacity: 1.0,
            strokeWeight: 2,
          });

          flightPath.setMap(map);
    }


    fillSelectSearch(playas);
    console.log(playas);
    console.log(arcos);

}

const fillSelectSearch = (playas) => {
    for (var i = 0; i < playas.length; ++i) {

        var item = `<option value="${playas[i].idPlaya}">${playas[i].nombre}</option>`;
        document.getElementById('selectBusqueda').insertAdjacentHTML("beforeend", item);
        document.getElementById('selectInicio').insertAdjacentHTML("beforeend", item);
        document.getElementById('selectFinal').insertAdjacentHTML("beforeend", item);
    }
}


const obtenerPlayas = () => {
    let response;
    fetch("http://localhost:8080/api/Grafo/obtenerPlayas",{
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        }
    })
        .then(
            response => {
                return response.json();
            }
        )
        .then(
            json => {
                
            
              obtenerArcos(json);
            }
        )
}

const obtenerArcos = (playas) => {
    let response;
    fetch("http://localhost:8080/api/Grafo/obtenerArcos",{
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        }
    })
        .then(
            response => {
                return response.json();
            }
        )
        .then(
            json => {
        
              initMap(playas, json);
            }
        )
}

const buscarPlaya = () => {
    let nombrePlaya = document.getElementById("selectBusqueda").innerText;
    var select = document.getElementById("selectBusqueda");
    var selected = select.options[select.selectedIndex].text;
    fetch(`http://localhost:8080/api/Grafo/buscarPlaya/${selected}`,{
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        }
    })
        .then(
            response => {
                return response.json();
            }
        )
        .then(
            json => {
                
                
              console.log(json);
              initializeMapBusqueda(json);
            }
        )
}

const buscarCamino = () => {
    var selectInicio = document.getElementById("selectInicio").value;
    var selectFin = document.getElementById("selectFinal").value;

    fetch(`http://localhost:8080/api/Grafo/buscarCamino/${selectFin}-${selectInicio}`,{
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        }
    })
        .then(
            response => {
                return response.json();
            }
        )
        .then(
            json => {
                
                
              console.log(json);
              initMapCamino(json);
            }
        )
}

function initMapCamino(playas) {
    const map = new google.maps.Map(document.getElementById("map"), {
      zoom: 8,
      center: new google.maps.LatLng(9.927792, -84.091033),
      mapTypeId: google.maps.MapTypeId.ROADMA,
    });

    //Creación de marcadores
    for (var i = 0; i < playas.length; ++i) {

        new google.maps.Marker({
            'map' : map,
            'position' : new google.maps.LatLng(playas[i].playa.latitud, playas[i].playa.longitud),
            'title' : playas[i].nombre
        });

    }

    //Creación de arcos 
    const flightPlanCoordinates = [];

    for (var i = 0; i < playas.length; ++i) {

        flightPlanCoordinates.push(new google.maps.LatLng(
            parseFloat(playas[i].playa.latitud),
            parseFloat(playas[i].playa.longitud)
        ));
    }
    const flightPath = new google.maps.Polyline({
        path: flightPlanCoordinates,
        geodesic: true,
        strokeColor: "#FF0000",
        strokeOpacity: 1.0,
        strokeWeight: 2,
    });

      flightPath.setMap(map);

}

function initializeMapBusqueda(playa) {
    console.log(playa);
    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 17,
        center: new google.maps.LatLng(9.927792, -84.091033),
        mapTypeId: google.maps.MapTypeId.ROADMA,
      });

    var vMarker = new google.maps.Marker({
        position: new google.maps.LatLng(playa.latitud, playa.longitud),
        draggable: false
    });
    map.setCenter(vMarker.position);
    vMarker.setMap(map);
}


window.addEventListener('load', e => {
  obtenerPlayas();
});
  