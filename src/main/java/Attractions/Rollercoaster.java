package Attractions;

import VisitorStuff.Visitor;

public class Rollercoaster extends Attraction {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 11 && visitor.getHeight() > 144){
            return true;
        } else {
            return false;
        }
    }
}
