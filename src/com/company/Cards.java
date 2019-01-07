package com.company;

public class Cards {
    String rank;
    String suit;
    int pointValue;

    public Cards(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String returnrank()
    {
        return this.rank;
    }

    public String returnsuit()
    {
        return this.suit;
    }

    public int pointValue()
    {
        return this.pointValue;
    }

    public boolean equals(Cards otherCard)
    {

    }

    public String toString()
    {

    }
}
