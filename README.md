# **Java Conditional Statements**

This lesson introduces the fundamental concepts of conditional statements in Java, covering basic and advanced decision-making techniques, including nested conditions and compound boolean expressions.

---

## **2.1 Conditional Statements**

### **Why Conditional Statements?**
In programming, decision-making is essential for handling different scenarios and adapting to various inputs. When a program reaches a decision point with multiple possible paths, it evaluates specific conditions to choose the appropriate path. This is achieved through **conditional statements**, such as `if` and `else`. 

By using conditional statements, programmers can:
- Adapt programs to different inputs.
- Handle unexpected situations dynamically.
- Ensure that only the necessary set of instructions is executed.

### **Java Decision Making**
Java provides several types of conditional statements:

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
