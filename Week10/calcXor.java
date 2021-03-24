import java.io.*;

public class calcXor
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("~ Emulador | Compuerta Lógica XOR ~\n\nIngresa el valor de A: ");
        String valA = bf.readLine();
        System.out.print("Ingresa el valor de B: ");
        String valB = bf.readLine();
        // funcion XOR
        compXor(valA, valB);
    }

    public static void compXor(String valA, String valB)
    {
        String aux = valA + valB;
        String result = "";
        if(aux.equals("00") || aux.equals("11")){
            result = "0";
        } else if (aux.equals("01") || aux.equals("10")){
            result = "1";
        } else { }
        System.out.println("\nLa Tabla de la compuerta lógica XOR es:");
        System.out.println("\n| INPUT |  OUTPUT |\n| A | B | A XOR B |\n| "
             + valA + " | " + valB + " |    " + result + "    |" );
    }
}