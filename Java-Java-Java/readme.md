EXERCISE 1.20 Define a Java class, called Patterns, modeled after OldMac-
Donald, that will print the following patterns of asterisks, one after the other
heading down the page:

∗∗∗∗∗
∗∗∗∗
∗∗∗
∗∗
∗
∗∗∗∗∗
∗
∗
∗
∗
∗
∗
∗∗∗∗∗
∗∗∗∗∗
∗ ∗ ∗
∗ ∗
∗ ∗ ∗
∗∗∗∗∗
EXERCISE 1.21 Write a Java class that prints your initials as block letters, as
shown in the example in the margin.
******
*
*
*
*
******
**
* *
* *
*
*
*
*
**
**
* *
* *
* * * *
*
*
*
*
*
*
*
*
*
EXERCISE 1.22 Challenge: Define a class that represents a Temperature ob-
ject. It should store the current temperature in an instance variable of type
double, and it should have two public methods, setTemp(double t), which
assigns t to the instance variable, and getTemp(), which returns the value of
the instance variable. Use the Riddle class as a model.
EXERCISE 1.23 Challenge: Define a class named TaxWhiz that computes the
sales tax for a purchase. It should store the current tax rate as an instance
variable. Following the model of the Riddle class, you can initialize the rate
using a TaxWhiz() method. This class should have one public method,
calcTax(double purchase), which returns a double, whose value is
purchases times the tax rate. For example, if the tax rate is 4 percent, 0.04, and
the purchase is $100, then calcTax() should return 4.0.