import java.util.Scanner;

public class Conversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Decimal => ");
        int decimal = input.nextInt();
        convert(decimal);
    }

    public static void convert(int decimal)
    {
        Stack stack = new Stack();
        do 
	{
            int binary = 0;
            binary = decimal % 2;
            stack.push(binary);
            decimal = decimal /2 ;

        }
	while(decimal > 0);

        System.out.print("Binary = ");
    }
}