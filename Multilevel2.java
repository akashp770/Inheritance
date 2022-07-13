            //Multilevel Inheritance  with Private Var
class A{
   private int x;
   public void setx(int x) {
       this.x=x;
   }
   public int getx() {
       return x;
   }
    public void showx() {
        System.out.println(x);
    }
}
class B extends A{
    private int y;
    public void sety(int y) {
        this.y=y;
    }
    public int gety(){
        return y;
    }
    public void showy() {
        System.out.println(y);
        
    }
}
class C extends B {
    private int z;
    public void setz(int z) {
        this.z=z;
    }
    public int getz() {
        return z;
    }
    public void showz(){
        System.out.println(z);
    }
    
}
class D extends C {
    public void sum() {
        int s=getx() +gety() +getz();
        System.out.println("Sum is: "+s);
    }
}


class Mi2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        D d = new D();
        
        d.setx(100);
        d.sety(200);
        d.setz(300);
        d.showx();
        d.showy();
        d.showz();
        d.sum();
        
    }
}
