package Sensors;


public class Pair<F, S> {
    public  F f;
    public  S s;

    public Pair(F f, S s) {
        this.f= f;
        this.s= s;
    }
    public String toString()
    {
        return (f + ", " + s );
    }


}
