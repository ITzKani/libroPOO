import java.util.Scanner;

class MainLibro{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa el ISBN del libro: ");
        int isbn = fn.nextInt();

        System.out.print("Ingresa el titulo del libro: ");
        fn.nextLine();
        String titulo = fn.nextLine();

        System.out.print("Ingresa el nombre del autor: ");
        String autor = fn.nextLine();

        System.out.print("Ingrea el numero de paginas: ");
        int numPag = fn.nextInt();

        Libro l1 = new Libro();

        l1.isbn = isbn;
        l1.titulo = titulo;
        l1.autor = autor;
        l1.numPag = numPag;

        l1.informarLibro();


        

    }
}