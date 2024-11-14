package DesignPatterns;

public class FacadeDesignPattern {
    public  static void main(String[] args){

        HomeTheater homeTheater = new HomeTheater(new DVDPlayer(), new Projector(), new DimLight());
        homeTheater.startMovie();
    }
}

class DVDPlayer{
    void on(){
        System.out.println("DVD Player is turned on...");
    }
}
class Projector{
    void setUp(){
        System.out.println("Projector is all set...");
    }
}

class DimLight{
    void dimLight(){
        System.out.println("Light's are turned to dim...");
    }
}
class HomeTheater{
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private DimLight  dimLight;

    public HomeTheater(DVDPlayer dvdPlayer, Projector projector, DimLight dimLight){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.dimLight = dimLight;
    }

    public void startMovie(){
        dvdPlayer.on();
        projector.setUp();
        dimLight.dimLight();
        System.out.println("Movie Started...");
    }
}


