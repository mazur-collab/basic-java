# Primitives and how to work with them
## Declare and Initialize
< type > < variable name > = < value >;
### Casting

```java
long a = 100;
byte b = (byte) a;
```

## Operators
### Arithmetical
`+ - / * %`
### Decrement/Increment postfix/prefix
`++ --`
### Logical
`|| && == != ! > < <= =>`
### Assignment
`= += -= *= /= %=`

## If else and ternary operator

```java
boolean condition = false;
if (condition) {
        System.out.println("this will not happen");
} else {
        System.out.println("this will get printed");
}

int result = condition ? 1 : 0;

```

## Switch 

```java
int no = 3
switch(no) {
    case 1:
        System.out.println("1");
    case 3:
        System.out.println("3");
    default:
        System.out.println("which one?");
}
```

# Task
1. go to https://gitlab.com/gregmazur/basic-java and fork the repository
2. `git clone https://gitlab.com/<your-name>/basic-java.git`
3. go to the `02_Primitives_operators_if_else` dir
4. `git checkout -b 02_Primitives_operators_if_else`
5. create a directory called `examples`
6. **Add files with examples of:**
   - **variable overloaded**
   - **variable casting**
   - **if/else** 
   - **ternary operator**
   - **switch**
    
Files should be ready to compile like: 
```java
package examples;

public class NameOfTheFile {
    public static void main( String[] args ) {
        //your code
    }
}
```

*NameOfTheFile should be changed

7. `git add <filename>` to every created file
8. `git status` this will show you added files
9. `git commit -m "my first commit"`
10. `git push origin 02_Primitives_operators_if_else`
11. Create merge request EX : https://gitlab.com/gregmazur/basic-java/-/merge_requests/1