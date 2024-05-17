public class Addition {
     public int a;
     public int b;
     public Addition(int a,int b){
         this.a=a;
         this.b=b;
     }
     public int add(){
         Addition addition=new Addition(8,9);
         int total=a+b;
         System.out.println(total);
         return total;
    }
}