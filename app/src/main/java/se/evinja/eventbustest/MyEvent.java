package se.evinja.eventbustest;

public class MyEvent {
    private String myString;

    public MyEvent(String str){
        myString = str;
    }

    public String get(){
        return myString;
    }

}
