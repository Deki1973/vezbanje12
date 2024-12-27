package org.example;
import org.example.Geek;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Geek g1=new Geek("aditiya",1);
        Geek g2=new Geek("aditiya",1);


        HashMap<Geek,String> map=new HashMap<Geek,String>();
        map.put(g1,"JS");
        map.put(g2,"JS");
        System.out.println("g1 hashCode:"+g1.hashCode());
        System.out.println("g2 hashCode:"+g2.hashCode());
        for(Geek geek: map.keySet()){
            System.out.println(map.get(geek).toString());
        }
        if(g1.equals(g2)){
            System.out.println("true");

        }else{
            System.out.println("false");

        }
        System.out.println(map.get(g2).hashCode());
        System.out.println(map.get(g1).hashCode());






















    }
}
