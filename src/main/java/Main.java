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
        //System.out.println(control.mostrarArticulos());

        //System.out.println(control.buscarIndexPorId(2));

        System.out.println(control.mostrarArrayList(control.buscarPorAutor("Maria")));

        //System.out.println(control.buscarPorId(3).toString());

        //System.out.println(control.buscarPorTitulo("Pinturillo").toString());

        //System.out.println(control.mostrarArticulo(1));

        //control.baja(2);

        //System.out.println(control.mostrarArticulos());
    }

}
