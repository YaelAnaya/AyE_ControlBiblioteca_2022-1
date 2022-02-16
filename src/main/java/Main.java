public class Main {
    public static void main(String[] args) {
        var control = new Control();
        control.alta(new Interactivo(1, "Mariano", 1990,
                                "Pinturillo", "PG-12", "ES", 12,
                             "PC", "Juego Online", "NA", 120));

        control.alta(new Texto(2, "Paola", 1991, "POO", "Adolescente",
                        "ES", "Planeta", 234, "Libro", "Educativo",
                   "Carta"));

        control.alta(new Multimedia(3, "Maria", 2012, "Sin contexto", "C",
                              "ES", "Drama", "Pelicula", "2:30 Horas"));
        control.alta(new Multimedia(4, "Maria", 2022, "Sin contexto - 2", "C",
                "ES", "Drama", "Pelicula", "2:20 Horas"));


        System.out.println("\n[ Listados de articulos en el inventario ]\n\n" + control.mostrarArticulos());

        System.out.println("\n[ Indice del articulo con Id = 2 ]: " + control.buscarIndexPorId(2) + "\n");

        System.out.println("\n[ Articulos con Maria como autor ]\n\n" + control.mostrarArrayList(control.buscarPorAutor("Maria")));

        System.out.println("\n[ Articulo con Id = 3 ]\n\n" + control.buscarPorId(3).toString());

        System.out.println("\n\n [Articulo con titulo = Pinturillo ]\n\n" + control.buscarPorTitulo("Pinturillo").toString());

        System.out.println("\n\n [Articulo con Id = 1 ]\n\n" + control.mostrarArticulo(1));

        System.out.println("\n\n [Baja del articulo con Id = 2 ]\n");
        control.baja(2);

        System.out.println("\n[ Listados de articulos en el inventario ]\n\n" + control.mostrarArticulos());
    }

}
