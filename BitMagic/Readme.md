Seven type of bitwise operator 
Represent or deal with binary number
1.Bitwise And : &
x + y = 1 only when x and y are 1
2.Bitwise OR : |
x + y = 0 only both x and y are 0
3.Bitwise XOR : ^
x and y value is same then gives 0 as o/p
4.left shift : << shift 32 bit binary number to left if applyed
        eg. 0000.000011
        is a binary number of 2 = 011
        need to shift  left with one digit
        x << 1 = 0000.0000110
        first digits were removed from 32 bits
        xx0000
5.Right Shift >>
        Two types
        1. Signed Right :
            try to make number as positive if it is already positive
        2. Unsiged Right
        last digits were removed from 32 bits
        0000xx
6. Not : ~

35.Representation of negative number
-Range of Number is -2^n-1 to 2^n-1
-Negative number represented using 2's complement form
        -Revert binary number eg. if 1 is there make it 0
        -Add one at last of it.
