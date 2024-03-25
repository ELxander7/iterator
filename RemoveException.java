package ru.itis.inf304.iterator;

public class RemoveException extends Exception{
    public RemoveException(){
        super("remove() can only be called after next()");
    }
}
