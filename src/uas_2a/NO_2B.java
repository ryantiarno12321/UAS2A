package uas_2a;

public class NO_2B {
    public static void main(String[] args){
                NO_2A antrian = new NO_2A(5);
                antrian.enqueue(9);
                antrian.display();
                antrian.enqueue(8);
                antrian.display();              
                System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
                System.out.println("mukhammad ryantiarno priyadi");
                antrian.display(); 
                System.out.println("");
                antrian.enqueue(7);
                antrian.display();
                antrian.enqueue(6);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.dequeue());
        
    }
    
}
