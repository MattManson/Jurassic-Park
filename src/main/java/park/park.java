package park;

import park.Visitors.Guest;
import park.dinosaurs.Dinosaur;

import java.util.ArrayList;
import java.util.Collections;

public class Park {

    private String name;
    private ArrayList<Guest> visitors;
    private ArrayList<Paddock> paddocks;
    private ArrayList<Dinosaur> allDinosaurs;
    private ArrayList<Dinosaur> rampagingDinosaurs;

    public Park(String name){
        this.name = "Jurassic Park";
        this.visitors = new ArrayList<>();
        this.paddocks = new ArrayList<>();
        this.allDinosaurs = new ArrayList<>();
        this.rampagingDinosaurs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumVisitors() {
        return visitors.size();
    }

    public void addVisitor(Guest guest){
        visitors.add(guest);
    }

    public int getNumPaddocks() {
        return paddocks.size();
    }

    public void addPaddock(Paddock paddock){
        paddocks.add(paddock);
    }

    public int getNumAllDinosaurs() {
        return allDinosaurs.size();
    }

    public void addDino(Dinosaur dino, Paddock paddock){
        paddock.addDino(dino);
        allDinosaurs.add(dino);
    }

    public Paddock randomPaddock(){
        Collections.shuffle(paddocks);
        return paddocks.get(0);
    }

    public Dinosaur removeRandomDino(){
        Paddock paddock = randomPaddock();
        if (paddock.isEmpty()){ return null; }
        ArrayList <Dinosaur> possibleDinos = paddock.contents;
        Collections.shuffle(possibleDinos);
        Dinosaur ranDino = possibleDinos.remove(0);
        return ranDino;
    }

    public Guest randomGuest(){
        Collections.shuffle(visitors);
        return visitors.get(0);
    }

    public String randomRampage(){
        Dinosaur rampagingDino = removeRandomDino();
        if(rampagingDino == null){return "all well";}
        rampagingDino.enrage(randomGuest());

        rampagingDinosaurs.add(rampagingDino);
        return rampagingDino.getName() + " the " + rampagingDino.getBreed() + " is on a rampage!";
    }

    public boolean ifNoRampage(){
        return this.rampagingDinosaurs.size() == 0;
    }

    public int countRampagingDino(){
        return this.rampagingDinosaurs.size();
    }

    public String checkIn(Guest guest){
        if(!ifNoRampage()){
            return "no access - dino on the rampage!";
        }
        else
        visitors.add(guest);
        return guest.getName() + " has entered the park.";
    }
}
