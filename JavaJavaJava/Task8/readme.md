EXERCISE 8.7 Design and write a subclass of JTextField called Integer-
Field that is used for inputting integers but behaves in all other respects like a
JTextField. Give the subclass a public method called getInteger().
EXERCISE 8.8 Implement a method that uses the following variation of the Cae-
sar cipher. The method should take two parameters, a String and an int N. The
result should be a String in which the first letter is shifted by N, the second by
N + 1, the third by N + 2, and so on. For example, given the string “Hello,” and an
initial shift of 1, your method should return “Igopt.”
Write a method that converts its String parameter so that letters are written in
blocks five characters long.
EXERCISE 8.9 Design and implement an GUI that lets the user type a document
into a TextArea and then provides the following analysis of the document: the
number of words in the document, the number of characters in the document, and
the percentage of words that have more than six letters.
EXERCISE 8.10 Design and implement a Cipher subclass to implement the fol-
lowing substitution cipher: Each letter in the alphabet is replaced with a letter from
the opposite end of the alphabet: a is replaced with z, b with y, and so forth.
EXERCISE 8.11 One way to design a substitution alphabet for a cipher is to use a
keyword to construct the alphabet. For example, suppose the keyword is “zebra.”
You place the keyword at the beginning of the alphabet, and then fill out the other
21 slots with remaining letters, giving the following alphabet:

Cipher a l p h a b e t :
Plain alphabet :
zebracdfghijklmnopqstuvwxy
abcdefghijklmnopqrstuvwxyz
Design and implement an Alphabet class for constructing these kinds of sub-
stitution alphabets. It should have a single public method that takes a keyword
String as an argument and returns an alphabet string. Note that an alphabet
cannot contain duplicate letters, so repeated letters in a keyword like “xylophone”
would have to be removed.
EXERCISE 8.12 Design and write a Cipher subclass for a substitution cipher
that uses an alphabet from the Alphabet class created in the previous exercise.
EXERCISE 8.13 Challenge: Find a partner and concoct your own encryption
scheme. Then work separately with one partner writing encode() and the other
writing decode(). Test to see that a message can be encoded and then decoded
to yield the original message.
EXERCISE 8.14 Design a TwoPlayerGame subclass called Multiplication-
Game. The rules of this game are that the game generates a random multiplication
problem using numbers between 1 and 10, and the players, taking turns, try to
provide the answer to the problem. The game ends when a wrong answer is given.
The winner is the player who did not give a wrong answer.
EXERCISE 8.15 Design a class called MultiplicationPlayer that plays the
multiplication game described in the previous exercise. This class should imple-
ment the IPlayer interface.
EXERCISE 8.16 Design a TwoPlayerGame subclass called RockPaperScis-
sors. The rules of this game are that each player, at the same time, picks either a
rock, a paper, or a scissors. For each round, the rock beats the scissors, the scissors
beats the paper, and the paper beats the rock. Ties are allowed. The game is won
in a best out of three fashion when one of the players wins two rounds.
EXERCISE 8.17 Design a class called RockPaperScissorsPlayer that plays
the the game described in the previous exercise. This class should implement the
IPlayer interface.