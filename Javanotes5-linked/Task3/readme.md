Exercises for Chapter 4
1. To “capitalize” a string means to change the first letter of each word in the string to upper
case (if it is not already upper case). For example, a capitalized version of “Now is the time
to act!” is “Now Is The Time To Act!”. Write a subroutine named printCapitalized
that will print a capitalized version of a string to standard output. The string to be printed
should be a parameter to the subroutine. Test your subroutine with a main() routine that
gets a line of input from the user and applies the subroutine to it.
Note that a letter is the first letter of a word if it is not immediately preceded in
the string by another letter. Recall that there is a standard boolean-valued function
Character.isLetter(char) that can be used to test whether its parameter is a letter.
There is another standard char-valued function, Character.toUpperCase(char), that
returns a capitalized version of the single character passed to it as a parameter. That is,
if the parameter is a letter, it returns the upper-case version. If the parameter is not a
letter, it just returns a copy of the parameter. (solution)
2. The hexadecimal digits are the ordinary, base-10 digits ’0’ through ’9’ plus the letters ’A’
through ’F’. In the hexadecimal system, these digits represent the values 0 through 15,
respectively. Write a function named hexValue that uses a switch statement to find the
hexadecimal value of a given character. The character is a parameter to the function, and
its hexadecimal value is the return value of the function. You should count lower case
letters ’a’ through ’f’ as having the same value as the corresponding upper case letters.
If the parameter is not one of the legal hexadecimal digits, return -1 as the value of the
function.
A hexadecimal integer is a sequence of hexadecimal digits, such as 34A7, FF8, 174204,
or FADE. If str is a string containing a hexadecimal integer, then the corresponding
base-10 integer can be computed as follows: (solution)
value = 0;
for ( i = 0; i < str.length(); i++ )
value = value*16 + hexValue( str.charAt(i) );
Of course, this is not valid if str contains any characters that are not hexadecimal digits.
Write a program that reads a string from the user. If all the characters in the string are
hexadecimal digits, print out the corresponding base-10 value. If not, print out an error
message.
3. Write a function that simulates rolling a pair of dice until the total on the dice comes up
to be a given number. The number that you are rolling for is a parameter to the function.
The number of times you have to roll the dice is the return value of the function. The
parameter should be one of the possible totals: 2, 3, . . . , 12. The function should throw
an IllegalArgumentException if this is not the case. Use your function in a program that
computes and prints the number of rolls it takes to get snake eyes. (Snake eyes means
that the total showing on the dice is 2.) (solution)
4. This exercise builds on Exercise 4.3. Every time you roll the dice repeatedly, trying to
get a given total, the number of rolls it takes can be different. The question naturally
arises, what’s the average number of rolls to get a given total? Write a function that
performs the experiment of rolling to get a given total 10000 times. The desired total is (solution)160
Exercises
a parameter to the subroutine. The average number of rolls is the return value. Each
individual experiment should be done by calling the function you wrote for Exercise 4.3.
Now, write a main program that will call your function once for each of the possible totals
(2, 3, ..., 12). It should make a table of the results, something like:
Total On Dice
-------------
2
3
.
.
Average Number of Rolls
-----------------------
35.8382
18.0607
.
.