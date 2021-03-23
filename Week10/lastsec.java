import java.time.LocalDateTime;

import javax.swing.text.Segment;

public class lastsec
{
    public static void main(String[] args)
    {
        LocalDateTime ahora = LocalDateTime.now();
        int horas = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();

        printMessage(horas, minutos, segundos);
    }
    
    public static void printMessage(int m, int n, int p)
    {
        double segDelDia = m*Math.pow(60, 2) +  n*60 + p;
        double result = 86400 - segDelDia;
        System.out.println("Restan solo : " + (int)result + " segundos para terminar el día");
    }
}