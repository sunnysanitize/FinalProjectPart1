# **Java Conditional Statements**

## **Conditional Statements**

### **Why Conditional Statements?**
In programming, decision-making is essential for handling different scenarios and adapting to various inputs. When a program reaches a decision point with multiple possible paths, it evaluates specific conditions to choose the appropriate path. This is achieved through **conditional statements**, such as `if` and `else`. 

## **Conditional Statements in the Java Language**

### **1. `if` Statement**
Executes a block of code if the specified condition is true.

```java
public class IfExample {
    public static void main(String[] args) {
        int n = 5;
        if (n > 0) {
            System.out.println("Positive number");
        }
    }
}
```
An example of an if-else statement 

```java
int n = -5;
if (n > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Zero or negative number");
}
```
An example of an if-else statement

```java
int n = 0;
if (n > 0) {
    System.out.println("Positive number");
} else if (n < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Zero");
}
```
## **Nested Conditional Statements**

Nested conditional statements are used when multiple conditions must be evaluated before deciding which path the program should take. This involves placing one if statement inside another. It allows programmers to implement additional layers of decision-making.

```java
int n = 12;
if (n > 0) {
    if (n % 6 == 0) {
        System.out.println("Yippee");
    }
}
```

## **Compound Boolean Statements**

Compound conditional statements evaluate multiple conditions at once using logical operators such as 

&& (AND) 
|| (OR) 
! (NOT)

This method simplifies decision-making scenarios by combining conditions into a single line of code.

```java
int n = 12;
if (n > 0 && n % 6 == 0) {
    System.out.println("Yippee");
}
```
### **Java Shorthand Notation for Conditional Statements**

The ternary operator "**?**" : offers a shorthand way to write simple if-else statements. It follows the syntax:

```
condition ? valueIfTrue : valueIfFalse;
```

An example code 

```java
int n = 5;
String result = (n % 2 == 0) ? "Even" : "Odd";
System.out.println(result);  // Outputs "Odd" because 5 is not divisible by 2.
```

