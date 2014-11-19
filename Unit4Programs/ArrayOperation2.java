public class ArrayOperation2{
    int c = 2;
    private int[] values = new int[10];
    
    public void enter(){
        for (int i = 1; i<10;i++){
            values[i] = i;
        }
    }
    public void swapFirstAndLast()
    {
        int num = 0;
        values[0] = num;
        int num2 = 0;
        num2 = values[values.length-1];
        values[0] =num2;
        values[values.length-1] = num;
    
    }
    
    public void shift()
    {
        int num = values[values.length-1];
     
        for (int i = 0; i<values.length; i++)
        {
            int count = values[i];
            values[i] = num;
            num = count;
            
        }
        
    }
    
    public void larger()
    {
        for(int i = 1; i<values.length-1; i++)
        {
            if(values[i-1] > values[i+1])
            {
                values[i] = values[i-1];
            }else{
                values[i] = values[i+1];
            }
            
        }
        
    }
    public static void main(String[] args)
    {
        ArrayOperation2 o = new ArrayOperation2();
        o.enter();
        o.swapFirstAndLast();
        o.shift();
        o.larger();
    }

}