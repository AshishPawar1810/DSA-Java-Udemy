package Sorting;

import java.util.Arrays;
import java.util.Collections;

/*
Sorting in java present in two classes
1. Arrays.sort:
    a.Arrays of Primitive (int,char)
    b.Arrays of objects (String, Integer, Student)
    Arrays.sort allows only natural sorting means only in increasing order.
    while sorting with objects we need stable sort alorithms
    Stability in alorithms: while If you goes for object sort
    then it also take care other filds for sorting

2. Collections.sort:
    For Lists (ArrayList, LinkedList...)
 */
public class ArraysDotSort {

    public static void main(String[] args) {
        int arr[]={5,10,15,20,3,2,4};
        char carr[] = {'B','B','C','A','A'};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(carr);
        System.out.println(Arrays.toString(carr));

        //arrays.sort another version from range
        Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));

        //Primitive sorting in reverse order user Wrapper classes
        //wrpper classes(Integer,Charecter .. internaly implments comparable interface)
        Integer iarr[] ={1,2,3,4,5,6};
        Arrays.sort(iarr, Collections.reverseOrder());
        System.out.println(Arrays.toString(iarr));

    }
}
