# Install JDK
## Download JDK
Go to https://www.oracle.com/ua/java/technologies/downloads/#jdk24-windows and select one for your OS probably "x64 Compressed Archive"



## Jshell

go to the unpacked folder with your JDK. Useful commands:
* `cd "path"` brings you to the mentioned path
* `pwd` shows current location

Open jshell which is at `<jdk_location>/bin/jshell` and type `System.out.println("Hello world of Java");`

to exit type `/exit`

## Compile and run 

### Create Java class 
Create your work directory and create a file(with `nano`, `gedit`, `edit`, `notepad`) 
in subdirectory test1`HelloWorld.java` with the following content:
```java
package test1;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome " + args[0] + " to world of Java");
    }
}
```
Useful commands:
* `mkdir` creates a directory
* `&` at the end of command, makes the command run in background

### Compile Java class 
Create `target` folder and compile the class:
```shell
 <jdk_location>/bin/javac -d ./target ./test1/HelloWorld.java
```
Useful commands:
* `ls` lists contain of the folder `-R` flag recursively lists subdirectory's content

### Run your class
```shell
<jdk_location>/bin/java -cp ./target test1.HelloWorld "Your name"
```

# Task

## 1. Compile and Run
```java
package test1;

import javax.swing.*;

/**
 * A bare bones graphical version of Hello World.
 */
public class HelloJava {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        frame.add(label);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
```
note that the class name and the file name should be same, also take a look at the package
## 2. Play with Jshell
## 3. Read https://javascopes.com/java-primitives-3ba752e9/
