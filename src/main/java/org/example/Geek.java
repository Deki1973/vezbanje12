package org.example;


import java.io.*;
import java.util.*;

//https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/
public class Geek {

    String name;
    int id;

    public Geek(String name, int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public boolean equals(Object obj) {
        // proveravamo da li je parametar objekat
        if(this==obj)
            return true;
        // proveravamo da li je objekat null ili pripada istoj klasi
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        Geek geek=(Geek)obj;
        // poredimo content
        return (geek.name.equals(this.name) && geek.id==this.id);
    }

    @Override
    public int hashCode() {
        return this.id;
    }


}
