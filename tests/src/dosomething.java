public class DoSomething {
    public static void main(String[] args) throws Exception {
        int x = 3;
        String name = "Josh";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        // This is a comment.

        // Basic loops
        while (x > 12){
            x = x - 1;
        }

        for (x = 0; x < 10; x = x + 1){
            System.out.println("x is now " + x);
        }

        // Conditionals
        if (x == 10){
            System.out.println("x must be 10.");
        } else{
            System.out.println("x isn't 10.");
        }
        if ((x < 3) & (name.equals("Josh"))){
            System.out.println("Hello!");
        }
        System.out.println("This line returns no matter what.\n");

        loopy();
    }
    
    public static void loopy(){
            int x = 1;
            System.out.println("Before the loop");
            while (x < 4){
                System.out.println("In the loop");                  // While Loop
                System.out.println("Value of x is " + x);
                x = x + 1;
            }
            System.out.println("This is after the loop");
        }
    }
