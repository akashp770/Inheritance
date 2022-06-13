					// Interface
interface A {
    public void show() ;       //It is a Abstract Method
   
}
interface B         //we also write as   "interface B EXTENDS A"
{
    public void show2();
}
class C implements A,B          //also Write " implements B"
{
    public void show (){
    System.out.println("Hello  Its A....");
}

    public void show2() {
        System.out.println("Helllo Its B....");
    }
}
class Inter{
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        
        C co = new C();
        co.show();
        co.show2();
    }
}