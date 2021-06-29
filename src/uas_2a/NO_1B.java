package uas_2a;

public class NO_1B {
    public static void main (String[] args){
        NO_1A tumpukan = new NO_1A(5);
        tumpukan.push(1);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("nilai teratas = "+tumpukan.peek());
        System.out.println("mukhammad ryantiarno priyadi ");
        System.out.println("nilai yang dihapus= "+tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        
        }
    
}
