package Hashing;

import java.util.HashSet;
import java.util.Iterator;

/*
Used to store set of only keys
It uses hash table to store this keys
uses hash function to store keys
supports add, remove, contains
Hashset data type alwyas should not be non premitive
like HashSet<String,List,> etc
add function add values and return trues
and if value already present then it will not add again
size()
remove()
isEmpty() : returns true if HashSet empty
clear() : clear the HashSet once call remove all element in it.

 */
public class HashSetInJava {

    public static void main(String[] args) {
        HashSet<String> h= new HashSet<>();
        h.add("gfg");
        h.add("courses");
        h.add("ids");

        System.out.println(h);
        System.out.println(h.contains("ids"));

        Iterator<String> itr= h.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()   +" ");
        }

        h.clear();
        System.out.println(h.size());
    }
}
