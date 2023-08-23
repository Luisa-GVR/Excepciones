import java.util.Scanner;

public class PruebaExcepcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un valor para obtener su raiz cuadrada");
        double valorRaiz = Double.parseDouble(sc.nextLine());

        try{
            if (valorRaiz<0){
                throw new NumeroNegativoExcepcion("Se ha ingresado un numero negativo");
            } else {
                System.out.println(Math.sqrt(valorRaiz));
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Valor ingresado no es un número válido.");
        }
        catch (NumeroNegativoExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}
