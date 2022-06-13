					//Hierachical Inheritance
            //Method Overriding -Same method name with same Parameter
            //Polymorphism : Many form
class A{
  public void show(int x, int y) {
      int z=x+y;
      System.out.println(z);
  }
}
class B extends A{
    public void show(int x,int y) {
        int z=x-y;
        System.out.println(z);
    }
}
class C extends B {
   public void show(int x,int y) {
        int z=x*y;
        System.out.println(z);
    }
    
}
class D extends C {
     public void show(int x,int y) {
        int z=x/y;
        System.out.println(z);
    }
}


class Hir {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       A p[]={new A(),new B(),new C(),new D()}; 			//new COncept
       
       for (A q:p) {
           q.show(10,20);
       }
       
    }
}					