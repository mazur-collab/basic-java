# Install JDK
## Download JDK
Go to https://www.oracle.com/java/technologies/downloads/#jdk17-linux and select one for your OS

### To bypass registration
```shell
wget https://download.oracle.com/java/17/latest/jdk-17_linux-aarch64_bin.tar.gz
wget https://download.oracle.com/java/17/latest/jdk-17_linux-aarch64_bin.rpm
wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.tar.gz
wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.deb
wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm
wget https://download.oracle.com/java/17/latest/jdk-17_macos-aarch64_bin.tar.gz
wget https://download.oracle.com/java/17/latest/jdk-17_macos-aarch64_bin.dmg
wget https://download.oracle.com/java/17/latest/jdk-17_macos-x64_bin.tar.gz
wget https://download.oracle.com/java/17/latest/jdk-17_macos-x64_bin.dmg
wget https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.zip
wget https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe
wget https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.msi
```

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

# Prmitives 
|Type	|Size (bits)	|Minimum	|Maximum	|Example|
| ----- |:-------------:|:---------:|:---------:|:-----:|
|byte	|8	|-2<sup>7</sup>|	2<sup>7</sup>– 1|	byte b = 100;|
|short	|16	|-2<sup>15</sup>|	2<sup>15</sup>– 1|	short s = 30_000;|
|int	|32	|-2<sup>31</sup>|	2<sup>31</sup>– 1|	int i = 100_000_000;|
|long	|64	|-2<sup>63</sup>|	2<sup>63</sup>– 1|	long l = 100_000_000_000_000;|
|float	|32	|-2<sup>-149</sup>|	(2-2<sup>-23</sup>)·2<sup>127</sup>|	float f = 1.456f;|
|double	|64	|-2<sup>-1074</sup>|	(2-2<sup>-52</sup>)·2<sup>1023</sup>|	double f = 1.456789012345678;|
|char	|16	|0	|2<sup>16</sup>– 1|	char c = ‘c';|
|boolean|	1|	–|	–|	boolean b = true;|

# Task

## 1. Compile and Run
```java
package test2;

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
## 4. Register in Gitlab
## 5. Install git
https://git-scm.com/downloads