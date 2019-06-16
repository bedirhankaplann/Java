public class Fibonacci
{
    private int step;

    public Fibonacci(int step)
    {
        this.step = step;
    }
    public int getStep() 
    {
        return step;
    }
    public void setStep(int step) 
    {
        this.step = step;
    }
    public int calcFibo(int step)
    {
        if ( step == 0) //Ilk 1 ile basladigi icin return 0;
            return 1;
        else if ( step == 1) //Ikincide 1 le basladigi icin return 1;
            return 1;
        else //adım 1 ve 0 değilse adimi ve bir eksigi ile toplayacak.
            return calcFibo(step -1) + calcFibo(step - 2);
    }
}