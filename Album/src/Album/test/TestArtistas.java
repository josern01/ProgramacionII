
package Album.test;
import  Album.dto.*;
import java.util.ArrayList;
import java.util.List;


public class TestArtistas {
     public static void main(String[] args) {

        Artista Artista1 = new Artista();
        Artista1.setNombreArtista("PostMalone");
        Artista1.setNombre("Austin");
        Artista1.setApellidoPaterno("Richard");
        Artista1.setApellidpMaterno("Post");
        Artista1.setId(2);

        Cancion cancion1 = new Cancion();
        cancion1.setCompositor("PostMalone");
        cancion1.setFechalanzamineto(2018);
        cancion1.setGenero("Trap");
        cancion1.setNombre("RockStar");
        cancion1.setId(1);

       

        Album album1 = new Album();
        album1.setId(1);
        album1.setNombre("Beerbongs & Bentleys");
        album1.setFechalanzamineto(2018);

        List<Artista> listaArtistas = new ArrayList<>();
        listaArtistas.add(Artista1);

        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(Artista1);

        List<Cancion> listacancion = new ArrayList<>();
        listacancion.add(cancion1);

        listaArtistas.stream().map((artista) -> {
            System.out.println("Nombre: " + artista.getNombre() + " " + artista.getApellidoPaterno() + " " + artista.getApellidpMaterno());
             return artista;
         }).forEachOrdered((artista) -> {
             System.out.println("Nombre artístico: " + artista.getNombreArtista());
         });

        System.out.println(listacancion);
        System.out.println(listaPersona);
    }

}
    

