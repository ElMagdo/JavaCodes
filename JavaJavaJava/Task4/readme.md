***4.0*** Design and implement a GUI that has a `JButton`, a `JTextField`, and a `JLabel` and then uses the `toString()` method to display each object’s string representation.

***4.1*** The JButton class inherits a setText(String s) from its AbstractButton() superclass. Using that method, design and implement a GUI that has a `single button` labeled initially, “`The Doctor is out`.” Each time the button is clicked, it should toggle its label to, “`The Doctor is in`” and vice versa.

***4.2*** Design and implement a GUI that contains `two JButtons`, initially labeled, “`Me first!`” and “`Me next!`” Each time the user clicks either button, the labels on both buttons should be exchanged.  
(**Hint: You don’t need an if-else statement for this problem**.)

***4.3*** Design and implement a GUI so that it contains `three JButtons`, initially labeled “`First`,” “`Second`,” and “`Third`.” Each time the user clicks one of the buttons, the labels on the buttons should be rotated. Second should get first’s label, third should get second’s, and first should get third’s label.

***4.4*** Design and implement a GUI that contains a `JTextField` and `two JButtons`, initially labeled “`Left`” and “`Right`.” Each time the user clicks a button, display its label in the JTextField. A JButton()’s label can be gotten with the `getText()` method.

***4.5*** You can change the size of a JFrame by using the `setSize(int h, int v)` method, where `h` and `v` give its horizontal and vertical dimensions pixels. Write a GUI application that contains two JButtons, labeled “`Big`” and “`Small`.” Whenever the user clicks on small, set the JFrame’s dimensions to `200 × 100`, and whenever the user clicks on big, set the dimensions to `300 × 200`.  
Add a another button so that it uses a single button whose label is toggled appropriately each time it is clicked. Obviously, when the JButton is labeled “Big,” clicking it should give the JFrame its big dimensions.

***4.6*** Design and write a Java GUI application that allows the user to change the JFrame’s `background color` to one of `three choices`, indicated by `buttons`. Like all other Java Components, JFrame’s have an associated background color, which can be set by the following commands:  
`setBackground(Color.red);`  
`setBackground(Color.yellow);`  
The setBackground() method is defined in the `Component class`, and 13 primary colors — black, blue, cyan, darkGray, gray, green, lightGray, magenta, orange, pink, red, white, yellow — are defined in the `java.awt.Color` class.