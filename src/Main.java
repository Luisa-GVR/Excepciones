import java.util.Scanner;

public class Main {

    public static char caracterEn(String lectTeclado, int valorBuscar) throws Exception {

        if (valorBuscar>0 && valorBuscar<lectTeclado.length()){
            return lectTeclado.charAt(valorBuscar);
        } else {
            throw new Exception("La posicion a buscar no se encuentra en la cadena");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la palabra que deseas buscar su posicion 7");
        String lectTeclado = sc.nextLine();

        try {
            char valor = caracterEn(lectTeclado,7);
            System.out.println(valor);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}