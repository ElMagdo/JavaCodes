***6.0*** Write three different loops — a `for` loop, a `while` loop, and a `do-while` loop — to print all the multiples of 10, including 0, up to and including 1,000.

***6.1*** Write three different loops — a `for` loop, a `while` loop, and a `do-while` loop — to print the following sequence of numbers: `45, 36, 27, 18, 9, 0, −9, −18, −27, −36, −45`.

***6.2*** Write three different loops — a `for` loop, a `while` loop, and a `do-while` loop — to print the following ski-jump design:

`#`  
`# #`  
`# # #`  
`# # # #`  
`# # # # #`  
`# # # # # #`  
`# # # # # # #`

***6.3*** Write a method that is passed a single parameter, `N`, and displays all the *even numbers from 1 to N*.

***6.4*** Write a method that is passed a single parameter, `N`, that prints all the *odd numbers from 1 to N*.

***6.5*** Write a method that is passed a single parameter, `N`, that prints all the *numbers divisible by 10 from N down to 1*.

***6.6*** Write a method that is passed two parameters — a `char Ch` and an `int N` — and *prints a string of N Chs*.

***6.7*** Write a method that uses a nested for loop to print the following multiplication table:

       1 2 3 4 5 6 7 8 9
     1 1
     2 2 4 
     3 3 6 9
     4 4 8 12 16
     5 5 10 15 20 25
     6 6 12 18 24 30 36
     7 7 14 21 28 35 42 49
     8 8 16 24 32 40 48 56 64
     9 9 18 27 36 45 54 63 72 81

***6.8*** Write a method that uses nested for loops to print the patterns that follow. Your method should use the following statement to print the patterns:  
`System.out.print(’#’)`.

    # # # # # # # #         # # # # # # # #         # # # # # # # #         # # # # # # # #
      # # # # # # #         # # # # # # #             #         #                       #
        # # # # # #         # # # # # #                 #     #                       #
          # # # # #         # # # # #                     # #                       #
            # # # #         # # # #                       # #                     #
              # # #         # # #                       #     #                 #
                # #         # #                       #         #             #
                  #         #                       # # # # # # # #         # # # # # # # #


***6.9*** Write a program that asks the user for the number of rows and the number of columns in a box of asterisks. Then use nested loops to generate the box.

***6.10*** Write a Java application that lets the user input a sequence of consecutive numbers. In other words, the program should let the user keep entering numbers as long as the current number is one smaller than the previous number.

EXERCISE 6.20 Write a Java application that lets the user input a sequence of
integers terminated by any negative value. The program should then report the
largest and smallest values that were entered.

***6.12*** How many guesses does it take to guess a secret number between 1 and N? For example, I’m thinking of a number between 1 and 100. I’ll tell you whether your guess is *too high or too low*. Obviously, an intelligent first guess would be 50. If that’s too low, an intelligent second guess would be 75. And so on. If we continue to divide the range in half, we’ll eventually get down to one number. Because you can divide 100 seven times (50, 25, 12, 6, 3, 1, 0), it will take *at most seven guesses* to guess a number between 1 and 100. Write a **Java Swing program** that lets the user *input a positive integer*, N, and then *reports* how many guesses it would take to guess a number between 1 and N.

EXERCISE 6.22 Suppose you determine that the fire extinguisher in your
kitchen loses X percent of its foam every day. How long before it drops below
a certain threshold (Y percent), at which point it is no longer serviceable? Write a
Java Swing program that lets the user input the values X and Y and then reports
how many weeks the fire extinguisher will last.
EXERCISE 6.23 Leibnitz’s method for computing π is based on the following
convergent series:
π
1
1
1
= 1 − + − + ···
4
3
5
7
How many iterations does it take to compute π to a value between 3.141 and 3.142
using this series? Write a Java program to find out.
EXERCISE 6.24 Newton’s method for calculating the square root of N starts by
making a (nonzero) guess at the square root. It then uses the original guess to
calculate a new guess, according to the following formula:

guess = ( ( N / guess ) + guess ) / 2 ;
No matter how wild the original guess is, if we repeat this calculation, the algo-
rithm will eventually find the square root. Write a square root method based on
this algorithm. Then write a program to determine how many guesses are required
to find the square roots of different numbers. Uses Math.sqrt() to determine
when to terminate the guessing.
EXERCISE 6.25 Your employer is developing encryption software and wants
you to develop a Java Swing Program that will display all of the primes less than
N, where N is a number to be entered by the user. In addition to displaying the
primes themselves, provide a count of how many there are.
EXERCISE 6.26 Your little sister asks you to help her with her multiplication
and you decide to write a Java application that tests her skills. The program will
let her input a starting number, such as 5. It will generate multiplication problems
ranging from from 5 × 1 to 5 × 12. For each problem she will be prompted to enter
the correct answer. The program should check her answer and should not let
her advance to the next question until the correct answer is given to the current
question.CHAPTER 6 •
Exercises
295
EXERCISE 6.27 Write an application that prompts the user for four values and
draws corresponding bar graphs using an ASCII character. For example, if the
user entered 15, 12, 9, and 4, the program would draw

∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗
∗∗∗∗∗∗∗∗∗∗∗∗
∗∗∗∗∗∗∗∗∗
∗∗∗∗
EXERCISE 6.28 Revise the application in the previous problem so that the bar
charts are displayed vertically. For example, if the user inputs 5, 2, 3, and 4, the
program should display

∗∗
∗∗
∗∗
∗∗
∗∗ ∗∗
∗∗ ∗∗ ∗∗ ∗∗
∗∗ ∗∗ ∗∗ ∗∗
−−−−−−−−−−−−−
EXERCISE 6.29 The Fibonacci sequence (named after the Italian mathematician
Leonardo of Pisa, ca. 1200) consists of the numbers 0, 1, 1, 2, 3, 5, 8, 13, . . . in which
each number (except for the first two) is the sum of the two preceding numbers.
Write a method fibonacci(N) that prints the first N Fibonacci numbers.
EXERCISE 6.30 The Nuclear Regulatory Agency wants you to write a program
that will help determine how long certain radioactive substances will take to de-
cay. The program should let the user input two values: a string giving the sub-
stance’s name and its half-life in years. (A substance’s half-life is the number of
years required for the disintegration of half of its atoms.) The program should re-
port how many years it will take before there is less than 2 percent of the original
number of atoms remaining.
EXERCISE 6.31 Modify the CarLoan program so that it calculates a user’s car
payments for loans of different interest rates and different loan periods. Let the
user input the amount of the loan. Have the program output a table of monthly
payment schedules.