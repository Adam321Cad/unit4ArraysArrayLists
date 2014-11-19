class arrayOperations{
    public static void main(String[] args){
        int x[] = {8,4,5,21,7,9,18,2,100};
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[8]);
        System.out.println(x.length-1);
        for (int i = 0; i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("");
        for(int i=0; i<x.length;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (int i = x.length-1; i>=0; i--){
            System.out.print(x[i]+" ");
        }
        
        for (int i: x)
        {
            System.out.println(i);
        }
        
        
    }
}