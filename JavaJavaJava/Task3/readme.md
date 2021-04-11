***3.0*** Write a Java application program called `TwelveDays` that prints the Christmas carol “Twelve Days of Christmas.” For this version, write a `void` method named `intro()` that takes a `single String` parameter that gives the day of the verse and prints the intro to the song. For example, `intro("first")` should print, “On the first day of Christmas my true love gave to me”. Then write methods `day1()`, `day2()`, and so on, each of which prints its version of the verse. Then write a `main()` method that calls the other methods to print the whole song.

***3.1*** Define a void method named `permute`, which takes `three String` parameters and prints out all possible arrangements of the three strings. Name your class, `Permutation3`. For example, if you called `permute("a", "b", "c")`, it would produce the following output: *abc, acb, bac, bca, cab, cba*, with each permutation on a separate line.

***3.2*** Define a class named `Donor` that has two instance variables, the donor’s `name` and `rating`, both of which are `Strings`. The name can be any string, but the rating should be one of the following values: “`high`,” “`medium`,” or “`none`". Write the following methods for this class: a constructor, `Donor(String,String)`, that allows you to set both the donor’s name and rating; and `access methods` to *set* and *get* both the name and rating of a donor.

***3.3*** Define a `CopyMonitor` class that solves the following problem. A company needs a monitor program to keep track of when a particular copy machine needs service. The device has two important (`boolean`) variables: its `toner level` (too low or not) and whether it `has printed` more than `100,000` pages since its last servicing (it either has or has not). The servicing rule that the company uses is that service is needed when either 100,000 pages have been printed or the toner is too low. Your program should contain a method that reports either “`service needed`” or “`service not needed`” based on the machine’s state. (Pretend that the machine has other methods that keep track of toner level and page count.)

***3.4*** Design and write an `OldMacdonald` class that sings several verses of “Old MacDonald Had a Farm.” Use methods to generalize the verses. For example, write a method named `eieio()` to “sing” the “E I E I O” part of the verse. Write another method with the signature `hadAnX(String s)`, which sings the “had a duck” part of the verse, and a method `withA(String sound)` to sing the “with a quack quack here” part of the verse. Test your class by writing a main() method.

EXERCISE 3.22 Consider the definition of the class C. Define a subclass of C
named B that overrides method m1() so that it returns the difference between m
and n instead of their sum.

public c l a s s C {
p r i v a t e i n t m;
private int n ;
public C( i n t mIn , i n t nIn ) {
m = mIn ;
n = nIn ;
}
public i n t m1 ( ) {
r e t u r n m+n ;
}
}