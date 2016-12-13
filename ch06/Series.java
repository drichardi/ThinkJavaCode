/**
 * Examples from Chapter 6.
 */
public class Series {

    //standard void method
    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    //value method, must do something with the return value
    //Compared to void methods, value methods differ in two ways
    //They declare the type of the return value (the return type)
    //They use at least one return statement to provide a return value
    
    //takes a double as a parameter and returns the area of a circle with a radius
    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius; //temporary variables make debugging easier, especially stepping through
        return result; //return immediately from this method and use the following expression as the return value
    }
    //same function written more concisely
    //note return expression must match declared return type
    public static double calculateArea2(double radius) {
        return Math.PI * radius * radius;
    }
    //multiple return statements, one in each branch of a conditional
    //only one will be executed 
    //code that cannot be executed is called dead code
    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
        System.out.println("This line is dead code.");
    }
    public static double absoluteValue(double x) {
        if(x < 0) {
            return -x; 
        } else if(x> 0) {
            return x;
        }
        //syntax error - every possible path must reach a return statement
        //no return path for x == 0 -error: missing return statement
        
    //Writing Methods
    //Incremental Development
        //Start with a working program and make small, incremental changes.
        //At any point, if there is an error, you will know where to look.
        
        //Use variables to hold intermediate values so you can check them,
        //either with print statements or by using a debugger.
        
        //Once the program is working, you can consolidate multiple statements into
        //compound expressions (but only if it does not make the program more difficult 
        //to read).
        
        //Distance Formula - distance = sqrt((x2 - x1)^2 + (y2 - y1)^2))
        //what are inputs? -- parameters
        //what is output? -- return value
        
        //use to make 'stub' contains method signature and a return statement
        public static double distance
               (double x1, double y1, double x2, double y2) {
            return 0.0; //placeholder needed for program to compile.
        }
        //Good idea to think about testing before making methods
        //in main double dist = distance(1.0,2.0,4.0,6.0);
        //Horizontal distance is 3.0 and vertical 4.0, answer 5.0 (3,4,5) triangle
        //helpful to know right answer
        
        
        
    //first step - find differences of x2-x1 and y2-y1
        //store in temp variables
    public static double distance
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        //remove when finished called "scaffolding"
        System.out.println("dx is " + dx); //should be 3.0
        System.out.println("dy is " + dy); //should be 4.0
        return 0.0;
    }
    //next step to square distances
    public static double distance2
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared); //should get 25.0
        return 0.0;
    }
    //finally sqrt to get answer and return result
    public static double distance3
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

        //METHOD COMPOSITION
    public static double circleArea
            (double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    public static double calculateArea
            (double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }

    /**
     * Tests whether x is a single digit integer.
     *
     * @param x the integer to test
     * @return true if x has one digit, false otherwise
     */
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSingleDigit2(int x) {
        return x > -10 && x < 10;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        countup(3);
        System.out.println("Have a nice day.");

        System.out.println("calculateArea");
        System.out.println(calculateArea(3.0));

        System.out.println("calculateArea2");
        System.out.println(calculateArea2(3.0));

        System.out.println("circleArea");
        System.out.println(circleArea(1.0, 2.0, 4.0, 6.0));

        System.out.println("calculateArea with 4 doubles");
        System.out.println(calculateArea(1.0, 2.0, 4.0, 6.0));

        System.out.println("absolute value");
        System.out.println(absoluteValue(-2));

        System.out.println("distance");
        System.out.println(distance(1.0, 2.0, 4.0, 6.0));

        System.out.println("distance2");
        System.out.println(distance2(1.0, 2.0, 4.0, 6.0));

        System.out.println("distance3");
        System.out.println(distance3(1.0, 2.0, 4.0, 6.0));

        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit2(17);

        int z = 9;
        if (isSingleDigit(z)) {
            System.out.println("z is small");
        } else {
            System.out.println("z is big");
        }

        System.out.println("factorial");
        System.out.println(factorial(3));

        System.out.println("fibonacci");
        System.out.println(fibonacci(3));
    }

}
