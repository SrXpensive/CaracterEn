public class Main {
    public static void main(String[] args) {
        String palabra = Leer.leerTexto("Introduce una palabra: ");
        int posicion = Leer.leerEntero("Introduce una posición: ");
        try{
            System.out.println(caracterEn(palabra,posicion));
        }catch(FueraDeRango error){
            System.out.println(error.getMessage());
        }
    }
    public static String caracterEn(String palabra, int posicion) throws FueraDeRango{
        String [] letras  = palabra.split("");
        if(posicion>letras.length-1){
            throw new FueraDeRango("No hay tantas letras en la palabra");
        }
        if(posicion<=0){
            throw new FueraDeRango("La posición no puede ser negativa");
        }
        return letras[posicion-1];
    }
}
