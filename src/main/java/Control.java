import java.util.ArrayList;

public class Control {
    private ArrayList<Articulo> articulos;

    public Control(){
        articulos = new ArrayList<Articulo>();
    }
    public void alta(Articulo articulo){
        articulos.add(articulo);
    }
    public Articulo baja(int id){
        return articulos.remove(buscarIndexPorId(id));
    }

    public int buscarIndexPorId(int id){
        return articulos.indexOf(buscarPorId(id));
    }

    public Articulo buscarPorId(int id){
        for (Articulo a : articulos){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public Articulo buscarPorTitulo(String titulo){
        for(Articulo a : articulos){
            if (a.getTitulo() == titulo)
                return a;
        }
        return null;
    }
    public ArrayList<Articulo> buscarPorAutor(String autor){
        var articulosPorAutor = new ArrayList<Articulo>();
        for (Articulo a : articulos){
            if (a.getAutor() == autor)
                articulosPorAutor.add(a);

        }
        return articulosPorAutor;
    }
    public String mostrarArticulos(){
        return mostrarArrayList(articulos);
    }

    public String mostrarArticulo(int id){
        return buscarPorId(id).toString();
    }

    public String mostrarArrayList(ArrayList<Articulo> arrayList){
        String cadena = "";
        for (Articulo a : arrayList)
            cadena += a.toString() + "\n" ;
        return cadena;
    }
}
