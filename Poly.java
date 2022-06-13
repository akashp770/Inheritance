            
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


class Poly {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        A ao =new A();
        B bo =new B();
        C co = new C();
        D d = new D();
        
    A ref;
		ref = ao;
		ref.show(10,20);
        
		ref=bo;
        ref.show(10,20);
       ref=co;
        ref.show(10,20);
        ref=d;
        ref.show(10,20);
        
        
    }
}