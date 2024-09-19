package edu.grinnell.csc207.util;

public class Box<T> {

    /**
     * value stored in box
     */
    private T val;
    /**
     * Construtor
     * @param given_val value to be initially stored
     */
    public Box(T given_val){
        val = given_val;
    }
    /**
     * set the value stored to a new value
     * @param newVal value to replace the old one
     */
    public void set(T newVal){
        val = newVal;
    }
    /**
     * get the value stored in teh box
     * @return T val
     */

    public T get(){
        return val;
    }


    
}
