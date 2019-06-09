package basic;

/**
 * See DefaultArguments.kt, only one function can do the job
 * of having so many function overloads
 */
public class DeafaultArguments {

    public String foo(String name, int number, boolean toUpperCase) {
        return (toUpperCase ? name.toUpperCase() : name) + number;
    }
    public String foo(String name, int number) {
        return foo(name, number, false);
    }
    public String foo(String name, boolean toUpperCase) {
        return foo(name, 42, toUpperCase);
    }
    public String foo(String name) {
        return foo(name, 42);
    }

    public static void main(String[] args) {

    }

}


