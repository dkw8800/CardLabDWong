package com.company;
import java.util.ArrayList;
public class Deck {
    ArrayList<Cards> unDealt;
    ArrayList<Cards> Dealt;

    public Deck(ArrayList<Cards> ranks, ArrayList<Cards> suits, ArrayList<Cards> pointvalues)
    {

    }

    public boolean isEmpty()
    {
        if(unDealt.size == 0)
        {
            return true;
        }
        else return false;
    }

    public int size()
    {
        return unDealt.size();
    }

    public void shuffle()
    {
        
    }
}
