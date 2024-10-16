public abstract class Computador{


    abstract void Prender();
}
class Lenovo extends Computador {
    @Override
    void Prender(){
        System.out.println("Prendiendo el computador. ");
    }

}

