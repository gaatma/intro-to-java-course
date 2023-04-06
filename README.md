
# Introduction to Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![MIT License](https://img.shields.io/badge/LICENSE-MIT-green.svg?style=for-the-badge)][13]

This project will house exercises for the Introduction to Java course.

We'll be using edition 17 of Java - Java 17 LTS. 

This short guide describes:

- [How to install OpenJDK][2]
- [How to install and configure Visual Code Studio for Java Development][3]

## :coffee: Install OpenJDK

The Java Development Kit is platform specific. Follow the instructions described in each resource for your platform.

**Windows**

- [Installing OpenJDK with the MSI installer][4]

**Ubuntu Linux**

- [How to Install Java JDK 17 on Ubuntu 22.04][5]

**Mac OS**

- [Install OpenJDK 17 with Homebrew][6]

### :white_check_mark: Verify your installation

To verify that OpenJDK 17 has been successfully installed on your machine, open a terminal and run the following commands:

**Java Runtime Environment**

```bash
java -version
```

You should get an ouput similar to this one:

```bash
openjdk version "17.0.9" 2023-01-17 LTS
OpenJDK Runtime Environment (build 17.0.9+9-LTS)
OpenJDK 64-Bit Server VM (build 17.0.9+9-LTS, mixed mode)
```

**Java Compiler**

```bash
javac -version
```

You should get an ouput similar to this one:

```bash
javac 17.0.9
```

## :wrench: Visual Studio Code Configuration

In this course, we are going to use [Visual Studio Code][7] as our code editor.
However, if you are familiar with [IntelliJ IDEA][8], feel free to use it throughout this course.

### Editor Configuration

Download and install Visual Studio Code on your machine, then install the [Extension Pack for Java][9].

Follow [this Java starting guide][10] to:
- create a simple Java project
- create and edit a simple source code file inside the project
- run the program using the editor "Run|Debug" button (as can be seen on the [video][11])

:tada: When the program runs and prints a `Hello World`, your local environment is correctly set up for the course.

## :rocket: Get Started

Now that your development environment is setup correctly, [fork][12] this repository, then clone your fork locally.

In the coming weeks, you will be actively writing Java code, and pushing your code to your fork.

**Happy learning! :smile:**



[1]: https://www.java.com/en/download/help/whatis_java.html
[2]: #coffee-install-openjdk
[3]: #wrench-visual-studio-code-configuration
[4]: https://learn.microsoft.com/en-us/java/openjdk/install?source=recommendations#install-on-windows-via-msi
[5]: https://learn.microsoft.com/en-us/java/openjdk/install?source=recommendations#install-on-ubuntu
[6]: https://formulae.brew.sh/formula/openjdk@17
[7]: https://code.visualstudio.com/
[8]: https://www.jetbrains.com/idea/download/
[9]: https://code.visualstudio.com/docs/java/java-tutorial#_installing-extensions
[10]: https://code.visualstudio.com/docs/java/java-tutorial#_creating-a-source-code-file
[11]: https://code.visualstudio.com/docs/java/java-tutorial/run-debug.mp4
[12]: https://docs.github.com/en/get-started/quickstart/fork-a-repo
[13]: https://github.com/cbfacademy/intro-to-java-course/blob/main/LICENSE
=======
# Object-Oriented Programming
=======
# Working With Primitives


[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

<<<<<<< HEAD
The goal of these exercises is to practise OOP concepts:
- Encapsulation
- Inheritance
- Abstraction

For the exercises below, we've provided the starter project above.

## :pushpin: Classes & Objects

### Part 1

Inside the `cars` package, create a class called `Car` with the following members:
- `private String make`
- `private String model`
- `private String colour`
- `private int year`
- `public Car(String make, String model, String colour, int year)` - constructor that accepts parameters representing the make, model, colour and year of the car
- `public String getMake()` - returns the car make
- `public String getModel()` - returns the car model
- `public int getYear()` - returns the year the car was made
- `public String getColour()` - returns the colour of the car
- `public String setColour()` - sets the colour of the car
- `public String getDetails()` - returns the car details, including the make, model, colour and year

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `CarTest` tests.

In your terminal, ensure that you are in the `object-oriented-programming` folder, then run the following command:

```shell
./mvnw clean test -Dtest=CarTest
=======
The goal of this exercise is to familiarise ourselves with:
- [Strings](#pushpin-strings)
- [Operators](#pushpin-operators)
- [Arrays](#pushpin-arrays)

For this exercise, we've provided starter code in the `exercises/java-primitives/` directory. After opening your repo in your IDE, ensure you've navigated to this path in your terminal.

## :pushpin: Strings

For this section, open the `src/main/java/com/cbfacademy/strings/` directory. It contains a [Java program][4] with three methods to implement: `concatenate`, `areEqual` and `format`.

Using the [String Java documentation][6] as a guide, implement the methods in `App.java`. In each method, replace `throw new RuntimeException("Not implemented")` with your code.

### String Concatenation

Implement the `concatenate` method in such a way that it creates a new String by concatenating the provided parameters.

```java
public static String concatenate(String word1, String word2, String word3) {
    // TODO: Write code that concatenates the input parameters and returns the result
    throw new RuntimeException("Not implemented");
}
```

### String Comparison

Implement the `areEqual` method, which determines whether the two provided parameters are equal strings. The equality check should be case-sensitive (i.e. hello != HELLO)

```java
public static Boolean areEqual(String word1, String word2) {
    // TODO: Write code to determine whether the input parameters are equal strings
    throw new RuntimeException("Not implemented");
}
```

### String Formatting

Implement the `format` method, which returns a formatted string containing the provided parameters. The price value should be displayed with a pound (£) symbol and two decimal places.

```java
public static String format(String item, int quantity, double price) {
    // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]"
    throw new RuntimeException("Not implemented");
}
```

**Example**
```java
String lineItem = format("Apple iPhone 15 Pro", 47, 1199.99);

System.out.println(lineItem); // Output: Item: Apple iPhone 15 Pro. Price: £1199.99. Quantity: 47
```

#### :white_check_mark: Verify Your Implementation

We've created a [unit test suite][5] to verify your solution. To verify that your code works as expected, run the `AppTest` tests.

In your terminal, ensure that you are in the `java-primitives` folder.
Then run the following command in your terminal.

```shell
./mvnw clean test -Dtest=com.cbfacademy.strings.AppTest
>>>>>>> 9a73123 (Gifty Acquah primitives codes)
```

If you are on Windows, run this command instead:

<<<<<<< HEAD
```bat
mvnw.cmd clean test -Dtest=CarTest
```

Your implementation is correct when all tests pass.

### Part 2

Create a class called `Showroom` with the following members:
- `public List<Car> getCars()` - returns a list containing the following three `Car` objects:
  - a blue Volvo V40 from 2012
  - a red Porsche Panamera from 2009
  - a grey Audi A3 from 2018

In the `main` method of the `App` class, instantiate a `Showroom` object, call `getCars()` and print the details for each `Car` instance in the list.

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `ShowroomTest` tests.

In your terminal, run the following command:

```shell
./mvnw clean test -Dtest=ShowroomTest
```

If you are on Windows, run this command instead:

```bat
mvnw.cmd clean test -Dtest=ShowroomTest
```

Your implementation is correct when all tests pass.

## :pushpin: Inheritance

### Part 1

Inside the `accounts` package, create a class called `Account` with the following members:
- `public Account(int accountNumber, double balance)` - constructor that accepts parameters representing the new account number and starting balance
- `public double getBalance()` - returns the current account balance
- `public int getAccountNumber()` - returns the account number
- `public double deposit(double amount)` - deposits funds to the account and returns the new balance
- `public double withdraw(double requested)` - withdraws funds from the account and returns the requested amount or `0` if the account has an insufficient balance

#### Notes
- This account doesn't have an overdraft facility.
- The balance of an account may only be modified through the `deposit()` and `withdraw()` methods.
- Consider the necessary instance variables and the appropriate access modifiers to allow any sub-classes to access those values

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `AccountTest` tests.

In your terminal, run the following command:

```shell
./mvnw clean test -Dtest=AccountTest
```

If you are on Windows, run this command instead:

```bat
mvnw.cmd clean test -Dtest=AccountTest
```

Your implementation is correct when all tests pass.

### Part 2

Using the `Account` class as a base class, create two derived classes:

`SavingsAccount` with the following members, in addition to the attributes of the `Account` class:
- `public SavingsAccount(int accountNumber, double balance, double interestRate)` - constructor that accepts parameters representing the new account number, starting balance and interest rate
- `public void applyInterest()` applies interest to the account
- `public double getInterestRate()` - returns the current interest rate
- `public void setInterestRate()` - sets the interest rate

`CurrentAccount` with the following members, in addition to the attributes of the `Account` class:
- `public CurrentAccount(int accountNumber, double balance, double overdraftLimit)` - constructor that accepts parameters representing the new account number, starting balance and overdraft limit
- `public double getOverdraftLimit()` - returns the current overdraft limit
- `public void setOverdraftLimit()` - sets the overdraft limit

#### Notes
Ensure that you have overridden methods of the `Account` class where necessary in the derived classes.

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `CurrentAccountTest` and `SavingsAccountTest` tests.

In your terminal, run the following command:

```shell
./mvnw clean test -Dtest=CurrentAccountTest,SavingsAccountTest
```

If you are on Windows, run this command instead:

```bat
mvnw.cmd clean test -Dtest=CurrentAccountTest,SavingsAccountTest
```

Your implementation is correct when all tests pass.

### Stretch Goal

If you have extra time in the session, or wish to experiment further, create a `Bank` class to manage accounts. Consider the following ideas — you may choose to implement some, all or come up with your own:
- storing a internal list of accounts. Remember that accounts in the list could be instances of the `Account` class, the `SavingsAccount` class, or the `CurrentAccount` class.
- opening a new account, given a type and balance.
- getting a list of account numbers held by the bank
- getting an account, given an account number
- closing an account, given an account number
- displaying a report of all accounts held by the bank
- paying a dividend to all accounts held by the bank
- applying interest to all savings accounts
- contacting all current account holders if their account is in overdraft.

Update `App.java` to create a bank instance and then execute your bank's operations

#### Notes
There are no tests for the `Bank` class, so it's up to you how to implement it.

## :pushpin: Abstraction

In this exercise you will develop a class hierarchy of shapes and write a program that computes the amount of paint needed to paint different objects. 
The hierarchy will consist of a parent class `Shape` with three derived classes - `Sphere`, `Rectangle`, and `Cylinder`.

For the purposes of this exercise, the only attribute a shape will have is a `name` and the method of interest will be one that computes the area of the shape (surface area in the case of three-dimensional shapes).

### Part 1

Inside the `shapes` package, create an abstract class `Shape` with the following members:
- `abstract double getArea()` - returns the area of the shape
- `String getName()` - returns the name of the shape

In the same package, create a concrete class `Sphere` that extends `Shape`:
- `Sphere(double radius)` - constructor
- `double getArea()` - overrides the base method. The value is given by the formula (`4` * `𝛑` * (`radius`<sup>2</sup>))

In the same package, create a concrete class `Rectangle` that extends `Shape`:
- `Rectangle(double length, double width)` - constructor
- `double getArea()` - overrides the base method. The value is given by the formula (`length` * `width`)

In the same package, create a concrete class `Cylinder` that extends `Shape`:
- `Cylinder(double radius, double height)` - constructor
- `double getArea()` - overrides the base method. The value is given by the formula (`height` * `𝛑` * (`radius`<sup>2</sup>)).

#### Notes
Consider the appropriate visibility of all constructors, methods and instance variables

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `ShapeTest` tests.

In your terminal, run the following command:

```shell
./mvnw clean test -Dtest=ShapeTest
```

If you are on Windows, run this command instead:

```bat
mvnw.cmd clean test -Dtest=ShapeTest
```

Your implementation is correct when all tests pass.

### Part 2

Inside the `shapes` package, create a class `Paint` with the following members:
- `Paint(double coverage)` - constructor that accepts a parameter representing the number of square feet per gallon this paint can cover
- `getAmount(Shape shape)` - returns the amount of paint (measured in gallons) needed to paint a given shape

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `PaintTest` tests.

In your terminal, run the following command:

```shell
./mvnw clean test -Dtest=PaintTest
```

If you are on Windows, run this command instead:

```bat
mvnw.cmd clean test -Dtest=PaintTest
```

Your implementation is correct when all tests pass.

### Stretch Goal

If you have extra time in the session, or wish to experiment further, create a **program** in the same package that computes the amount of paint needed to paint various shapes, e.g.:
- a rectangular deck of length `35` and width `20` 
- a ball of radius `15`
- a tank of radius `10` and height `30`.

Consider the following ideas:
- print the amount of paint needed for each item
- print the overall amount of paint needed to the screen

[1]: https://docs.oracle.com/javase/17/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/


```shell
mvnw.cmd clean test -Dtest=com.cbfacademy.strings.AppTest
```

The `-Dtest=com.cbfacademy.strings.AppTest` flag sets the specific test suite to be executed. If you want to run all the unit tests for the session, simply omit that option.

#### Test Results

Your implementation is correct when all tests pass:

```shell
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ String Exercises - 0.072s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[1] Java, Java, true - 0.018s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[2] HTML, HTML, true - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[3] beta, beta, true - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[4] camel-case, camel_case, false - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[5] WET, wet, false - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[6] dry, DRY, false - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[1] Red, Green, Blue, RedGreenBlue - 0.005s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[2] one, two, three, onetwothree - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[3] QUICK, BROWN, FOX, QUICKBROWNFOX - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[4] www., google., com, www.google.com - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[5] Intro , to , Java, Intro to Java - 0s
[INFO] │  ├─ ✔ format() method returns formatted string[1] Laptop, 27, 1999.99 - 0.008s
[INFO] │  ├─ ✔ format() method returns formatted string[2] Mobile phone, 200, 999.99 - 0.001s
[INFO] │  ├─ ✔ format() method returns formatted string[3] Tablet, 85, 1199.99 - 0s
[INFO] │  ├─ ✔ format() method returns formatted string[4] Charger, 467, 29.99 - 0s
[INFO] │  └─ ✔ format() method returns formatted string[5] USB cable, 883, 8.99 - 0s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 16, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.098 s
[INFO] Finished at: 2023-10-26T02:34:16+01:00
[INFO] ------------------------------------------------------------------------
```

## :pushpin: Operators

For this section, open the `src/main/java/com/cbfacademy/operators/` directory. It contains a [Java program][4] with a number of methods to implement.

Using the [Java Operators documentation][7] as a guide, implement the methods in `App.java`. In each method, replace `throw new RuntimeException("Not implemented")` with your code.

### Arithmetic Operators

Implement the methods in `App.java` to add, subtract and multiply decimal numbers. In each method, replace `throw new RuntimeException("Not implemented")` with your code:

- `public static double add(double operand1, double operand2)`
- `public static double subtract(double operand1, double operand2)`
- `public static double multiply(double operand1, double operand2)`

### Relational Operators

Implement the methods in `App.java` to compare equality and evaluate the largest and smallest given decimal numbers. In each method, replace `throw new RuntimeException("Not implemented")` with your code:

- `public static Boolean areEqual(double operand1, double operand2)`
- `public static Boolean isLessThan(double operand1, double operand2)`
- `public static Boolean isMoreThan(double operand1, double operand2)`

### Unary Operators

What do the following expressions evaluate to:

```java
int number1 = 12;
int number2 = 12;

System.out.println(number1++);
System.out.println(++number2);
```

**Why is that?**

[1]: https://docs.oracle.com/javase/17/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/
[4]: exercises/java-primitives/src/main/java/com/cbfacademy/strings/App.java
[5]: exercises/java-primitives/src/test/java/com/cbfacademy/strings/AppTest.java
[6]: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
[7]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

