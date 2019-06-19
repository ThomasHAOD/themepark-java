package VisitorStuff;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> iRevieweds;


    public ThemePark(){
        iRevieweds = new ArrayList<IReviewed>();
    }

    public void addIReviewed(IReviewed reviewedThing){
        iRevieweds.add(reviewedThing);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.iRevieweds;
    }
}
