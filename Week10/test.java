public class test
{
    public static void main(String[] args)
    {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + "\n");
        }
        printMessage("You fix the errors!");
    }

    public static void printMessage(String msg)
    {
        System.out.println(msg);
    }
}