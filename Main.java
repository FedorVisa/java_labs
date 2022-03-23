public class Main {
 
   public static void main(String[] args) {
        Matrix a = new Matrix(3);
        a.set(0,0,0);
        a.set(1,2,0);
        //  a.set(2,2,0);
        Matrix b = a;
       a=b.doMiracleDiag(1);
       
       System.out.println(a);
       System.out.println(b);
    
         




   }
} 