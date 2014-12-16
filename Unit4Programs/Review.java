public class Review{
    
    int val;
    
    public Review()
    {
        val = 7;
        this.val = 7;
        
        int val = 8;
        val = 9; //changes local variable
        this.val = 9; //changes instance variable val//
        //sampleMethod();
        //this.sampleMethod();
    }
    
    
    public static void main(String[] args){
    int x = 7;
    double y = 5.5;
    y = y+x;
    x = x +(int)y;
    
    //switch
    int switchValue = 2;
    switch(switchValue)
    {
        case 1:
        {
            System.out.println("value is 1");
            break;
        }
        case 2:
        {
            System.out.println("the value is 2");
            break;
        }
        case 3:
        {
        System.out.println("value is 3");
        break;
    }
    default:
    {
        System.out.println("none");
        break;
    }
    
    
   }
   



    



}
}
    