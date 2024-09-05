# Memory
Heap and stack
# Packages
import < package name >
# Methods
```java
< access modifier > < return type > < method name > ( < parameters > ) {
code
}
```
# Scanner
```java
import java.util.Scanner;
---------
Scanner scanner = new Scanner (System.in);
int number = scanner.nextInt ();
```
# Task
1. In this folder create directories `src/com/hilel`  with class `Calculator.java`
2. `Calculator.java` should have a modes `add(1), subtract(2), multiply(3), devide(4)` every mode should be represented as a method
3. The program should work as follows:
    
    when launched asks mode in which it should run -> then asks for `a` and then `b` numbers 
   -> after `b` submitted it should show result
   
### Special
1. make calculator not stop after result was shown
2. make a method that prints countDown using recursion
```java
void countDown(int number){
    code
}
countDown(3)

prints 3 2 1 0

```
