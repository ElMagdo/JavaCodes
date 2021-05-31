# Exercises for Task 2

1. How many times do you have to roll a pair of dice before they come up snake eyes? You could do the experiment by rolling the dice by hand. Write a computer program that simulates the experiment. The program should report the number of rolls that it makes before the dice come up snake eyes.  
**Note**: “**Snake eyes**” means *that both dice show a value of 1*.

2. Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have? Write a program to find the answers and print out the results. It is possible that several integers in this range have the same, maximum number of divisors. Your program only has to print out one of them.  
You might need some hints about how to find a maximum value. The basic idea is to go through all the integers, keeping track of the largest number of divisors that you’ve seen so far. Also, keep track of the integer that had that number of divisors.  
Enhance the program to find the integer with largest number of divisors between 2 given numbers (lower bound and upper bound), between 1 and 10000 with the numbers inclusive.

3. Write a program that will evaluate simple expressions such as `17 + 3` and `3.14159 * 4.7`. The expressions are to be typed in by the user. The input always consist of a number, followed by an operator, followed by another number. The operators that are allowed are `+, -, *`, and `/`. Your program should read an expression, print its value, read another expression, print its value, and so on. The program should end when the user enters 0 as the first number on the line.

4. Write a program that reads one line of input text and breaks it up into words. The words should be output one per line. A word is defined to be a sequence of letters. Any characters in the input that are not letters should be discarded. For example, if the user inputs the line  
    `He said, "That’s not a good idea."`  
then the output of the program should be  
`He`  
`said`  
`that`  
`s`  
`not`  
`a`  
`good`  
`idea`  
An improved version of the program would list “that’s” as a single word. An apostrophe can be considered to be part of a word if there is a letter on each side of the apostrophe.  
To test whether a character is a letter, you might use `(ch >= ’a’ && ch <= ’z’) || (ch >= ’A’ && ch <= ’Z’)`. However, this only works in English and similar languages. A better choice is to call the standard function `Character.isLetter(ch)`, which returns a boolean value of `true` if `ch` is a letter and `false` if it is not. This works for any Unicode character.
