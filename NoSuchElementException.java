package ru.itis.inf304.iterator;

public class NoSuchElementException extends Exception{
    public NoSuchElementException(){
        super("There is not such element");
    }
}
