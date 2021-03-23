import java.io.*;

public class calcHipo
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa el valor del primer cateto: ");
        String cat1 = bf.readLine();
        System.out.print("Ingresa el valor del segundo cateto: ");
        String cat2 = bf.readLine();

        printResult(cat1, cat2);
    }

    public static void printResult(String ladoA, String ladoB )
    {
        double result = Math.sqrt(Math.pow(Integer.parseInt(ladoA), 2) + Math.pow(Integer.parseInt(ladoB), 2));
        System.out.println("El valor de la hipotenusa para este triangulo es de: " + String.format("%.2f", result));
    }
}