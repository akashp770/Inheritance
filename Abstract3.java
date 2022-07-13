            //Abstract Class

abstract class A {
    abstract void hello();
	public void hello2() {
		System.out.println("Non-Abstract Method");
	}
	A() {
	    System.out.println("Parent Constructor");
	}
}
class B extends A {
    void hello() {
        System.out.println("Hello its B... Abstract Method");
    }
    B() {
        System.out.println("Child Constructor");
    }
    
}

class Ab {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        
        A ao =new B();
        ao.hello();
        
       
        ao.hello2();
    }
}
