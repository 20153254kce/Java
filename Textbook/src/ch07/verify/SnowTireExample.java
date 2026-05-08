package ch07.verify;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire; //실제로 가리키고 있는 객체는 여전히 SnowTire

        snowTire.run();
        tire.run();
    }
}