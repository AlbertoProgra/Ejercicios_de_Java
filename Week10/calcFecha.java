import java.io.*;
import java.util.*;
import java.time.LocalDateTime;

public class calcFecha
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        LocalDateTime tiempo = LocalDateTime.now();
        
        String [] arr = new String[3];
        int mes = tiempo.getMonthValue();
        int dia = tiempo.getDayOfMonth();
        
        System.out.print("~ ¿ Es tu cumpleaños ? ~\n\nIngresa tu nombre: ");
        String valA = bf.readLine();
        System.out.print("Ingresa tu apellido: ");
        String valB = bf.readLine();
        System.out.print("Ingresa tu fecha de cumpleaños [YYYY-MM-DD]: ");
        String valC = bf.readLine();
        Scanner sc = new Scanner(valC);
        sc.useDelimiter("-");

        int cont = 0;
        while (sc.hasNext())
        {
            arr[cont] = sc.next();
            cont++;
        }
        
        fechaCum(valA, valB, arr[1], arr[2], mes, dia, arr);
    }

    public static void fechaCum(String nombre, String apellido, String val3, String val4, int mes, int dia, String [] arr)
    {
       int auxDia = Integer.parseInt(val4);
       int aux = 0;
       if(val3.matches("0[1-9]")){
            aux = Integer.parseInt(Character.toString(val3.charAt(1)));
       } else {
           aux = Integer.parseInt(val3);
       }
       if((aux == mes) && (auxDia == dia)){
           System.out.println("\n¡¡ Feliz Cumpleaños " + nombre + " " + apellido + " !!");
       } else {
           System.out.println("\n" +"¡ Hola " + nombre + " " + apellido + " !\nSabes, aún debes esperar un poco más para que pueda celebrar tu cumpleaños. :)");
       }
       
    }
}