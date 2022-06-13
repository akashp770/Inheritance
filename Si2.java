            //Single Inheritance while Private is there
class A{
    private int i, j;
    public void setij(int i, int j) {
        this.i=i;
        this.j=j;
    }
    public int geti() {
        return i;
    }
    public int getj() {
        return j;
    }
    
    public void showij() {
        System.out.println(i);
        System.out.println(j);
    }
    
}
class B extends A{
    public int k;
    public void showk() {
        System.out.println(k);
    }
    public void sum() {
        int s = geti()+ getj() +k;
        System.out.println("Sum is :" +s);
    }
}
class Si2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         B bo = new B();
         
       bo.setij(10,20);
         bo.showij();
         bo.k=30;
         bo.showk();
         bo.sum();
    }
}