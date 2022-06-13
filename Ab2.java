            //Abstract Class

abstract class A {
    abstract void hello();
	public void hello2() {
		System.out.println("Non-Abstract Method");

	}
}
class B extends A {
    void hello() {
        System.out.println("Hello its B...");
    }
    
}
class C extends A {
    void hello() {
        System.out.println("Hello its C....");
    }
}
class Ab2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        
        A ao =new B();
        ao.hello();
        
        A ao2 = new C();
        ao2.hello();
    }
}