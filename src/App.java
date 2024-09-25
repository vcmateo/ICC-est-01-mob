public class App{
    public static void main(String[] args) throws Exception {
       Metodos MetodosOrdenamiento=new  Metodos();
       int[] arreglo={5,7,30,12,9};
       int[] arregloOrdenado=MetodosOrdenamiento.sortByBubble(arreglo);
       MetodosOrdenamiento.printArreglo(arregloOrdenado);

       String cadena="este es un ejemplo de texto para ordenar";
       String[] palabras = cadena.split("");
       String[] palabrasOrdenadas=MetodosOrdenamiento.sortBubblePalabras(palabras);
       MetodosOrdenamiento.printArreglo(palabrasOrdenadas);
    }
}