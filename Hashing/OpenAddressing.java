package Hashing;
/*
Simillar to chaining
but only diffrence is insert element at next avilable slot if previous is occupied
Its is cache friendly
1. Linear probing: means linarly search next empty slot to insert
2. double hashing are types
only can be done when
no of slots in Hash table > no of keys to be inserted
Open addressing will never insert another key in same slot

Double Hashing:
use two hash function
first is our original hash function
hash (key,i)=(h1+(key)+ih2(key))%m

m=7
h1(key) = key % 7
h2(key) = 6-(key % 6)


 */
public class OpenAddressing {


}
