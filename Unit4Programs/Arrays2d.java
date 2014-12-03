public class Arrays2d{
    
    private int[][] table = 
    {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}
    };
    
    public Arrays2d()
    {
        
        
    }
    
    public void bla()
    {
        String str = "";
        
        for (int row=0; row< table.length; row++){
            for(int col = 0; col < table[row].length; col++){
                
                str+=table[row][col] +"\t";
                
            }
            str+="\n";
        }
        System.out.println(str);
    }
    
    public String extractRow(int row)
    {
        String str = "";
        
        //for(int col = 0; col<table[row].length; col++)
        //{
         //   str += table[row][col];
       // }
       
       for(int val: table[row])
       {
           str +=val+"\t";
           
       }
        return str;
    }
    
    public String extractCol(int col){
        String str="";
        
        for (int row = 0; row <table.length; row++)
        {
            str+= table[row][col]+"\n";
        }
        
        /*for(int[] rowOfInts:table)
        {
            str+=rowOfInts[col]+"\n";
        }
        */
        return str;
        
        
    }
    
    public static void main(String[] args){
        Arrays2d r = new Arrays2d();
        r.bla();
        System.out.println(r.extractRow(1));
        System.out.println(r.extractCol(1));
    }
}
