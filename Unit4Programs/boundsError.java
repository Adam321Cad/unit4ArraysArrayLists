
public class boundsError
{
    public static void main(String[] args)
    {
        int[] scores = new int[10];
        
        for(int i = 1; i < scores.length; i++)
        {
            scores[i] = i;
        }
    }
}