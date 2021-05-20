# EXERCISES

***7.0*** Write a method that converts its String parameter so that letters are written in blocks five characters long. For example, consider the following two versions of the same sentence:
>Plain: This is how we would ordinarily write a sentence.  
Blocked: Thisi showw ewoul dordi naril ywrit easen tence.  

***7.1*** Design and implement a *Java Swing program* that lets the user type a document into a TextArea and then provides the following analysis of the document: the number of words in the document, the number of characters in the document, and the percentage of words that have more than six letters.

***7.2*** Design and write a Java Swing program that searches for single-digit numbers in a text and changes them to their corresponding words. For example, the string `“4 score and 7 years ago”` would be converted into `“four score and seven years ago”`.

EXERCISE 7.12 A palindrome is a string that is spelled the same way backward
and forward. For example, mom, dad, radar, 727 and able was i ere i saw elba are all
examples of palindromes. Write a Java Swing program that lets the user type in a
word or phrase and then determines whether the string is a palindrome.
EXERCISE 7.13 Write a maze program that uses a string to store a representa-
tion of the maze. Write a method that accepts a String parameter and prints a
two-dimensional representation of a maze. For example, the maze shown here,
where O marks the entrance and exit can be generated from the following string:

S t r i n g : XX XXXXXXXX XXX XXXX XX
O
XX XXXXXXX
X XXX XXX
X XX
XX
X XX XX XX
X
X
O
XXXXXXXX X
Sam Penn
14 Bridge St.
Hoboken, NJ 01881
XXX XX XX XXX
X
XXXXXXXX X
EXERCISE 7.14 Write a method that takes a delimited string to store a name
and address, from which you can print a mailing label. For example, if the string
contains “Sam Penn:14 Bridge St.:Hoboken, NJ 01881,” the method should print
the label shown in the margin.
EXERCISE 7.15 Design and implement a Java Swing program that plays Time
Bomb with the user. Here’s how the game works. The computer picks a secret
word and then prints one asterisk for each letter in the word: * * * * *. The user
guesses at the letters in the word. For every correct guess, an asterisk is replaced by
a
letter:
* e * * *. For every incorrect guess, the time bomb’s fuse grows shorter. When
the fuse disappears, after say, six incorrect guesses, the bomb explodes. Store the
secret words in a delimited string and invent your own representation for the time
bomb.
EXERCISE 7.16 Challenge: The global replace function is a string-processing
algorithm found in every word processor. Write a method that takes three String
arguments: a document, a target string, and a replacement string. The method
should replace every occurrence of the target string in the document with the re-
placement string. For example, if the document is “To be or not to be, that is the
question,” and the target string is “be,”, and the replacement string is “see,” the
result should be, “To see or not to see, that is the question.”
EXERCISE 7.17 Challenge: Design and implement a Java Swing Program that
plays the following game with the user. Let the user pick a letter between A and
Z. Then let the computer guess, the secret letter. For every guess the player has to
tell the computer whether it’s too high or too low. The computer should be able to
guess the letter within five guesses. Do you see why?CHAPTER 7 •
Exercises
335
EXERCISE 7.18 Challenge: A list is a sequential data structure. Design a List
class that uses a comma-delimited String—such as, “a,b,c,d,12,dog”—to imple-
ment a list. Implement the following methods for this class:

void addItem ( O b j e c t o ) ;
S t r i n g getItem ( int p o s i t i o n ) ;
String toString ( ) ;
void d e l e t e I t e m ( i n t p o s i t i o n ) ;
void d e l e t e I t e m ( S t r i n g item ) ;
i n t g e t P o s i t i o n ( S t r i n g item ) ;
S t r i n g getHead ( ) ;
List getTail ( ) ;
int length ( ) ;
//
Use
Object . toString ()
// First
// All
// Number
element
but
the
of
first
element
items
EXERCISE 7.19 Challenge: Use a delimited string to create a PhoneList class
with an instance method to insert names and phone numbers, and a method to
look up a phone number when a user provides a person’s name. Since your class
will take care of looking things up, you don’t have to worry about keeping the list
in alphabetical order. For example, the following string could be used as such a
directory:

mom:860 −192 −9876:: b i l l g :654 −0987 −1234:: mary l a n c e l o t :123 −842 −1100
EXERCISE 7.20 Design and implement an application that displays a multi-line
message in various fonts and sizes input by the user. Let the user choose from
among a fixed selection of fonts, sizes, and styles.