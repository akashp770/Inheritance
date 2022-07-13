            //Multilevel Inheritance 
class A{
    public int x;
    public void showx() {
        System.out.println(x);
    }
}
class B extends A{
    public int y;
    public void showy() {
        System.out.println(y);
        
    }
}
class C extends B {
    public int z;
    public void showz(){
        System.out.println(z);
    }
    
}
class D extends C {
    public void sum() {
        int s=x+y+z;
        System.out.println("Sum is: "+s);
    }
}


class Mi {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        D d = new D();
        
        d.x=100;
        d.y=200;
        d.z=300;
        d.showx();
        d.showy();
        d.showz();
        d.sum();
        
    }
}
