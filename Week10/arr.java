// ojo ahora hay que especificar el tipo de dato que almacenar la lista <> si no tira error de recompilar
import java.util.ArrayList;

public class arr
{
    public static void main(String[] args)
    {
       ArrayList<Integer> l = new ArrayList<Integer>(2);
       l.add(1);
       l.add(1);
       l.add(1);

        System.out.println(l.size());
    }

}