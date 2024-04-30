class Libro{
    String autor, titulo;
    int isbn, numPag;

    public Libro(){
    }

    public void informarLibro(){

        System.out.println("ISBM: " + isbn);
        System.out.println("Nombre del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPag);

    }

    
}